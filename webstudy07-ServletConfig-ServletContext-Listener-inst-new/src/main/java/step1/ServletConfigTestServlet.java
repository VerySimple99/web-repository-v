package step1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * ServletConfig 사용법을 보여주는 간단한 예제
 * 개별 서블릿의 설정 정보를 관리하고 표시
 */
@WebServlet(
    urlPatterns = "/config-basic",
    initParams = {    
        @WebInitParam(name = "contextConfigLocation", value = "/WEB-INF/springmvc-config.xml") 
    }
)
public class ServletConfigTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		
		// 웹 컨테이너에 의해 init 에서 전달받은 servletConfig(사원증) 객체를 반환받아 확인해본다 
		ServletConfig servletConfig=this.getServletConfig();

		out.print("<html>");
		out.print("<body bgcolor=yellow>");
		out.print("<h4>ㅋㅋ");

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
