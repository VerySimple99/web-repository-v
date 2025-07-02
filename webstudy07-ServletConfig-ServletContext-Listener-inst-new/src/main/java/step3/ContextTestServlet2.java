package step3;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContextTestServlet2
 */
@WebServlet("/context-test2")
public class ContextTestServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<body bgcolor=lime>");
		ServletContext servletContext=getServletConfig().getServletContext();
		//ContextTestServlet1에서 ServletContext에 저장한 정보를 받아와본다 
		//out.print(servletContext.getAttribute("adminInfo"));
		String securityInfo=servletContext.getInitParameter("securityLocation");
		out.print("<h4>");
		out.print(getServletConfig().getServletName()+" security info:"+securityInfo);
		out.print("</h4>");
		out.print("</body>");
		out.print("</html>");
		out.close(); 
	}

}
