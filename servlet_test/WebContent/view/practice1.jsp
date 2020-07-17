<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "java.util.ArrayList, dto.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP理解度テスト問題２</title>
</head>
<body>


<h1>フォームからのGET送信</h1>
<form action ="<%=request.getContextPath() %>/practice1Servlet" method="get">
<input type="hidden" name="cmd" value="get">
<input type="submit" value="送信">
</form>


<h1>フォームからのPOST送信</h1>
<form action ="<%=request.getContextPath() %>/practice1Servlet" method="get">
<input type="hidden" name="cmd" value="post">
<input type="submit" value="送信">
</form>


<h1>リンクからの送信</h1>
<a href="<%=request.getContextPath()%>/Practice1Servlet?cmd=link">送信</a>


</body>
</html>