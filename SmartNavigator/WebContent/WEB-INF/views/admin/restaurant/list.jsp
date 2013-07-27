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
		#place-list-table th{padding:10px;}
	</style>
	<script type="text/javascript">
		function jumpPage(){
			var now = ${page.number +1};
			var max= ${page.totalPages};
			var page =  $("#input-page").val();
			if(isNaN(page)){
				alert("输入页数应为数字");
				return;
			}
			page = parseInt(page);
			if(page > 0 && page <= max){
				location.href = "${ctx}/admin/restaurant/list?num="+page;	
			}else{
				alert("没有第"+page+"页");
				$("#input-page").val(now);
			}
		}
	</script>
	<title>控制台首页</title>
</head>
<body>
<div class="body-container">
	<c:set var="topnavselect" value="3"/>
	<%@include file="/WEB-INF/views/admin/menu.jsp" %>
	
	
	<div class="main-container">
		
		<c:set var="leftnavselect" value="1"/>
		<%@include file="/WEB-INF/views/admin/restaurant/menu.jsp" %>
		<div class="content-container">
		<form method="get" action="${ctx }/admin/restaurant/delete/handle">
			<table id="place-list-table">
				<tr>
					<th>选择</th>
					<th>名称</th>
					<th>显示等级</th>
					<th>描述</th>
					<th>经度</th>
					<th>纬度</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${list}" var="restaurant">
				<tr>
					<td><input type="checkbox" name="${restaurant.id }"></td>
					<td>${restaurant.name }</td>
					<td>${restaurant.level }</td>
					<td>${restaurant.description }</td>
					<td>${restaurant.latitude }</td>
					<td>${restaurant.longitude }</td>
					<td>
						<a href="${ctx }/admin/restaurant/modify?id=${restaurant.id}" class="btn">修改</a>
						<a href="${ctx }/admin/discount/list?placeid=${restaurant.id}" class="btn">优惠</a>
					</td>
				</tr>
				</c:forEach>
			</table>
			<div id="table-menu">
				<ul class="menu-group">
					<li><input type="submit" value="删除" class="btn btn-danger"></li>
				</ul>
			</div>
			</form>
			
			<div class="page-div">
				<c:if test="${page.number > 0 }">
					<a href="${ctx }/admin/place/list?num=${page.number}" class="btn">上一页</a>
				</c:if>
				<div id="input-page-div">
					<input type="number" id="input-page" value="${page.number+1 }">
					<a href="#" id="page-jump" class="btn  btn-info" onclick="jumpPage()">跳转</a>
					<div>第${page.number+1 }页[共有${page.totalPages }页]</div>
				</div>
				<c:if test="${page.number+1 <  page.totalPages}">
					<a href="${ctx }/admin/place/list?num=${page.number+2}" class="btn">下一页</a>
				</c:if>
				<div class="no-float"></div>
			</div>
		</div>
	</div>
</div>
</body>
</html>
