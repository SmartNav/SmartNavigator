<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
	<%@ include file="/common/global.jsp"%>
	<%@ include file="/common/meta.jsp"%>
	<%@ include file="/common/common.jsp"%>
	<link rel="stylesheet" type="text/css" href="${ctx }/css/admin/style.css">
	<style>
		#place-list-table{padding-top:30px;}
		#place-list-table th{padding:10px;}
	</style>
	<title>控制台首页</title>
</head>
<body>
<div class="container">
	<c:set var="topnavselect" value="2"/>
	<%@include file="/WEB-INF/views/admin/menu.jsp" %>
	
	
	<div class="main-container">
		
		<c:set var="leftnavselect" value="1"/>
		<%@include file="/WEB-INF/views/admin/hotel/menu.jsp" %>
		<div class="content-container">
		<form method="get" action="${ctx }/admin/discount/delete/handle">
			<table id="place-list-table">
				<tr>
					<th>选择</th>
					<th>标题</th>
					<th>优先级</th>
					<th>内容</th>
					<th>修改</th>
				</tr>
				<c:forEach items="${discounts}" var="discount">
				<tr>
					<td><input type="checkbox" name="${discount.id }"></td>
					<td>${discount.title }</td>
					<td>${discount.priority }</td>
					<td>${discount.content }</td>
					<td><a href="${ctx }/admin/discount/modify?id=${discount.id}">修改</a></td>
				</tr>
				</c:forEach>
			</table>
			<div id="table-menu">
				<input name="placeid" type="hidden" value="${placeid }">
				<ul>
					<li><input type="submit" value="删除"></li>
					<li><a href="${ctx }/admin/discount/add?placeid=${placeid}">增加</a></li>
				</ul>
			</div>
			</form>
		</div>
	</div>
</div>
</body>
</html>
