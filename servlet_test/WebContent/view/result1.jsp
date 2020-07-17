<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import ="java.util.ArrayList,dto.*" %>
    
    <%
    
    String msg = (String)request.getAttribute("msg");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%=msg %>
<a href ="<%=request.getContextPath() %>/view/practice2.jsp"></a>

</body>
</html>