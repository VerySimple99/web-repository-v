<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
MemberVO mvo = new MemberVO("javaking", "abcd", "이강인", "마요르카");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<title>jsp로 테이블 표현하기</title>
</head>
<body>
	<div class="container pt-5">
		<p>jsp를 이용해 VO 정보를 table로 표현해본다</p>
		<%-- list 정보를 이용해 테이블로 표현한다 --%>
		<table class="table table-bordered table-hover">
			<thead>
				<tr>
					<th>아이디</th>
					<th>이름</th>
					<th>주소</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><%=mvo.getId() %></td>
					<td><%=mvo.getName() %></td>
					<td><%=mvo.getAddress() %></td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>















