package step2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * ServletConfig 를 테스트 하는 예제 
 */
public class ServletConfigTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /*
     *  HttpServlet 의 super class 인  GenericServlet 이 Servlet interface의 
     *  abstract method init(ServletConfig) 을 구현하고 있다
     *  즉 현 서블릿은 HttpServlet을 상속받았으므로 init(ServletConfig) 메서드를 이미 내장하고 있음
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<body bgcolor=yellow>");
		out.print("<h4>ㅋㅋ");
		// 웹 컨테이너에 의해 init 에서 전달받은 servletConfig(사원증) 객체를 반환받아 확인해본다 
		ServletConfig servletConfig=this.getServletConfig();
		out.print("ServletConfig : "+servletConfig.toString());
		out.print("</h4>");
		// 연습차원에서 spring 설정파일경로정보를 얻어온다 
		// springboot 의 @ContextConfiguration 
		String springConfig=servletConfig.getInitParameter("contextConfigLocation");
		out.print("스프링 설정파일경로:"+springConfig);
		out.print("<br><br>"+servletConfig.getServletName());
		// 웹어플리케이션(회사)의 공유자원(사내인트라넷) 인 
		// ServletContext 객체 주소값을 반환받는다
		out.print("<br><br> ServletConfig로부터 ServletContext 주소값 반환:"
		+servletConfig.getServletContext());
		out.print("</body>");
		out.print("</html>");
		out.close(); 
	}
}







