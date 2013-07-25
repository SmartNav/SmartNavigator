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
	</script>
	<title>控制台首页</title>
</head>
<body>
<div class="body-container">
	<c:set var="topnavselect" value="4"/>
	<%@include file="/WEB-INF/views/admin/menu.jsp" %>
	
	
	<div class="main-container">
		<c:set var="leftnavselect" value="3"/>
		<%@include file="/WEB-INF/views/admin/scenic/menu.jsp" %>
		
		<div class="content-container">
			<div id="place-add-form">
				<form method="post" action="${ctx }/admin/scenic/modify/handle" id="place-add-form-form"  enctype="multipart/form-data">
					<div><label>地点名</label><input name="name" type="text" value="${scenic.name }"></div>
					<div><label>显示最低级别</label><input name="level" type="number" value="${scenic.level }"></div>
					<input name="type" value="11" type="hidden">
					<div><label>短描述</label><input name="descript" type="text" value="${place.description }"></div>
					<div><label>详细描述</label><textarea name="description" >${scenic.description }</textarea></div>
					<div><label>经纬度</label><input name="lalong" type="text" value="${scenic.latitude },${scenic.longitude}"></div>
					<div><label>星级</label><input name="scenic-star" type="number" value="${scenic.star }"></div>
					<div><label>地址</label><input name="local" type="text" value="${scenic.place }"></div>
					<div><label>图片</label>
						<c:if test="${not empty scenic.img }">
							<img src="${ctx }${scenic.img}" width="100px;">
						</c:if>
						<input name="img" type="file">
						<input name="deleteimg" type="checkbox" >删除图片
					</div>
					<input name="id" value="${scenic.id }" type="hidden">
					<div><input type="submit" class="btn"></div>
				</form>
			</div>
		</div>
	</div>
</div>
</body>
</html>
	