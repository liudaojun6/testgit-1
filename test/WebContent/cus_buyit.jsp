<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人信息填写</title>
<link rel="stylesheet" href="page.css">
<script type="text/javascript">
<%
String result=(String)session.getAttribute("buyit_result");
if(result!=null){%>
	alert("<%=result%>");
	<%session.setAttribute("buyit_result", null);
}%>
</script>
</head>
<body>
<a class="us_a" href="servlet_yhspxxcus">商城首页</a>
	<a class="us_a" href="admin_login.jsp">登录</a>
    <hr />
<h1>填写个人信息</h1>
<% 
	String wid= request.getParameter("wid");
	String shopid = request.getParameter("shopid");
%>
wid=<%=wid%>&nbsp;
shopid=<%=shopid %>
<form action="servlet_scjlcus" >
		<input type="hidden" name="waresid" value=<%=wid %>>
		<input type="hidden" name="shopid" value=<%=shopid %>>
客户id：<input type="text" name="buyerid" value=1><br/><%--之后系统自动获取 --%>
*购买数量：<input type="text" name="waresnumber" value=1><br/>
*收货地址：<input type="text" name="buyeraddress"><br/>
*电话号码：<input type="text" name="buyerphone"><br/>
<input type="submit" value="确定"><br/>
</form>

</body>
</html>