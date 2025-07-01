package step1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *  web module version 2.5 :  xml 기반 설정 => WEB-INF/web.xml 에 설정되어있다 
 *  현 서블릿은 클라이언트의 최초 요청시  서블릿 객체생성 -> init() 실행 후 -> service 된다
 *  web.xml 에 설정을 추가하여 클라이언트 최초 요청시 로드되는 것이 아니라 
 *  웹어플리케이션이 시작되는 시점에 서블릿이 초기화되도록 ( init() 까지 수행 ) 
 *  한다 ( <load-on-startup>1</load-on-startup> )
 */
public class LifeCycleOnLoadStartupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private int count;
    
	public LifeCycleOnLoadStartupServlet() {
		super();
		System.out.println("LifeCycleOnLoadStartupServlet 객체 생성");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("LifeCycleOnLoadStartupServlet init");
		count++;
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { 
		System.out.println("LifeCycleOnLoadStartupServlet service()->doGet()");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<body bgcolor=yellow>");
		out.print("<h4>LifeCycleOnLoadStartupServlet count:"+count);
		count++;
		out.print("</h4>");
		ServletContext servletContext=getServletConfig().getServletContext();
		String securityInfo=servletContext.getInitParameter("securityLocation");
		out.print("<h4>");
		out.print(getServletConfig().getServletName()+" security info:"+securityInfo);
		out.print("</h4>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}	
	@Override
		public void destroy() {
			System.out.println("LifeCycleOnLoadStartupServlet destroy()");
		}
}









