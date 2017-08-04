<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理系统首页</title>
</head>
<frameset rows="83,*" cols="*" framespacing="0" frameborder="no" border="0">
  <frame src="${pageContext.servletContext.contextPath }/background/top.do" name="topFrame" scrolling="no" noresize="noresize" id="topFrame" />
  <frame src="${pageContext.servletContext.contextPath }/background/center.do" name="mainFrame" id="mainFrame" />
</frameset>
<noframes>
<body>
</body>
</noframes>
</html>