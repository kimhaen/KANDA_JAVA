<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ page import="java.util.ArrayList, dto.*"%>
<%
	Contact contact = (Contact)request.getAttribute("contact");
%>
<!DOCTYPE html>
<html>
<style>
.replyspace {
		width:500px;
		height:100px;
		resize:none;
}

input{
 	width:330px;
}
</style>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<div>

			<a href="<%=request.getContextPath()%>/view/main.jsp">HOME</a>
			<a href="<%=request.getContextPath()%>/list">一覧ページ</a>
			<hr>
		</div>
</head>
<body>
<h1>返信画面</h1>



<table border="1" cellpadding="0">
<tr> <td  width="110px" align="center" >神田英語教室 </td>
<td><input type="text" name="sender" value="KandaEnglish@gmail.com" readonly></td> </tr>

<tr> <td align="center">宛先</td>
<td><input type="text" name="receiver" value="<%=contact.getUser_email()%>" readonly/></td> </tr>

<tr> <td align="center" >お問い合わせ内容</td>
<td><textarea name="inquiry" cols="45" rows="11" style="overflow-x:hidden;overflow-y:auto"><%=contact.getContents()%></textarea> </td> </tr>

<form action="<%=request.getContextPath()%>/mailSend" method="post">
<tr> <td align="center" >タイトル </td>
<td><input type="text"  name="subject" class="subjj" value="お問い合わせの回答"></td> </tr>


<!-- <form action="./view/mailSend.jsp" id="mailf" method="post"> -->
<tr> <td align="center"> 本文 </td>
<td><textarea name="content" cols="45" rows="22" style="overflow-x:hidden;overflow-y:auto"></textarea></td> </tr>

<input type="hidden" name="sender" value="KandaEnglish@gmail.com">
<input type="hidden" name="receiver" value="<%=contact.getUser_email()%>">


<tr> <td colspan="2" align="center"><input type="submit" value="送信" style="width:100px"></td> </tr>
</table>
</form>

<br>
<br>


</body>
</html>