<%@page import="model.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	ArrayList<MemberVO> list = new ArrayList<MemberVO>();
	list.add(new MemberVO("ajax","1","이강인","마요르카"));
	list.add(new MemberVO("json","ab","황희찬","울버햄튼"));
	list.add(new MemberVO("git","ba","조규성","전주"));
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
<div class="container pt-3">
<p>jsp를 이용해 member list 정보를 table로 표현해본다 </p>
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
	<%
		for(int i=0;i<list.size();i++){
	%>
		<tr>
			<td><%=list.get(i).getId() %></td>
			<td><%=list.get(i).getName() %></td>
			<td><%=list.get(i).getAddress() %></td>
		</tr>
	<%
		}
	%>
	</tbody>
</table>
</div>
</body>
</html>















