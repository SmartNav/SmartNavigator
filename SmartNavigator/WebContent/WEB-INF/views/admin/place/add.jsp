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
		$(document).ready(function (){
			listenChanges();
		});
		
		function listenChanges(){
			listenSelector();
		}
		
		function listenSelector(){
			var actionList = new Array("${ctx}/admin/hotel/add/handle","${ctx}/admin/restaurant/add/handle","${ctx}/admin/scenic/add/handle","${ctx}/admin/entertainment/add/handle","${ctx}/admin/place/add/handle");
			$("#type-select").change(function(){
				$(".form-show-option").css({"display":"none"});
				var select = $("#type-select").val();
				switch(select){
				case "10":
					console.log("10");
					$("#form-hotel-show").css({"display":"block"});
					$("#place-add-form-form").attr("action",actionList[0]);
					break;
				case "11":
					$("#form-restaurant-show").css({"display":"block"});
					$("#place-add-form-form").attr("action",actionList[1]);
					break;
				case "12":
					$("#form-scenic-show").css({"display":"block"});
					$("#place-add-form-form").attr("action",actionList[2]);
					break;
				case "13":
					$("#form-entertainment-show").css({"display":"block"});
					$("#place-add-form-form").attr("action",actionList[3]);
					break;
				case "14":
					$("#place-add-form-form").attr("action",actionList[4]);
					break;
				}
			});
		}
	</script>
	<title>控制台首页</title>
</head>
<body>
<div class="container">
	<c:set var="topnavselect" value="1"/>
	<%@include file="/WEB-INF/views/admin/menu.jsp" %>
	
	
	<div class="main-container">
		<c:set var="leftnavselect" value="2"/>
		<%@include file="/WEB-INF/views/admin/place/menu.jsp" %>
		
		<div class="content-container">
			<div id="place-add-form">
				<form method="post" action="${ctx }/admin/place/add/handle" id="place-add-form-form">
					<div><label>地点名</label><input name="name" type="text"></div>
					<div><label>显示最低级别</label><input name="level" type="number"></div>
					<div><label>类型</label>
					<select id="type-select" name="type">
						<option value="10">酒店</option>
						<option value="11">餐馆</option>
						<option value="12">景点</option>
						<option value="13">娱乐场所</option>
						<option value="14">其他</option>
					</select>
					</div>
					<div><label>描述</label><input name="descript" type="text"></div>
					<div><label>经纬度</label><input name="lalong" type="text"></div>
					<div id="form-hotel-show" class="form-show-option">
						<div><label>星级</label><input name="hotel-star" type="number"></div>
						<div><label>最高价格</label><input name="hotel-max-price" type="text"></div>
						<div><label>最低价格</label><input name="hotel-min-price" type="text"></div>
						<div><label>剩余房间</label><input name="hotel-rest-rooms" type="number"></div>
						<div><label>联系方式</label><input name="hotel-phone" type="number"></div>
						<div><label>地址</label><input name="hotel-local" type="text"></div>
					</div>
					<div id="form-restaurant-show" class="form-show-option">
						<div><label>人均消费</label><input name="rest-avg-price" type="text"></div>
						<div><label>联系方式</label><input name="rest-phone" type="number"></div>
						<div><label>地址</label><input name="rest-local" type="text"></div>
					</div>
					<div id="form-scenic-show" class="form-show-option">
						<div><label>星级</label><input name="scenic-star" type="number"></div>
						<div><label>地址</label><input name="scenic-local" type="text"></div>
					</div>
					<div id="form-entertainment-show" class="form-show-option">
						<div><label>联系方式</label><input name="enter-phone" type="number"></div>
						<div><label>地址</label><input name="enter-local" type="text"></div>
					</div>
					<div><input type="submit"></div>
				</form>
			</div>
		</div>
	</div>
</div>
</body>
</html>
	