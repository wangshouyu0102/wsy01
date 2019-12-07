<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/css.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<form action="query" method="post">
		价格范围：<input type="text" name="minPrice" value="${map.minPrice}"> ~ 
				<input type="text" name="maxPrice" value="${map.maxPrice}">
		已售百分比:<input type="text" name="minSales" value="${map.minSales}"> ~ 
				<input type="text" name="maxSales" value="${map.maxSales}">
		<input type="submit" value="搜索">
	</form>
	
	<table>
		<tr>
			<th>ID</th>
			<th>商品名称</th>
			<th>秒杀价</th>
			<th>已售百分比</th>
		</tr>
		<c:forEach items="${page.list}" var="g">
			<tr>
				<td>${g.id}</td>
				<td>${g.name}</td>
				<td>￥${g.price}</td>
				<td>${g.sales}%</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="4">
				<a href="?pageNum=1">首页</a>
				<a href="?pageNum=${page.pageNum-1<1 ?page.pageNum :page.pageNum-1}">上一页</a>
				当前${page.pageNum}页/总共${page.pages}页
				<a href="?pageNum=${page.pageNum+1>page.pages ?page.pageNum :page.pageNum+1}">下一页</a>
				<a href="?pageNum=${page.pages}">尾页</a>
			</td>
		</tr>
	</table>
</body>
</html>