<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, dto.*"%>

<%
	ArrayList<Employee> list = (ArrayList<Employee>)request.getAttribute("list");
	String error = (String) request.getAttribute("error");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP理解度テスト問題１</title>
</head>
<body>
	<h1>従業員一覧表示</h1>
	<table>
		<tr>
			<td>ID</td>
			<td>名前</td>
			<td>年齢</td>
			<td>店舗</td>
		</tr>

		<%
		
		if(list != null){
			for(int i = 0; i< list.size(); i++){
		
		%>

		<tr>
			<td><%=list.get(i).getId() %></td>
			<td><%=list.get(i).getId() %></td>
			<td><%=list.get(i).getId() %></td>
			<td><%=list.get(i).getStore() %></td>
		</tr>

<%
			}
		}

%>
	</table>

</body>
</html>