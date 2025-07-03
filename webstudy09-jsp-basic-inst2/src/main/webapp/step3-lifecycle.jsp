<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step3-lifecycle.jsp</title>
</head>
<body>
<%!
		int count; //인스턴스변수이므로 선언만 해도 0으로 초기화 
		//라이프사이클메서드를 정의 
		public void jspInit(){
			System.out.println("jspInit()");			
		}
		public void jspDestroy(){
			System.out.println("jspDestroy()");
		}
%>
<%
		System.out.println("jspService()");
%>
<h4>접속수:<%=++count%></h4>
</body>
</html>









