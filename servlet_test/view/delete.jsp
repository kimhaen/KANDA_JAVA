<%@page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>中間終了理解度テスト（JSP）</title>
</head>
<body>
	<h2>従業員の削除</h2>

	<form action="<%= request.getContextPath() %>/delete" method="get">
		削除対象id:
		<input type="text" name="id"><br>

		<input type="submit" value="削除">

	</form>
</body>
</html>