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
		if(commonValidate() && enterValidate()){
			return true;
		}
		return false;
	}
	</script>
	<title>控制台首页</title>
</head>
<body>
<div class="body-container">
	<c:set var="topnavselect" value="5"/>
	<%@include file="/WEB-INF/views/admin/menu.jsp" %>
	
	
	<div class="main-container">
		<c:set var="leftnavselect" value="3"/>
		<%@include file="/WEB-INF/views/admin/entertainment/menu.jsp" %>
		
		<div class="content-container">
			<div id="place-add-form">
				<form method="post" action="${ctx }/admin/entertainment/modify/handle" id="place-add-form-form"  enctype="multipart/form-data">
					<div><label>地点名</label><input name="name" type="text" id="name" value="${entertainment.name }"></div>
					<div><label>显示最低级别</label><input name="level" type="number" id="level" value="${entertainment.level }"></div>
					<input name="type" value="11" type="hidden">
					
					<div><label>短描述</label><input name="descript" type="text" id="descript" value="${place.description }"></div>
					<div><label>详细描述</label><textarea name="description" id="description">${entertainment.description }</textarea></div>
					<div><label>经纬度</label><input name="lalong" type="text" id="lalong" value="${entertainment.latitude },${entertainment.longitude}"></div>
					<div><label>联系方式</label><input name="enter-phone" id="enter-phone" type="number" value="${entertainment.tel }"></div>
					<div><label>地址</label><input name="local" id="local" type="text" value="${entertainment.place }"></div>
					<div><label>图片</label>
						<c:if test="${not empty entertainment.img }">
							<img src="${ctx }${entertainment.img}" width="100px;">
						</c:if>
						<input name="img" type="file">
						<input name="deleteimg" type="checkbox">删除图片
					</div>
					<input name="id" value="${entertainment.id }" type="hidden">
					<div><input type="submit" onclick="return validateForm()" class="btn btn-primary"></div>
				</form>
			</div>
		</div>
	</div>
</div>
</body>
</html>
	