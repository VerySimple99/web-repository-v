package step5;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class TestListener
 *
 */
public class TestListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public TestListener() {
        // TODO Auto-generated constructor stub
    }
    /**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     * 웹어플리케이션이 시작되는 지점에 실행이 된다 
     * 웹어플리케이션 초기화 작업을 정의할 수 있다 
     * 예를 들면 웹어플리케이션에서의 보안 작업을 가장 먼저 수행해 보안성을 높인다 
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	 String securityInfo=sce.getServletContext().getInitParameter("securityLocation");
         System.out.println(sce.getServletContext().getContextPath()
        		 +" contextInitialized "+securityInfo+" 로드하여 보안작업수행");
    }
	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     * 웹어플리케이션 종료 직전에 실행이 된다 
     * 정보 유지가 필요한 경우 백업 작업 , 로깅 작업 등을 수행한다 
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
        System.out.println(sce.getServletContext()+" contextDestroyed");
    }

	
	
}
