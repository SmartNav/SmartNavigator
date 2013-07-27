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
<div class="body-container">
	<c:set var="topnavselect" value="7"/>
	<%@include file="/WEB-INF/views/admin/menu.jsp" %>
	
	
	<div class="main-container">
		
		<c:set var="leftnavselect" value="1"/>
		<%@include file="/WEB-INF/views/admin/activity/menu.jsp" %>
		<div class="content-container">
		<form method="get" action="${ctx }/admin/activity/delete/handle">
			<table id="place-list-table" class="table">
				<tr>
					<th>选择</th>
					<th>标题</th>
					<th>简介</th>
					<th>内容</th>
					<th>开始时间</th>
					<th>结束时间</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${activities}" var="activity">
				<tr>
					<td><input type="checkbox" name="${activity.id }"></td>
					<td>${activity.title }</td>
					<td>${activity.shortDes }</td>
					<td>${activity.content }</td>
					<td>${activity.startTime }</td>
					<td>${activity.endTime }</td>
					<td><a href="${ctx }/admin/activity/modify?id=${activity.id}" class="btn">修改</a></td>
				</tr>
				</c:forEach>
			</table>
			<div id="table-menu">
				<input name="placeid" type="hidden" value="${placeid }">
				<ul class="menu-group">
					<li><input type="submit" value="删除" class="btn btn-danger"></li>
					<li><a href="${ctx }/admin/activity/add?placeid=${placeid}" class="btn btn-primary">增加</a></li>
					<li class="no-float"></li>
				</ul>
				
			</div>
			</form>
			
		</div>
	</div>
</div>
</body>
</html>
