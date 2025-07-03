package step2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetCookieServlet
 */
@WebServlet("/GetCookieServlet")
public class GetCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body bgcolor=lime>");
		out.print("<h4>" + getServletConfig().getServletName());
		out.print("</h4>");
		// 클라이언트에 저장된 쿠키 정보를 반환받는다
		Cookie[] cookies = request.getCookies();
		System.out.println("cookie array: " + cookies);
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				if(cookies[i].getName().equals("testCookie")) {
					out.print(cookies[i].getValue()+" value 쿠키 정보입니다");
					break;
				}
			}
		}
		out.print("<br><br><a href=index.html>home으로</a>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}
}
