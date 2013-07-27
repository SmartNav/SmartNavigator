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
	</style>
	<script type="text/javascript">

	function validateForm(){
		if(!isLalong($("#lalong").val())){
			alert("请按格式输入，以逗号分隔\n经度,维度");
			return false;
		}
		return true;
	}
	</script>
	<title>控制台首页</title>
</head>
<body>
<div class="body-container">
	<c:set var="topnavselect" value="9"/>
	<%@include file="/WEB-INF/views/admin/menu.jsp" %>
	
	
	<div class="main-container">
		<div class="content-container">
			<div id="place-add-form" > 
				<form  class="form-horizontal" method="post" action="${ctx }/admin/path/add/handle" id="place-add-form-form" enctype="multipart/form-data">
					<div class="control-group"><label class="control-label" >添加点的经纬度</label><div class="controls"><input name="lalong" id="lalong" type="text" data-required="true"><span class="icon-asterisk"></span></div></div>
					<div class="control-group"><div class="controls"><input type="submit" onclick="return validateForm()" class="btn"></div></div>
				</form>
			</div>
		</div>
	</div>
</div>
</body>
</html>
	