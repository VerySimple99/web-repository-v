package step1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetCookieServlet
 */
@WebServlet("/SetCookieServlet")
public class SetCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<body bgcolor=yellow>");
		out.print("<h4>"+getServletConfig().getServletName());
		out.print("</h4>");
		// 클라이언트에 전송해서 저장할 쿠키를 생성 
		Cookie cookie=new Cookie("testCookie","joy");
		// 쿠키 유효시간 설정 
		// 만약 쿠키 유효시간을 설정하지 않으면 브라우저 실행시에만 유효 
		cookie.setMaxAge(5); // 20초 동안 유지되도록 설정 
		response.addCookie(cookie);//응답시 쿠키가 전송되도록 한다 
		out.print("cookie를 생성해 클라이언트에 전송<br><br>");
		out.print("<a href=GetCookieServlet>GetCookieServlet으로 이동</a>");
		out.print("<br><br><a href=index.html>home으로</a>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}
}


















