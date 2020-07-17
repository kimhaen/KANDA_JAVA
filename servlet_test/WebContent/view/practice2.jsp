<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
  <%@ page import ="java.util.ArrayList, dto.*" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP理解度テスト問題３</title>
</head>
<body>

<h1>色々なフォームからの送信</h1>
<form action="result2.jsp" method="post">

回答者
<input type="text" name="respondent" value="神田タロ">	<br><br>

性別
<select name="gender">
<option value="男">男</option>
<option value="女">女</option>
<option value="その他" selected ="selected">その他</option>
</select>	<br><br>
好物
<input type="checkbox" name="favorite" value="野菜">野菜
<input type="checkbox" name="favorite" value="魚">魚
<input type="checkbox" name="favorite" value="肉">肉
	<br><br>
その他コメント
<textarea nmae="memo" rows="5" cols="40">AAA</textarea>

	<br><br>
<input type ="submit" value="送信">
</form>


</body>
</html>