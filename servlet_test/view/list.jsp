<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="java.util.ArrayList,dto.Employee" %>
<%

ArrayList<Employee> list  = (ArrayList<Employee>)request.getAttribute("list");
%>
<html>
	<head>
		<title>JSP理解度テスト</title>
	</head>
	<body>
		<h2>従業員一覧</h2>
		<table>
			<tr>
				<th align="center">ID</th>
				<th align="center">名前</th>
				<th align="center">年齢</th>
				<th align="center">店舗</th>
			</tr>
			<%
			if(list != null){
				for(int i = 0; i < list.size(); i++){
			%>
			<tr>
				<td><%= list.get(i).getId() %></td>
				<td><%= list.get(i).getName() %></td>
				<td><%= list.get(i).getAge() %></td>
				<td><%= list.get(i).getStore() %></td>
			<%
				}
			}
			%>
		</table>


	</body>
</html>