<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="left-part">
	<ul id="left-nav-ul">
		<c:if test="${leftnavselect eq 1 }">
			<li><a href="${ctx }/admin/place/list" id="left-nav-ul-selected">兴趣点列表</a></li>
		</c:if>
		<c:if test="${leftnavselect ne 1 }">
			<li><a href="${ctx }/admin/place/list">兴趣点列表</a></li>
		</c:if>
		
		<c:if test="${leftnavselect eq 2 }">
			<li><a href="${ctx }/admin/place/add" id="left-nav-ul-selected">添加兴趣点</a></li>
		</c:if>
		
		<c:if test="${leftnavselect ne 2 }">
			<li><a href="${ctx }/admin/place/add">添加兴趣点</a></li>
		</c:if>
	</ul>
</div>
