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
	</style>
	<title>控制台首页</title>
</head>
<body>
<div class="container">
	<c:set var="topnavselect" value="1"/>
	<%@include file="/WEB-INF/views/admin/menu.jsp" %>
	
	
	<div class="main-container">
		<c:set var="leftnavselect" value="1"/>
		<%@include file="/WEB-INF/views/admin/place/menu.jsp" %>
		
		<div class="content-container">
			<table id="place-list-table">
				<tr>
					<th>名称</th>
					<th>显示等级</th>
					<th>类型</th>
					<th>描述</th>
					<th>经度</th>
					<th>纬度</th>
				</tr>
				<c:forEach items="${list}" var="place">
				<tr>
					<td>${place.name }</td>
					<td>${place.level }</td>
					<td>${place.type }</td>
					<td>${place.description }</td>
					<td>${place.latitude }</td>
					<td>${place.longitude }</td>
				</tr>
				</c:forEach>
			</table>
			${page.number } ${page.totalPages }
			<div class="page-div">
				<c:if test="${page.number > 0 }">
					<a href="${ctx }/admin/place/list?num=${page.number}">上一页</a>
				</c:if>
				<div id="input-page-div">
					<input type="number" id="input-page" value="${page.number+1 }">
					<a>跳转</a>
					<div>第${page.number+1 }页[共有${page.totalPages }页]</div>
				</div>
				<c:if test="${page.number+1 <  page.totalPages}">
					<a href="${ctx }/admin/place/list?num=${page.number+2}">下一页</a>
				</c:if>
			</div>
		</div>
	</div>
</div>
</body>
</html>
