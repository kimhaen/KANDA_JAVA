<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, dto.*"%>
<%
	ArrayList<Contact> list = (ArrayList<Contact>) request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<style>
.td{
	padding: 70px;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Login OK
	<div>
			<a href="<%=request.getContextPath()%>/view/main.jsp">HOME</a>
			<hr>
		</div>


	<h1>お問い合わせ一覧</h1>
	<table border="1" style="border-spacing: 0px;">
		<tr align="center" style="font-weight: bold;">
			<td>No</td>
			<td>名前</td>
			<td>kind</td>
			<td>date</td>
			<td>contents</td>
			<td>status</td>
		</tr>

		<%
			int cnt = list.size();
			if (list != null) {
				for (int i = list.size(); i > 0; i--) {
		%>
		<tr align="center">
			<td><%=cnt%></td>
			<td><%=list.get(i - 1).getUser_name()%></td>
			<td><%=list.get(i - 1).getKind()%></td>
			<td><%=list.get(i - 1).getIndate().substring(0,16)%></td>
			<td><%=list.get(i - 1).getContents()%></td>

			<%
				if (list.get(i - 1).getStatus()==0) {
			%>
				<form action="<%=request.getContextPath()%>/reply" method="post">
				<input type="hidden" name="num" value=<%=cnt%>>
				<input type="hidden" name="user_email" value=<%=list.get(i - 1).getUser_email()%>>
				<td><input type="submit" value="未回答"></td>
				</form>
			<%
				}else{
			%>
				<td>答え済み</td>
			<%
				}
			%>

		<%
			cnt--;
				}

			}
		%>
	<!-- 	<td><a href="./view/reply.jsp">未回答</a></td> -->
	</table>

</body>
</html>