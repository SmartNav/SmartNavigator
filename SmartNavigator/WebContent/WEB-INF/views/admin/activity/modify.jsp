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
	$(function() {
	    $( "#start-time" ).datepicker({ 
	    	dateFormat:"yy-mm-dd",
	    		defaultDate: "+1w",
	    	      changeMonth: true,
	    	      onClose: function( selectedDate ) {
	    	        $( "#end-time" ).datepicker( "option", "minDate", selectedDate );
	    	  }});
	    $( "#end-time" ).datepicker({
	    	dateFormat:"yy-mm-dd",
	    		defaultDate: "+1w",
	    	      changeMonth: true,
	    	      onClose: function( selectedDate ) {
	    	        $( "#start-time" ).datepicker( "option", "maxDate", selectedDate );
	    }});
	  });
	function validateForm(){
 		if(isEmpty($("#title").val())){
 			alert("请输入标题");
 			return false;
 		}
 		if(isEmpty($("#short-des").val())){
 			alert("请输入短描述");
 			return false;
 		}
 		if(isEmpty($("#content").val())){
 			alert("请输入内容");
 			return false;
 		}
 		if(isEmpty($("#start-time").val())){
 			alert("请选择开始时间");
 			return false;
 		}
 		if(isEmpty($("#end-time").val())){
 			alert("请选择结束时间");
 			return false;
 		}
 		return true;
 	}
	</script>
	<title>控制台首页</title>
</head>
<body>
<div class="body-container">
	<c:set var="topnavselect" value="7"/>
	<%@include file="/WEB-INF/views/admin/menu.jsp" %>
	
	
	<div class="main-container">
		<c:set var="leftnavselect" value="2"/>
		<%@include file="/WEB-INF/views/admin/activity/menu.jsp" %>
		
		<div class="content-container">
			<div id="place-add-form">
				<form method="post" action="${ctx }/admin/activity/modify/handle" id="place-add-form-form">
					<div><label>标题</label><input name="title" type="text" value="${activity.title }"></div>
					<div><label>短描述</label><input name="short-des" type="text" value="${activity.shortDes }"></div>
					<div><label>内容</label><input name="content" type="text" value="${activity.content }"></div>
					<input name="placeid" value="${activity.placeId }" type="hidden">
					<input name="id" value="${activity.id }" type="hidden">
					
					<div><label>开始时间</label><input name="start-time" id="start-time" type="text" value="<fmt:formatDate value="${activity.startTime}" type="date"/>"> </div>
					<div><label>结束时间</label><input name="end-time" id="end-time" type="text" value="<fmt:formatDate value="${activity.endTime}" type="date"/>"> </div>
					<div><input type="submit" class="btn" onclick="return validateForm()"></div>
				</form>
			</div>
		</div>
	</div>
</div>
</body>
</html>
	