package step5;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.MemberVO;

/**
 * Servlet implementation class SessionOneServlet
 */
@WebServlet("/SessionOneServlet")
public class SessionOneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body bgcolor=yellow>");
		out.print("<h4>" + getServletConfig().getServletName());
		out.print("</h4>");
		//세션이 없으면 세션을 새로 생성, 있으면 기존 세션을 리턴 
		HttpSession session=request.getSession();
		out.print(session.getId());
		//세션에 회원 정보를 저장 
		out.print("<br><br>회원정보를 세션에 저장");
		MemberVO memberVO=new MemberVO("java","a","아이유","종로");
		session.setAttribute("mvo", memberVO);
		out.print("<br><br><a href=SessionTwoServlet>SessionTwoServlet으로</a>");
		out.print("<br><br><a href=index.html>home으로</a>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}
}






