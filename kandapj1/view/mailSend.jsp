<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*, java.*" %>

​ <%
	request.setCharacterEncoding("UTF-8");
	String sender = request.getParameter("sender");
	String receiver = request.getParameter("receiver");
	String subject = request.getParameter("subject");
	String content = request.getParameter("content");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

이동확인 오키
가져오는지 확인

<%=sender %>
<%=receiver %>
<%=content %>

</body>
</html>