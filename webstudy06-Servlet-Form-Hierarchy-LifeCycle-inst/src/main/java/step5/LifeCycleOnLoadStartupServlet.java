package step5;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * 웹 애플리케이션이 실행될 때(즉, 웹 컨테이너가 시작되고 해당 웹 애플리케이션을 배포할 때) 가장 먼저 LifeCycleCountServlet이 초기화됩니다.

이로 인해 다음과 같은 이점이 있습니다:

초기 로딩 시간 단축 (첫 요청 시): 첫 번째 사용자가 /life 경로로 요청을 보냈을 때, 서블릿이 이미 초기화되어 있기 때문에 init() 메서드 호출로 인한 지연 없이 바로 service() 메서드를 통해 요청을 처리할 수 있습니다.

필수 리소스 사전 로드: 서블릿이 시작될 때 반드시 필요한 리소스(예: 데이터베이스 연결 풀, 설정 파일, 캐시 초기화 등)를 미리 로드하여 애플리케이션의 안정적인 시작을 보장할 수 있습니다.

초기 작업 수행: 웹 애플리케이션 시작과 동시에 특정 작업을 수행해야 할 때 유용합니다.
 */
@WebServlet(value = "/LifeCycleOnLoadStartupServlet", loadOnStartup = 1)
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

