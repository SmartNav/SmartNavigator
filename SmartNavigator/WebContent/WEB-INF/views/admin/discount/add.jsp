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
		#place-add-form{padding-top:30px;}
		#place-add-form div{line-height:2.5rem;}
		.form-show-option{display:none;}
	</style>
	<script type="text/javascript">
	function validateForm(){
 		if(isEmpty($("title").val())){
 			alert("请输入标题");
 			return false;
 		}
 		if(isEmpty($("priority").val())){
 			alert("请输入优先级");
 			return false;
 		}
 		if(!isIntBetween($("priority").val())){
 			alert("优先级应从1到10");
 			return false;
 		}
 		if(isEmpty($("content").val())){
 			alert("请输入内容");
 			return false;
 		}
 		return true;
 	}

	function isIntBetween(min,max,value){
		if(isEmpty(value)) return false;
		if(isNaN(value))return false;
		return value >= min && value <= max;
	}
	
	function isEmpty(value){
		return value == null || value.trim()=="";
	}
	</script>
	<title>控制台首页</title>
</head>
<body>
<div class="body-container">
	<c:set var="topnavselect" value="1"/>
	<%@include file="/WEB-INF/views/admin/menu.jsp" %>
	
	
	<div class="main-container">
		<c:set var="leftnavselect" value="2"/>
		<%@include file="/WEB-INF/views/admin/place/menu.jsp" %>
		
		<div class="content-container">
			<div id="place-add-form">
				<form method="post" action="${ctx }/admin/discount/add/handle" id="place-add-form-form">
					<div><label>标题</label><input name="title" id="title" type="text" ></div>
					<div><label>优先级</label><input name="priority" id="priority" type="number"></div>
					<input name="placeid" value="${placeid }" type="hidden">
					<div><label>打折信息</label><input name="content" id="content" type="text"></div>
					<div><input type="submit" onclick="return validateForm()" class="btn btn-primary"></div>
				</form>
			</div>
		</div>
	</div>
</div>
</body>
</html>
	