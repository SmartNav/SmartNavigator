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
	<div class="top-part">
		<div class="top-user">
			<div id="user-show">
				${admin.name }
				<a href="${ctx }/admin/logout">登出</a>
			</div>
		</div>
		<ul class="top-nav-ul">
			<li><a href="#">兴趣点管理</a></li>
			<li><a href="#">交通信息管理</a></li>
			<li><a href="#">酒店管理</a></li>
			<li><a href="#">餐厅管理</a></li>
			<li><a href="#">活动管理</a></li>
			<li><a href="#">账户设置</a></li>
		</ul>
		<div class="no-float"></div>
	</div>
	
	<div class="main-container">
		<div class="place-add-container">
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