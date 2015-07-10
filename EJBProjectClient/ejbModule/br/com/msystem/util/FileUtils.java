package br.com.msystem.util;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import br.com.msystem.exception.SystemException;

public class FileUtils {

	private static String imagemPath = "/MSystem/imagens/champion";
	private static String imagemURL = "http://www.magnumsa.com.br/imagens/";

	public static InputStream buscarImagem(String fileName) {
		InputStream is;
		File file = new File(new File(imagemPath), fileName + ".jpg");
		try {
			//busca imagem no diretorio
			is = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			try {
				//busca imagem no site
				buscarImagemSite(fileName);
				is = new FileInputStream(file);
			} catch (SystemException e1) {
				//cria stream e devolve
				return criarImagem(fileName, 240);
			} catch (FileNotFoundException e2) {
				throw new SystemException(e2.getMessage(), e2);
			}
		}
		return is;
	}

	public static InputStream buscarThumbnail(String fileName) {
		InputStream is;
		File file = new File(new File(new File(imagemPath), "thumbnail"),
				fileName + ".jpg");
		try {
			is = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			try {
				return gerarThumbnail(fileName);
			} catch (FileNotFoundException e1) {
				throw new SystemException(e1.getMessage(), e1);
			}
		}
		return is;
	}

	private static InputStream gerarThumbnail(String fileName) throws FileNotFoundException {
		File imagemFile = new File(new File(imagemPath), fileName + ".jpg");
		File thumbnailFile = new File(new File(new File(imagemPath), "thumbnail"), fileName + ".jpg");

		if (imagemFile.exists()) {
			redimensionarImagem(imagemFile, thumbnailFile, 120);
			return new FileInputStream(thumbnailFile);
		} else {
			return criarImagem(fileName, 120);
		}
	}

	private static void buscarImagemSite(String fileName) {
		try {
			File imageFile = new File(new File(imagemPath), fileName + ".jpg");
			URL url = new URL(
					imagemURL + fileName + ".jpg");
			InputStream in = url.openStream();

			FileOutputStream out = new FileOutputStream(imageFile);

			byte[] buf = new byte[1024];
			int n = 0;
			while (-1 != (n = in.read(buf))) {
				out.write(buf, 0, n);
			}
			out.close();
			in.close();
			
			redimensionarLarguraImagem(imageFile, 400);

		} catch (MalformedURLException e1) {
			throw new SystemException (e1.getMessage(), e1);
		} catch (IOException e) {
			throw new SystemException(e.getMessage(), e);
		}
	}

	private static void redimensionarLarguraImagem(File imageFile, int height) {
		redimensionarImagem(imageFile, imageFile, height);
	}

	private static void redimensionarImagem(File fileOrigem, File fileDestino, int height) {
		try {
			BufferedImage imagem = ImageIO.read(fileOrigem);
			int new_h = height;
			int new_w = (int) Math.floor( (double)imagem.getWidth() / ((double)imagem.getHeight() / (double)new_h));

			BufferedImage new_img = new BufferedImage(new_w, new_h,
					BufferedImage.TYPE_INT_RGB);
			Graphics2D g = new_img.createGraphics();

			g.drawImage(imagem, 0, 0, new_w, new_h, null);
			ImageIO.write(new_img, "JPG", fileDestino);
		} catch (IOException e) {
			throw new SystemException(e.getMessage(), e);
		}
	}

	private static InputStream criarImagem(String fileName, int height) {
//		File imagemFile = new File(new File(imagemPath), fileName + ".jpg");
//		File thumbnailFile = new File(new File(new File(imagemPath), "thumbnail"), fileName + ".jpg");
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();

		BufferedImage image = new BufferedImage(height, height, BufferedImage.TYPE_INT_RGB);

		Graphics g = image.getGraphics();
		g.setFont(g.getFont().deriveFont(20f));
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, height, height);
		g.setColor(Color.BLACK);
		g.drawString(fileName, 10, 50);
		g.dispose();

		try {
			ImageIO.write(image, "jpg", out);
		} catch (IOException e) {
			throw new SystemException(e.getMessage(), e);
		}
		
		return new ByteArrayInputStream(out.toByteArray());
	}
}
