<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>神田英語教室</h1>
	<ul>
		<li>
			<a href="<%= request.getContextPath() %>/view/contact.jsp">
			お問い合わせ
			</a>
		</li>
		<li>
			<a href="<%= request.getContextPath() %>/view/manager.jsp">
			管理者ログイン
			</a>
		</li>
	</ul>
</body>
</html>