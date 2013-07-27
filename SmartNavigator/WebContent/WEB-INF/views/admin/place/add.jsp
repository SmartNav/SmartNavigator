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
	</style>
	<script type="text/javascript">
		$(document).ready(function (){
			var success = ${not empty param.success};
			var error = ${not empty param.error};
			if(success){
				show_toast("操作成功");
			}
			if(error){
				alert("操作失败,请检查数据并重试");
			}
			$(".form-show-option").css({"display":"none"});
			$("#form-hotel-show").css({"display":"block"});
			listenChanges();
		});
		
		function listenChanges(){
			listenSelector();
		}
		
		function listenSelector(){
			var actionList = new Array("${ctx}/admin/hotel/add/handle","${ctx}/admin/restaurant/add/handle","${ctx}/admin/scenic/add/handle","${ctx}/admin/entertainment/add/handle","${ctx}/admin/other/add/handle");
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
		
		function validateForm(){
			var select = $("#type-select").val();
			var common = commonValidate();
			if(!common) return false;
			switch(select){
			case "10":
				return hotelValidate();
				break;
			case "11":
				return restValidate();
				break;
			case "12":
				return scenicValidate();
				break;
			case "13":
				return enterValidate();
				break;
			case "14":
				return otherValidate();
				break;
			}
		}
		
	</script>
	<title>控制台首页</title>
</head>
<body>
<div class="body-container">
	<c:set var="topnavselect" value="1"/>
	<%@include file="/WEB-INF/views/admin/menu.jsp" %>
	
	
	<div class="main-container">
		<c:set var="leftnavselect" value="2"/>
		<%@include file="/WEB-INF/views/admin/place/menu.jsp" %>
		
		<div class="content-container">
			<div id="place-add-form" > 
				<form  class="form-horizontal" method="post" action="${ctx }/admin/hotel/add/handle" id="place-add-form-form" enctype="multipart/form-data">
					<div class="control-group"><label class="control-label" >地点名</label><div class="controls"><input name="name" id="name" type="text" data-required="true"><span class="icon-asterisk"></span></div></div>
					<div class="control-group"><label class="control-label" >显示最低级别</label><div class="controls"><input name="level" id="level" type="number" data-required="true"><span class="icon-asterisk"></span></div></div>
					<div class="control-group"><label class="control-label" >类型</label>
					<div class="controls">
					<select id="type-select" name="type">
						<option value="10">酒店</option>
						<option value="11">餐馆</option>
						<option value="12">景点</option>
						<option value="13">娱乐场所</option>
						<option value="14">其他</option>
					</select>
					</div>
					</div>
					<div class="control-group"><label class="control-label" >简介</label><div class="controls"><input name="descript" id="descript" type="text" ><span class="icon-asterisk"></span></div></div>
					<div class="control-group"><label class="control-label" >详细描述</label><div class="controls"><textarea name="description" id="description" rows="4" ></textarea><span class="icon-asterisk"></span></div></div>
					<div class="control-group"><label class="control-label" >经纬度</label><div class="controls"><input name="lalong" id="lalong" type="text"><span class="icon-asterisk"></span></div></div>
					<div class="control-group"><label class="control-label" >地址</label><div class="controls"><input name="local" id="local" type="text"><span class="icon-asterisk"></span></div></div>
					<div id="form-hotel-show" class="form-show-option">
						<div class="control-group"><label class="control-label" >星级</label><div class="controls"><input name="hotel-star" id="hotel-star" type="number"><span class="icon-asterisk"></span></div></div>
						<div class="control-group"><label class="control-label" >最高价格</label><div class="controls"><input name="hotel-max-price" id="hotel-max-price" type="text"><span class="icon-asterisk"></span></div></div>
						<div class="control-group"><label class="control-label" >最低价格</label><div class="controls"><input name="hotel-min-price" id="hotel-min-price" type="text"><span class="icon-asterisk"></span></div></div>
						<div class="control-group"><label class="control-label" >剩余房间</label><div class="controls"><input name="hotel-rest-rooms" id="hotel-rest-rooms" type="number"><span class="icon-asterisk"></span></div></div>
						<div class="control-group"><label class="control-label" >联系方式</label><div class="controls"><input name="hotel-phone" id="hotel-phone" type="number"><span class="icon-asterisk"></span></div></div>
						
					</div>
					<div id="form-restaurant-show" class="form-show-option">
						<div class="control-group"><label class="control-label" >口味</label><div class="controls"><input name="rest-flavor" id="rest-flavor" type="text"><span class="icon-asterisk"></span></div></div>
						<div class="control-group"><label class="control-label" >人均消费</label><div class="controls"><input name="rest-avg-price" id="rest-avg-price" type="text"><span class="icon-asterisk"></span></div></div>
						<div class="control-group"><label class="control-label" >联系方式</label><div class="controls"><input name="rest-phone" id="rest-phone" type="number"><span class="icon-asterisk"></span></div></div>
					</div>
					<div id="form-scenic-show" class="form-show-option">
						<div class="control-group"><label class="control-label" >星级</label><div class="controls"><input name="scenic-star" id="scenic-star" type="number"><span class="icon-asterisk"></span></div></div>
					</div>
					<div id="form-entertainment-show" class="form-show-option">
						<div class="control-group"><label class="control-label" >联系方式</label><div class="controls"><input name="enter-phone" id="enter-phone" type="number"><span class="icon-asterisk"></span></div></div>
					</div>
					<div class="control-group"><label class="control-label" >图片</label><div class="controls"><input name="img" type="file" id="img"></div></div>
					<div class="control-group"><div class="controls"><input type="submit" class="btn" onclick="return validateForm()"></div></div>
				</form>
			</div>
		</div>
	</div>
</div>
</body>
</html>
	