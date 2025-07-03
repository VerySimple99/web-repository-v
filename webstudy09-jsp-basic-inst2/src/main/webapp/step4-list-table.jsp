<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
ArrayList<String> list = new ArrayList<String>();
list.add("불갈비");
list.add("탕수육");
list.add("순대국");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<title>jsp로 테이블 표현하기</title>
</head>
<body>
<div class="container pt-5">
<p>jsp를 이용해 list 정보를 table로 표현해본다 </p>
<%-- list 정보를 이용해 테이블로 표현한다 --%>
<table class="table table-bordered table-hover">
<% for(int i=0;i<list.size();i++){  %>
	<tr align="center">
		<td><%=i+1%></td><td><%=list.get(i) %></td>
	</tr>
<% } %>
</table>
</div>
</body>
</html>















