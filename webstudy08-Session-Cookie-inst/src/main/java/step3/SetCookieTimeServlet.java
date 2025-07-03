package step3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *  cookie 에 쿠키 생성 시간을 저장해서 클라이언트 측에 저장하는 서블릿 
 */
@WebServlet("/SetCookieTimeServlet")
public class SetCookieTimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<body bgcolor=orange>");
		out.print("<h4>"+getServletConfig().getServletName());
		out.print("</h4>");
		// 클라이언트에 전송해서 저장할 쿠키를 생성 
		Date date=new Date();
		String time=date.toString().replace(" ", "-");
		Cookie cookie=new Cookie("time",time);
		// 쿠키 유효시간 설정 
		cookie.setMaxAge(20); // 20초 동안 유지되도록 설정 
		response.addCookie(cookie);//응답시 쿠키가 전송되도록 한다 
		//단위 테스트 후 공란을 하이픈으로 대체해 전송한다 
		//쿠키는 공란을 허용하지 않는다 
		out.print(time+"<br>");
		out.print("time cookie를 생성해 클라이언트에 전송<br><br>");
		out.print("<a href=GetCookieTimeServlet>GetCookieTimeServlet으로 이동</a>");
		out.print("<br><br><a href=index.html>home으로</a>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}
}


















