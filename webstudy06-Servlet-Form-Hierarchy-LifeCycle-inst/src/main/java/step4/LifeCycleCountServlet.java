package step4;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleCountServlet
 */
@WebServlet("/life")
public class LifeCycleCountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;    
	private int count; //접속수를 저장 
    public LifeCycleCountServlet() {
        super();
        System.out.println("LifeCycleCountServlet 객체 생성");
    }
	public void init() throws ServletException {
		System.out.println("LifeCycleCountServlet init()");
		count++;
	}
	public void destroy() {
		System.out.println("LifeCycleCountServlet destroy()");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("LifeCycleCountServlet service() -> doGet()");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.print("<h3>접속수:"+count+"</h3>");
		count++;
		out.close();
	}
}
















