<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="top-head">
	<div class="top-part">
		<div id="top-logo">
			<h2>智慧导航|管理中心</h2>
			<div class="user-show">
				您好，${admin.name}，欢迎进入智能导航管理中心.&nbsp;<a href="${ctx }/admin/logout"><img alt="退出" src="${ctx }/img/out.gif"></a>
			</div>
		</div>
		
		<div class="no-float"></div>
	</div>
	<div id="top-nav-ul-wrapper">
		<ul id="top-nav-ul">
			<c:if test="${topnavselect eq 1 }">
				<li><a href="${ctx }/admin/place/list" id="top-nav-ul-selected">所有兴趣点</a></li>
			</c:if>
			<c:if test="${topnavselect ne 1 }">
				<li><a href="${ctx }/admin/place/list" >所有兴趣点</a></li>
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
				<li><a href="${ctx }/admin/entertainment/list" id="top-nav-ul-selected">娱乐场所管理</a></li>
			</c:if>
			<c:if test="${topnavselect ne 5 }">
				<li><a href="${ctx }/admin/entertainment/list">娱乐场所管理</a></li>
			</c:if>
			
			<c:if test="${topnavselect eq 6 }">
				<li><a href="${ctx }/admin/other/list" id="top-nav-ul-selected">其他兴趣点管理</a></li>
			</c:if>
			<c:if test="${topnavselect ne 6 }">
				<li><a href="${ctx }/admin/other/list">其他兴趣点管理</a></li>
			</c:if>
			<c:if test="${topnavselect eq 7 }">
			<c:if test="${topnavselect eq 7 }">
				<li><a href="#" id="top-nav-ul-selected">活动管理</a></li>
			</c:if>
			<c:if test="${topnavselect ne 7 }">
				<li><a href="#">活动管理</a></li>
			</c:if>
			</c:if>
			
			<c:if test="${topnavselect eq 9 }">
				<li><a href="${ctx }/admin/path/add" id="top-nav-ul-selected">道路管理</a></li>
			</c:if>
			<c:if test="${topnavselect ne 9 }">
				<li><a href="${ctx }/admin/path/add">道路管理</a></li>
			</c:if>
			<c:if test="${topnavselect eq 8 }">
				<li><a href="${ctx }/admin/modify" id="top-nav-ul-selected">账户设置</a></li>
			</c:if>
			<c:if test="${topnavselect ne 8 }">
				<li><a href="${ctx }/admin/modify">账户设置</a></li>
			</c:if>
		</ul>
	</div>
</div>
