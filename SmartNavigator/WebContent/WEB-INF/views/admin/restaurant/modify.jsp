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
<div class="container">
	<c:set var="topnavselect" value="3"/>
	<%@include file="/WEB-INF/views/admin/menu.jsp" %>
	
	
	<div class="main-container">
		<c:set var="leftnavselect" value="2"/>
		<%@include file="/WEB-INF/views/admin/restaurant/menu.jsp" %>
		
		<div class="content-container">
			<div id="place-add-form">
				<form method="post" action="${ctx }/admin/restaurant/modify/handle" id="place-add-form-form"  enctype="multipart/form-data">
					<div><label>地点名</label><input name="name" type="text" value="${restaurant.name }"></div>
					<div><label>显示最低级别</label><input name="level" type="number" value="${restaurant.level }"></div>
					<input name="type" value="11" type="hidden">
					<div><label>描述</label><input name="descript" type="text" value="${restaurant.description }"></div>
					<div><label>经纬度</label><input name="lalong" type="text" value="${restaurant.latitude },${restaurant.longitude}"></div>
					<div><label>口味</label><input name="rest-flavor" type="text" value="${restaurant.flavor }"></div>
					<div><label>人均消费</label><input name="rest-avg-price" type="text" value="${restaurant.avg_price }"></div>
					<div><label>联系方式</label><input name="rest-phone" type="number" value="${restaurant.tel }"></div>
					<div><label>地址</label><input name="rest-local" type="text" value="${restaurant.place }"></div>
					<div><label>图片</label>
						<c:if test="${not empty restaurant.img }">
							<img src="${ctx }${restaurant.img}" width="100px;">
						</c:if>
						<input name="img" type="file">
						<input name="deleteimg" type="checkbox">删除图片
					</div>
					<input name="id" value="${restaurant.id }" type="hidden">
					<div><input type="submit"></div>
				</form>
			</div>
		</div>
	</div>
</div>
</body>
</html>
	