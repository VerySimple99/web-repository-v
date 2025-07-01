package step1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetMethodTestServlet
 */
@WebServlet("/GetMethodTestServlet")
public class GetMethodTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h3>");
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		out.print("이름:"+name+"<br>");	
		out.print("주소:"+address);	
		out.print("</h3>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}
}




