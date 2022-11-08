<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>发布商品</title>
<link rel="stylesheet" href="page.css">
<script type="text/javascript">
<%
String result=(String)session.getAttribute("fabu_result");
if(result!=null){%>
	alert("<%=result%>");
	<%session.setAttribute("fabu_result", null);
}%>
</script>
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
    
<form action="../servlet_tjsp">
	*商品名称：<input type="text" name="waresname"><br/>
	*商品价格：<input type="text" name="waresprice">(元)<br/>
	*商品库存：<input type="text" name="waresnumber"><br/>
	*商品图片：<a href="FileUpload.jsp">上传图片</a><br/>
	  商品类别：<input type="text" name="waresclass"><br/>
	  营销信息：<input type="text" name="matketing"><br/>
	<input type="submit" value="发布">
	</form>
</body>
</html>