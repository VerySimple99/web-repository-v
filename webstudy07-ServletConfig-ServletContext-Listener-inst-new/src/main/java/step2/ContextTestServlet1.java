package step2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContextTestServlet1
 */
@WebServlet("/context-test1")
public class ContextTestServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<body bgcolor=yellow>");
		ServletContext servletContext=getServletConfig().getServletContext();
		//서블릿컨텍스트에 특정 정보를 저장할 수 있다 
		//servletContext.setAttribute("adminInfo", "javaking");
		String securityInfo=servletContext.getInitParameter("securityLocation");
		out.print("<h4>");
		out.print(getServletConfig().getServletName()+" security info:"+securityInfo);
		out.print("</h4>");
		out.print("</body>");
		out.print("</html>");
		out.close(); 
	}
}













