package step6;

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
 * Servlet implementation class SessionTwoServlet
 */
@WebServlet("/SessionTwoServlet")
public class SessionTwoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body bgcolor=lime>");
		out.print("<h4>" + getServletConfig().getServletName());
		out.print("</h4>");
		// 세션이 없으면 null, 있으면 기존 세션을 리턴
		HttpSession session = request.getSession(false);
		if (session != null) {
			out.print(session.getId());
			// 세션에 회원 정보를 저장
			out.print("<br><br>회원정보를 세션에서 반환받아 회원명을 출력<br><br>");
			//부모타입 Object로 반환되므로 자식 MemberVO 타입으로 Object casting 해야 한다 
			MemberVO mvo=(MemberVO)session.getAttribute("mvo");
			out.print("회원명:"+mvo.getName());
		} else {
			out.print("세션이 존재하지 않습니다");
		}
		out.print("<br><br><a href=SessionThreeServlet>SessionThreeServlet으로</a>");
		out.print("<br><br><a href=index.html>home으로</a>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}
}
