<%@page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>中間終了理解度テスト（JSP）</title>
</head>
<body>
	<h2>従業員の登録</h2>

	<form action="<%= request.getContextPath() %>/insert" method="get">
		id:
		<input type="text" name="id"><br><br>

		名前:
		<input type="text" name="name"><br><br>

		年齢:
		<input type="text" name="age"><br><br>

		店舗:
		<input type="radio" name="store" value="神田店">神田店
		<input type="radio" name="store" value="東京店">東京店
		<br><br>

		<input type="submit" value="登録">


	</form>
</body>
</html>