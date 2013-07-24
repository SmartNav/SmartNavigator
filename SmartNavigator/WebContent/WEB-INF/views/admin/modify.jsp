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
	<c:set var="topnavselect" value="1"/>
	<%@include file="/WEB-INF/views/admin/menu.jsp" %>
	<div class="main-container">
		<form action="${ctx }/admin/modify/handle" method="post">
			<div><label>原密码</label><input name="oldpassword" type="password"></div>
			<div><label>新密码</label><input name="password1" type="password"></div>
			<div><label>确认密码</label><input name="password2" type="password"></div>
		</form>
	</div>
</div>
</body>
</html>