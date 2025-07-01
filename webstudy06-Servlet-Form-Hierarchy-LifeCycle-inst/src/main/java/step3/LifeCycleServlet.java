package step3;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

/**
 * Servlet implementation class LifeCycleServlet
 */
@WebServlet("/LifeCycleServlet")
public class LifeCycleServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	public LifeCycleServlet() {
		super();
		System.out.println("LifeCycleServlet 객체 생성");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("LifeCycleServlet init() 실행");
	}
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("LifeCycleServlet service() 실행");
	}
	@Override
	public void destroy() {
		System.out.println("LifeCycleServlet destroy() 실행");
	}
}



