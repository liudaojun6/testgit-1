<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<link rel="stylesheet" href="page.css">
<script type="text/javascript">
<%
String result=(String)session.getAttribute("dl_result");
if(result!=null){%>
	alert("<%=result%>");
	<%session.setAttribute("dl_result", null);
}%>
</script>
</head>
<h1>登录失败请重新登录</h1>
<body class="denglubody">
    <meta charset="UTF-8">
       <div class="denglu_div">
           <form action="j_security_check" method="post">
               <input class="us_input" placeholder="请输入用户名" type="text" name="j_username"><br/>
               <input class="us_input" placeholder="请输入密码" type="password" name="j_password"><br/>
               <input class="shuru_sub" type="submit" name="submit" value="登录"><br/>
           </form>
           <form action="admin_zhuce.jsp">
           <input class="shuru_sub" type="submit" name="submit" value="注册"><br/>
           </form>
       </div>
</body>
</html>