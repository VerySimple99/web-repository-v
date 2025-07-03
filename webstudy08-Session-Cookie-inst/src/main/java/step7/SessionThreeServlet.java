package step7;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionThreeServlet
 */
@WebServlet("/SessionThreeServlet")
public class SessionThreeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body bgcolor=aqua>");
		out.print("<h4>" + getServletConfig().getServletName());
		out.print("</h4>");
		
		//request.getSession(false) : 기존 세션이 있으면 반환, 없으면 null 반환 
		HttpSession session=request.getSession(false);
		if(session==null) {
			out.print("세션이 존재하지 않습니다");
		}else {
			// 세션이 존재하면 세션을 무효화시킨다 => 로그아웃에 사용됨 
			out.print("session invalidate() 세션을 무효화시킴");
			session.invalidate();
		}
		out.print("<br><br><a href=index.html>home으로</a>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}
}












