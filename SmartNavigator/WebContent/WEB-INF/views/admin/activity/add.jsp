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
	</script>
	<title>控制台首页</title>
</head>
<body>
<div class="body-container">
	<c:set var="topnavselect" value="7"/>
	<%@include file="/WEB-INF/views/admin/menu.jsp" %>
	
	
	<div class="main-container">
		<c:set var="leftnavselect" value="3"/>
		<%@include file="/WEB-INF/views/admin/activity/menu.jsp" %>
		
		<div class="content-container">
			<div id="place-add-form">
				<form method="post" action="${ctx }/admin/activity/add/handle" id="place-add-form-form">
					<div><label>标题</label><input name="title" type="text" ></div>
					<div><label>短描述</label><input name="short-des" type="text"></div>
					<div><label>内容</label><input name="content" type="text"></div>
					<input name="placeid" value="${placeid }" type="hidden">
					<div><label>开始日期</label><input name="start-time" id="start-time" type="text"></div>
					<div><label>结束日期</label><input name="end-time" id="end-time" type="text"></div>
					<div><input type="submit"></div>
				</form>
			</div>
		</div>
	</div>
</div>
</body>
</html>
	