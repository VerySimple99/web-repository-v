package step1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 * web app version 2.5 는  xml 기반 서블릿 설정임 
 * web.xml 에 설정이 명시되어 있으므로 이전 프로젝트처럼 어노테이션 설정은
 * 생성되지 않음 
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HelloServlet doGet()");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h3>");
		String nick=request.getParameter("nick");
		out.print(nick+"님 ");
		out.print("Hello 서블릿  xml 기반 설정~ doGet");		
		out.print("</h3>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// post 일때는  http request body 영역에 정보가 저장되므로 별도 한글처리가 필요
		request.setCharacterEncoding("utf-8");
		System.out.println("HelloServlet doPost()");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<body bgcolor=yellow>");
		out.print("<h3>");
		String nick=request.getParameter("nick");
		out.print(nick+"님 Hello 서블릿  xml 기반 설정~ doPost");		
		out.print("</h3>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}

}



