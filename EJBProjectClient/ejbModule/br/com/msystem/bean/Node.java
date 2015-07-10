package br.com.msystem.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Node implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8304213552599792594L;
	private int key;
	private String title;
	private List<Node> children;

	public Node() {
		children = new ArrayList<Node>();
	}

	public Node(int key, String title) {
		this();
		this.key = key;
		this.title = title;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Node> getChildren() {
		return children;
	}

	public void setChildren(List<Node> children) {
		this.children = children;
	}

}