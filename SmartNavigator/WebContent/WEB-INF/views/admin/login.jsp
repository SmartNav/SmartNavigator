<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<%@ include file="/common/global.jsp"%>
	<%@ include file="/common/meta.jsp"%>
	<%@ include file="/common/common.jsp"%>
	<title>智慧导航管理登录</title>
	<style>
		body{margin:auto;}
		.main-container{margin:200px auto 0px 200px;}
	</style>
</head>
<body>
	<form method="post" action="">
		<div class="main-container">
			<label>用户名</label>
			<input name="name" type="text">
			<br/>
			<label>密码</label>
			<input name="password" type="password">
			<br/>
			<input type="submit" value="登录">
		</div>
	</form>
</body>
</html>