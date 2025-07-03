<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>review jsp</title>
</head>
<body>
	<!-- 
		html 주석 
 -->
	<%--
		jsp 주석 
 --%>
	<%!// 멤버변수 or 인스턴스변수 
	String name;
	%>
	<%-- 아래코드는 service 메서드 내에 생성되는 코드 --%>
	<%
	name="이강인";
	for (int i = 0; i < 5; i++) {
	%>
	<%-- 아래 코드는 out.print(name)로 생성 --%>
	<%=i+1%>.<%=name%> <br>
	<%
	}
	Date date=new Date();	
	%>
	<font size="6" color="blue">현재시간:<%=date.toString() %></font>
</body>
</html>












