<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>神田英語教室管理者ページ</h2>
<h1>管理者ログイン</h1>
	<ul>
	<form action="<%=request.getContextPath()%>/login" method="post">
		<li>
			ID：
			<input type ="text" name="id">
		</li>
		<li>
			PW:
			<input type ="text" name="pw">
		</li>
		<li>


			<input type="submit" value="送信">

		</li>
		</form>
	</ul>
</body>
</html>