package step1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet 
 * @WebServlet : 어노테이션 기반 서블릿 설정
 * 					  어노테이션 -> 의미있는 주석으로 주로 설정정보를 명시할 때 사용 
 * @WebServlet(url-pattern) : url-pattern 이란 클라이언트가 해당 프로그램으로 요청하기 위해 사용하는 
 * 									웹 프로그램의 주소  
 */
@WebServlet("/ho")
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
		out.print("Hello 서블릿~");
		//client가 전송한 keyword 정보를 얻어온다 
		String data=request.getParameter("keyword");
		out.print("<br><br>검색 키워드 "+data+" 검색결과");
		out.print("</h3>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}
}







