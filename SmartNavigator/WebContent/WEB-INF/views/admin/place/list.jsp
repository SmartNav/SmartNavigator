<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
	<%@ include file="/common/global.jsp"%>
	<%@ include file="/common/meta.jsp"%>
	<%@ include file="/common/common.jsp"%>
	<link rel="stylesheet" type="text/css" href="${ctx }/css/admin/style.css">
	<title>控制台首页</title>
</head>
<body>
<div class="container">
	<div class="top-part">
		<div class="top-user">
			<div id="user-show">
				${admin.name }
				<a href="${ctx }/admin/logout">登出</a>
			</div>
		</div>
		<ul class="top-nav-ul">
			<li><a href="#">兴趣点管理</a></li>
			<li><a href="#">交通信息管理</a></li>
			<li><a href="#">酒店管理</a></li>
			<li><a href="#">餐厅管理</a></li>
			<li><a href="#">活动管理</a></li>
			<li><a href="#">账户设置</a></li>
		</ul>
		<div class="no-float"></div>
	</div>
	
	<div class="main-container">
		<div class="left-nav">
			<ul class="left-nav-ul">
				<li><a href="#"></a></li>
			</ul>
		</div>
		<div class="place-list-container">
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
		</div>
	</div>
</div>
</body>
</html>