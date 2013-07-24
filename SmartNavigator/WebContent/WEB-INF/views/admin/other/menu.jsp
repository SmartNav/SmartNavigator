<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="left-part">
	<ul id="left-nav-ul">
		<c:if test="${leftnavselect eq 1 }">
			<li><a href="${ctx }/admin/hotel/list" id="left-nav-ul-selected">列表管理</a></li>
		</c:if>
		<c:if test="${leftnavselect ne 1 }">
			<li><a href="${ctx }/admin/hotel/list">列表管理</a></li>
		</c:if>
		
		<c:if test="${leftnavselect eq 2 }">
		<c:if test="${leftnavselect eq 2 }">
			<li><a href="${ctx }/admin/place/add" id="left-nav-ul-selected">添加优惠</a></li>
		</c:if>
		
		<c:if test="${leftnavselect ne 2 }">
			<li><a href="${ctx }/admin/place/add">添加优惠</a></li>
		</c:if>
		</c:if>
		
		<c:if test="${leftnavselect eq 3 }">
			<c:if test="${leftnavselect eq 3 }">
				<li><a href="#" id="left-nav-ul-selected">修改地点</a></li>
			</c:if>
			
			<c:if test="${leftnavselect ne 3 }">
				<li><a href="#">修改地点</a></li>
			</c:if>
		</c:if>
	</ul>
</div>
