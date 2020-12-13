<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お問い合わせ</title>
</head>
<body>

<h2>お問い合わせ</h2>
<form name="my" action="<%=request.getContextPath()%>/contact" method="post">
<table>
<ul>
<li>
メールアドレス：
<input type="text" name="email">
</li>
<li>
名前：
<input type="text" name="name">
</li>
<li>
年齢：
<input type="text" name="age">
</li>
<li>
性別：
<input type="radio" name="gender" value="lady">女
<input type="radio" name="gender" value="man">男
<li>
住所：
<input type="text" name="address">
</li>
<li>
お問い合わせ項目（プルダウン）<br>
<select name="kind">
<option value="1">①料金・お支払いについて</option>
<option value="2">②講座・コース・教材について</option>
<option value="3">③学習の進めの方について</option>
<option value="4">④受講期間について</option>
<option value="5">⑤受講後のサポートについて</option>

</select>
</li>
<li>
お問い合わせ自由記入欄<br>

<textarea name="contents"></textarea>
</li>
</ul>

<input type="button" value="送信" onclick="gogo()">

</table>
</form>
</body>
<script>

	function gogo(){
		alert("お問い合わせが正常に受け付けられました。");
		my.submit();
	}

</script>
</html>