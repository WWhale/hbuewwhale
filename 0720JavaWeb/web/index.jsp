<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
      <%
        String name = new String();
        name = "天蚕土豆";
      %>
      <%=name%>
      <form action="/cs" method="post">

            <input type="submit" value="post访问">
      </form>
  </body>
</html>
