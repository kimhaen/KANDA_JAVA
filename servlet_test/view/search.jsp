<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="java.util.ArrayList,dto.Employee"%>
<%
	Employee emp = (Employee) request.getAttribute("emp");
%>
<html>
<head>
<title>JSP理解度テスト</title>
</head>

<h2>従業員の検索</h2>

<form action="<%=request.getContextPath()%>/search" method="get">
	検索対象id: <input type="text" name="id"><br> <input
		type="submit" value="検索">

</form>

<body>
	<table>
		<tr>
			<th align="center">ID</th>
			<th align="center">名前</th>
			<th align="center">年齢</th>
			<th align="center">店舗</th>
		</tr>
		<%
			if (emp != null) {
		%>
		<tr>
			<td><%=emp.getId()%></td>
			<td><%=emp.getName()%></td>
			<td><%=emp.getAge()%></td>
			<td><%=emp.getStore()%></td>
			<%
				}
			%>

	</table>


</body>
</html>