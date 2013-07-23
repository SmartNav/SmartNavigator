<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="top-head">
	<div class="top-part">
		<div id="top-logo">
			<h2>智慧导航|管理中心</h2>
			<div class="user-show">
				登录用户admin&nbsp;&nbsp;<a href="#">登出</a>
			</div>
		</div>
		
		<div class="no-float"></div>
	</div>
	<div id="top-nav-ul-wrapper">
		<ul id="top-nav-ul">
			<c:if test="${topnavselect eq 1 }">
				<li><a href="${ctx }/admin/place/add" id="top-nav-ul-selected">兴趣点管理</a></li>
			</c:if>
			<c:if test="${topnavselect ne 1 }">
				<li><a href="${ctx }/admin/place/add" >兴趣点管理</a></li>
			</c:if>
			<c:if test="${topnavselect eq 2 }">
				<li><a href="${ctx }/admin/hotel/list" id="top-nav-ul-selected">酒店管理</a></li>
			</c:if>
			<c:if test="${topnavselect ne 2 }">
				<li><a href="${ctx }/admin/hotel/list">酒店管理</a></li>
			</c:if>
			
			<c:if test="${topnavselect eq 3 }">
				<li><a href="${ctx }/admin/restaurant/list" id="top-nav-ul-selected">餐厅管理</a></li>
			</c:if>
			<c:if test="${topnavselect ne 3 }">
				<li><a href="${ctx }/admin/restaurant/list">餐厅管理</a></li>
			</c:if>
			
			<c:if test="${topnavselect eq 4 }">
				<li><a href="${ctx }/admin/scenic/list" id="top-nav-ul-selected">景点管理</a></li>
			</c:if>
			<c:if test="${topnavselect ne 4 }">
				<li><a href="${ctx }/admin/scenic/list">景点管理</a></li>
			</c:if>
			
			<c:if test="${topnavselect eq 5 }">
				<li><a href="${ctx }/admin/activity/list" id="top-nav-ul-selected">活动管理</a></li>
			</c:if>
			<c:if test="${topnavselect ne 5 }">
				<li><a href="${ctx }/admin/activity/list">活动管理</a></li>
			</c:if>
			<c:if test="${topnavselect eq 6 }">
				<li><a href="#" id="top-nav-ul-selected">账户设置</a></li>
			</c:if>
			<c:if test="${topnavselect ne 6 }">
				<li><a href="#">账户设置</a></li>
			</c:if>
		</ul>
	</div>
</div>