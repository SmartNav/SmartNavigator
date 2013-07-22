<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
	<%@ include file="/common/global.jsp"%>
	<%@ include file="/common/meta.jsp"%>
	<%@ include file="/common/common.jsp"%>
	<link rel="stylesheet" type="text/css" href="${ctx }/css/admin/style.css">
	<title>控制台首页</title>
</head>
<body>
<div class="container">
	<c:set var="topnavselect" value="1"/>
	<%@include file="/WEB-INF/views/admin/menu.jsp" %>
	
	
	<div class="main-container">
		<c:set var="leftnavselect" value="1"/>
		<%@include file="/WEB-INF/views/admin/place/menu.jsp" %>
		
		<div class="content-container">
			<div id="place-add-form">
				<form method="post" action="${ctx }/admin/place/add/handle">
					<div><label>地点名</label><input name="name" type="text"></div>
					<div><label>显示最低级别</label><input name="level" type="number"></div>
					<div><label>类型</label><input name="type" type="number"></div>
					<div><label>描述</label><input name="descript" type="text"></div>
					<div><label>经纬度</label><input name="lalong" type="text"></div>
					<div><input type="submit"></div>
				</form>
			</div>
		</div>
	</div>
</div>
</body>
</html>
	