<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form  method="post" action='j_security_check' >
    <label >账号:</label>
    <input name="j_username" type="text"/><br>
    <br>
    <label >密码:</label>
    <input name="j_password" type="password"/><br>
    <br>
    <button id="j_login" type="submit" >登录</button><br>
</form>
</body>
</html>