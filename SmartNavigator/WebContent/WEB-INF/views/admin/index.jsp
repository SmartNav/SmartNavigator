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
		
	</div>
</div>
</body>
</html>