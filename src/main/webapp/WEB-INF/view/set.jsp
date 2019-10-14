<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="/resource/css/bootstrap.min.css">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/js/page.js"></script>
<title>method</title>
</head>
<body>
	<table>
	 <tr>
	   <td>编号</td>
	   <td>名称</td>
	   <td>价格</td>
	   <td>百分比</td>
	 </tr>
	 <c:forEach items="${li}" var="l">
	 <tr>
	   <td>${l.id}</td>
	   <td>${l.name}</td>
	   <td>${l.price}</td>
	   <td>${l.gooRedis}</td>
	 </tr>
	 </c:forEach>
	</table>
	<a href="">上一页</a>
	<a href="">下一页</a>
</body>
</html>