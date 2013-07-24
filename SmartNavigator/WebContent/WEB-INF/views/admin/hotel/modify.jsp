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
	<c:set var="topnavselect" value="2"/>
	<%@include file="/WEB-INF/views/admin/menu.jsp" %>
	
	
	<div class="main-container">
		<c:set var="leftnavselect" value="3"/>
		<%@include file="/WEB-INF/views/admin/hotel/menu.jsp" %>
		
		<div class="content-container">
			<div id="place-add-form">
				<form method="post" action="${ctx }/admin/hotel/modify/handle" id="place-add-form-form" enctype="multipart/form-data">
					<div><label>地点名</label><input name="name" type="text" value="${hotel.name }"></div>
					<div><label>显示最低级别</label><input name="level" type="number" value="${hotel.level }"></div>
					<input name="type" value="10" type="hidden">
					<div><label>描述</label><input name="descript" type="text" value="${hotel.description }"></div>
					<div><label>经纬度</label><input name="lalong" type="text" value="${hotel.latitude },${hotel.longitude}"></div>
					<div><label>星级</label><input name="hotel-star" type="number" value="${hotel.star_level }"></div>
					<div><label>最高价格</label><input name="hotel-max-price" type="text" value="${hotel.max_price }"></div>
					<div><label>最低价格</label><input name="hotel-min-price" type="text" value="${hotel.min_price }"></div>
					<div><label>剩余房间</label><input name="hotel-rest-rooms" type="number" value="${hotel.empty_room }"></div>
					<div><label>联系方式</label><input name="hotel-phone" type="number" value="${hotel.tel }"></div>
					<div><label>地址</label><input name="hotel-local" type="text" value="${hotel.place }"></div>
					<div><label>图片</label>
						<c:if test="${not empty hotel.img }">
							<img src="${ctx }${hotel.img}" width="100px;">
						</c:if>
						<input name="img" type="file">
						<input name="deleteimg" type="checkbox">删除图片
					</div>
					<input name="id" value="${hotel.id }" type="hidden">
					<div><input type="submit"></div>
				</form>
			</div>
		</div>
	</div>
</div>
</body>
</html>
	