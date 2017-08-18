<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/2
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/fain.do" method="post">
    <span>名字:</span> <input type="text" name="userName">
    <span>密码:</span> <input type="password" name="passWord">
    <input type="submit" value="提交">
</form>

</body>
</html>
