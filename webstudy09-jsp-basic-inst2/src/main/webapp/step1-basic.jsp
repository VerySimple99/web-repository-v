<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"  import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp basic</title>
</head>
<body>
	<!--  html 주석 -->
	<%-- jsp 주석 --%>
	jsp 기본 문법
	<br>
	<br> 마지막 시간이네요
	<br>
	<br>
	<%-- 아래 라인을 50번 반복한다 --%>
	<%
	for (int i = 0; i < 5; i++) {
	%>
	<%=i%>. 기쁩니다 <br>
	<%
	}
	%>
	<% int count=1; %>
	<%!  int count; %>
	local variable count <%=count++ %><br>
	instance variable count <%=this.count++ %>
	<br><br>
	<%=new Date().toString() %>
</body>
</html>
















