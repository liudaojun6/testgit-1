<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.vo.historyorder"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>查看历史记录</title>
<link rel="stylesheet" href="page.css">
</head>
<body>
    <a class="us_a" href="servlet_yhspxx">商品首页</a>
    <a class="us_a" href="servlet_spxx">已上传商品</a>
    <a class="us_a" href="servlet_jl">查看申请记录</a>
    <a class="us_a" href="servlet_lsjl">查看历史记录</a>
    <a class="us_a" href="admin/admin_change.jsp">修改密码</a>
    <a class="us_a" href="admin/admin_waresup.jsp">上传商品</a>
    <a class="us_a" href="servlet_tcdl">退出登录</a>
    <hr />
<table border="1">
	<tr>
		<td>订单id</td>
		<td>商品id</td>
		<td>客户id</td>
		<td>商家id</td>
		<td>商品交易数量</td>
		<td>交易时间</td>
		<td>买家电话</td>
		<td>买家地址</td>
	</tr>
	<%
		List<historyorder> asd= new ArrayList<historyorder>();
		asd=(List<historyorder>)session.getAttribute("lsjlxx");
		Iterator it =asd.iterator();
		historyorder qwe=null;
		while(it.hasNext()){
			qwe=new historyorder();
			qwe=(historyorder)it.next();
			%>
				<tr>
					<td><%=qwe.getHistoryid() %></td>
					<td><%=qwe.getWaresid() %></td>
					<td><%=qwe.getBuyerid() %></td>
					<td><%=qwe.getShopid() %></td>
					<td><%=qwe.getWaresnumber()%></td>
					<td><%=qwe.getFinishtime() %></td>
					<td><%=qwe.getBuyerphone() %></td>
					<td><%=qwe.getBuyeraddress() %></td>
				</tr>
			<%
		}
	%>
</body>
</html>