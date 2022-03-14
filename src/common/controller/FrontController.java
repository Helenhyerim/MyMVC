package common.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		description = "사용자가 웹에서 *.up 을 했을 경우 이 서블릿이 응답해준다.", 
		urlPatterns = { "*.up" }, 
		initParams = { 
				@WebInitParam(name = "propertyConfig", value = "C:/NCS/workspace(jsp)/MyMVC/WebContent/WEB-INF/Command.properties", description = "*.up 에 대한 클래스의 매핑파일")
		})
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		/*
		        웹브라우저 주소창에서  *.up 을 하면 FrontController 서블릿이 응대를 해오는데 
		        맨 처음에 자동적으로 실행되어지는 메소드가 init(ServletConfig config) 이다.
		        여기서 중요한 것은 init(ServletConfig config) 메소드는 WAS(톰캣)가 구동되어진 후
		        딱 1번만 init(ServletConfig config) 메소드가 실행되어지고, 그 이후에는 실행이 되지 않는다. 
		        그러므로 init(ServletConfig config) 메소드에는 FrontController 서블릿이 동작해야할 환경설정을 잡아주는데 사용된다.
	  */
		// *** 확인용 *** //
		System.out.println("~~~ 확인용 => 서블릿 FrontController 의 init(ServletConfig config) 메소드가 실행됨.");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
