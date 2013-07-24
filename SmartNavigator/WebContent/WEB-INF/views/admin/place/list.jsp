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
		#place-list-table{padding-top:30px;}
	</style>
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
			<table id="place-list-table">
				<tr>
					<th>名称</th>
					<th>显示等级</th>
					<th>类型</th>
					<th>描述</th>
					<th>经度</th>
					<th>纬度</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${list}" var="place">
				<tr>
					<td>${place.name }</td>
					<td>${place.level }</td>
					<c:if test="${place.type ==10 }">
						<td>酒店</td>
					</c:if>
					<c:if test="${place.type ==11 }">
						<td>餐馆</td>
					</c:if>
					<c:if test="${place.type ==12 }">
						<td>景点</td>
					</c:if>
					<c:if test="${place.type ==13 }">
						<td>娱乐场所</td>
					</c:if>
					<c:if test="${place.type ==14 }">
						<td>其他</td>
					</c:if>
					<td>${place.description }</td>
					<td>${place.latitude }</td>
					<td>${place.longitude }</td>
					<td>
						<c:if test="${place.type==10 }">
							<a href="${ctx }/admin/hotel/modify?id=${place.id}">修改</a>
						</c:if>
						<c:if test="${place.type==11 }">
							<a href="${ctx }/admin/restaurant/modify?id=${place.id}">修改</a>
						</c:if>
						<c:if test="${place.type==12 }">
							<a href="${ctx }/admin/scenic/modify?id=${place.id}">修改</a>
						</c:if>
						<c:if test="${place.type==13 }">
							<a href="${ctx }/admin/entertainment/modify?id=${place.id}">修改</a>
						</c:if>
						<c:if test="${place.type==14 }">
							<a href="${ctx }/admin/other/modify?id=${place.id}">修改</a>
						</c:if>
						<a href="${ctx }/admin/activity/list?placeid=${place.id}">活动管理</a>
						<c:if test="${place.type==10 or place.type==11 or place.type==13}">
							<a href="${ctx }/admin/discount/list?placeid=${place.id}">优惠</a>
						</c:if>
					</td>
				</tr>
				</c:forEach>
			</table>
			<div class="page-div">
				<c:if test="${page.number > 0 }">
					<a href="${ctx }/admin/place/list?num=${page.number}">上一页</a>
				</c:if>
				<div id="input-page-div">
					<input type="number" id="input-page" value="${page.number+1 }">
					<a href="#" id="page-jump">跳转</a>
					<div>第${page.number+1 }页[共有${page.totalPages }页]</div>
				</div>
				<c:if test="${page.number+1 <  page.totalPages}">
					<a href="${ctx }/admin/place/list?num=${page.number+2}">下一页</a>
				</c:if>
				<div class="no-float"></div>
			</div>
		</div>
	</div>
</div>
</body>
</html>
