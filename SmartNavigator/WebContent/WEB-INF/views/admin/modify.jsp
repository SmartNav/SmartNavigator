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
		.main-container{margin:30px auto;}
	</style>
	<script type="text/javascript">
	$(document).ready(function (){
		var isError = ${not empty param.error};
		var isSuccess = ${not empty param.success};
		if(isError){
			alert("原密码错误");
		}
		if(isSuccess){
			show_toast("操作成功");
		}
	});
	function validateForm(){
		if(isEmpty($("#oldpassword").val())){
			alert("输入原密码");
			return false;
		}
		if(isEmpty($("#password1").val())){
			alert("输入新密码");
			return false;
		}
		if(isEmpty($("#password2").val())){
			alert("重复新密码");
			return false;
		}
		if(!$("#password1").val() == ($("#password2").val())){
			alert("两次输入密码不一致");
			return false;
		}
		return true;
	}
	</script>
	<title>修改密码</title>
</head>
<body>
<div class="body-container">
	<c:set var="topnavselect" value="8"/>
	<%@include file="/WEB-INF/views/admin/menu.jsp" %>
	<div class="main-container">
		<form action="${ctx }/admin/modify/handle" method="post" class="form-horizontal">
			<div class="control-group"><label class="control-label" >原密码</label><input name="oldpassword" id="oldpassword" type="password" class="controls"></div>
			<div class="control-group"><label class="control-label" >新密码</label><input name="password1" id="password1" type="password" class="controls"></div>
			<div class="control-group"><label class="control-label" >确认密码</label><input name="password2" id="password2" type="password" class="controls"></div>
			<div class="control-group"><input type="submit" class="btn controls" onclick="return validateForm();"></div>
		</form>
	</div>
</div>
</body>
</html>