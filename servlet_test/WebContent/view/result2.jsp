<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");

	String respondent = request.getParameter("respond");
	String gender = request.getParameter("gender");
	String favorite[] = request.getParameterValues("favorite");
	String memo = request.getParameter("memo");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP理解度テスト問題３</title>
</head>
<body>
	<h1>フォーム入力内容</h1>

	<table>
		<tr style="" align="center">
			<td>項目</td>
			<td>入力内容</td>
		</tr>
		<tr>
			<td>名前</td>
			<td><%=respondent%></td>
		</tr>
		<tr>
			<td>性別</td>
			<td><%=gender%></td>
		</tr>
		<tr>
			<td>好物</td>
			<td>
				<%
					for (int i = 0; i < favorite.length; i++) {
				%> <%=favorite[i]%> <%
 	if (i < favorite.length - 1) {
 %> / <%
 	}
 	}
 %> %>
			</td>
		</tr>
		<tr>
			<td>その他コメント</td>
			<td><%=memo%></td>
		</tr>
	</table>
</body>
</html>