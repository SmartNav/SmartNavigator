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
	<c:if test="${place.type == 10 }">
		<c:set var="topnavselect" value="2"/>
	</c:if>
	<c:if test="${place.type == 11 }">
		<c:set var="topnavselect" value="3"/>
	</c:if>
	<c:if test="${place.type == 12 }">
		<c:set var="topnavselect" value="4"/>
	</c:if>
	<c:if test="${place.type == 13 }">
		<c:set var="topnavselect" value="5"/>
	</c:if>
	<c:if test="${place.type == 14 }">
		<c:set var="topnavselect" value="6"/>
	</c:if>
	<%@include file="/WEB-INF/views/admin/menu.jsp" %>
	
	
	<div class="main-container">
		
		<c:set var="leftnavselect" value="2"/>
		<c:if test="${place.type == 10 }">
			<%@include file="/WEB-INF/views/admin/hotel/menu.jsp" %>
		</c:if>
		<c:if test="${place.type == 11 }">
			<%@include file="/WEB-INF/views/admin/restaurant/menu.jsp" %>
		</c:if>
		<c:if test="${place.type == 12 }">
			<%@include file="/WEB-INF/views/admin/scenic/menu.jsp" %>
		</c:if>
		<c:if test="${place.type == 13 }">
			<%@include file="/WEB-INF/views/admin/entertainment/menu.jsp" %>
		</c:if>
		<c:if test="${place.type == 14 }">
			<%@include file="/WEB-INF/views/admin/other/menu.jsp" %>
		</c:if>
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
				<input name="placeid" type="hidden" value="${place.id }">
				<ul>
					<li><input type="submit" value="删除"></li>
					<li><a href="${ctx }/admin/discount/add?placeid=${place.id}">增加</a></li>
				</ul>
			</div>
			</form>
		</div>
	</div>
</div>
</body>
</html>
