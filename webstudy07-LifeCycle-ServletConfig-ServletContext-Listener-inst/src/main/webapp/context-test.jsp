<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>context-test</title>
</head>
<body bgcolor="orange">
<h4>context-test jsp 입니다</h4>
security info: <%=application.getInitParameter("securityLocation") %>
</body>
</html>