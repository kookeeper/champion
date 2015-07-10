package br.com.msystem.champion.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

public class ExceptionHandler extends SimpleMappingExceptionResolver {

	private String ajaxErrorView;
	private boolean ajaxShowTechMessage = true;

	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object o, Exception e) {
		if (isAjax(request)) {
			String exceptionMessage = getExceptionMessage(e);
			ModelAndView m = new ModelAndView(ajaxErrorView);
			System.out.println();
			System.out.println();
			System.out.println(exceptionMessage);
			System.out.println();
			System.out.println();
			m.addObject("exceptionMessage", exceptionMessage);
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			return m;
		} else {
			return super.resolveException(request, response, o, e);
		}
	}

	private String getExceptionMessage(Throwable e) {
		String message = e.getMessage();
		
		if (!ajaxShowTechMessage)
			return message;
		
		e = e.getCause();

		while (e != null) {
			message += "\n" + e.getMessage();
			e = e.getCause();
		}
		return message;
	}

	private boolean isAjax(HttpServletRequest request) {
		return "XMLHttpRequest".equals(request.getHeader("X-Requested-With"));
	}

	public void setAjaxErrorView(String ajaxErrorView) {
		this.ajaxErrorView = ajaxErrorView;
	}

	public void setAjaxShowTechMessage(boolean ajaxShowTechMessage) {
		this.ajaxShowTechMessage = ajaxShowTechMessage;
	}

	public String getAjaxErrorView() {
		return ajaxErrorView;
	}

	public boolean isAjaxShowTechMessage() {
		return ajaxShowTechMessage;
	}

}
