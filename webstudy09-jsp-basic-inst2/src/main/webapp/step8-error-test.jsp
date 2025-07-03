<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  errorPage="step7-error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>error test</title>
</head>
<body>
<%
		String name="아이유";
		name=null;
%>
<%=name%>님의 이름은 <%=name.length() %>자로 구성되어 있습니다 
</body>
</html>







