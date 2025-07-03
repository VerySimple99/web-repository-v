package step4;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetCookieTimeServlet
 */
@WebServlet("/GetCookieTimeServlet")
public class GetCookieTimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body bgcolor=aqua>");
		out.print("<h4>" + getServletConfig().getServletName());
		out.print("</h4>");
		/*
		 	GetCookieTimeServlet에서는  time cookie가 존재하면 
		 	time cookie 에 저장된 value 즉 time cookie 생성시간을 출력한다 
		 	만약 현 웹어플리케이션 내에 쿠키가 하나도 존재하지 않는다면 
		 	쿠키가 존재하지 않습니다라고 웹화면에 출력하고
		 	쿠키는 존재하되 time 쿠키가 존재하지 않는 경우 
		 	time 쿠키가 존재하지 않습니다 라고 웹화면에 출력한다  
		 */
		Cookie cookies[]=request.getCookies();
		if(cookies==null) { // 현 웹어플리케이션에서 쿠키가 하나 이상 존재하지 않을때
			out.print("쿠키가 존재하지 않습니다");
		}else {
			// time cookie 존재하면 time 정보 출력하고 
			// 없으면 time cookie 가 존재하지 않습니다 출력 
			String timeInfo=null;
			for(int i=0;i<cookies.length;i++) {
				if(cookies[i].getName().equals("time")) {//time cookie가 존재하면 
					timeInfo=cookies[i].getValue();
					break;
				}
			}
			if(timeInfo!=null)
				out.print("time 쿠키에 저장된 값:"+timeInfo);
			else
				out.print("time 쿠키가 존재하지 않습니다");
		}
		out.print("<br><br><a href=index.html>home으로</a>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}
}











