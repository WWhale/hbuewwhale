<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     
<!-- 将hello.jsp包含到此页面 -->
<%@include file="hello.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% String str = "String字符串";%>
	<% int age = 20;%>
	<h1>index jsp</h1>
	<%=str %>
	<%if(age > 18){%>
		<h3>已成年</h3>
	<%}	else{
		out.write("<h3>未成年</h3>");
	}%>
</body>
</html>