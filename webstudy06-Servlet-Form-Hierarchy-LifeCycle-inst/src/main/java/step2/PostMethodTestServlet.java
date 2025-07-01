package step2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PostMethodTestServlet
 */
@WebServlet("/PostMethodTestServlet")
public class PostMethodTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");  // post 방식 한글처리 
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h3>");
		String userName=request.getParameter("userName");
		String menu=request.getParameter("menu");
		String type=request.getParameter("type");
		out.print("이름:"+userName+"<br>");
		out.print("음식명:"+menu+"<br>");	
		out.print("타입:"+type);	
		System.out.println(userName+" "+menu+" "+type);
		out.print("</h3>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}
}
