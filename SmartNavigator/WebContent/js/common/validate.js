function commonValidate(){
			if(isEmpty($("#name").val())){
				alert("名称不能为空");
				return false;
			}
			if(isEmpty($("#level").val())){
				alert("请填写显示级别");
				return false;
			}
			if(!isIntBetween(1,19,$("#level").val())){
				alert("显示级别介于1到19之间");
				return false;
			}
			if(isEmpty($("#descript").val())){
				alert("请填写简介");
				return false;
			}
			if(isEmpty($("#description").val())){
				alert("请填写详细描述");
				return false;
			}
			if(!isLalong($("#lalong").val())){
				alert("请填写正确的经纬度\n格式：经度,纬度");
				return false;
			}
			if(isEmpty($("#local").val())){
				alert("请填写地址");
				return false;
			}
			return true;
		}
		function hotelValidate(){
			if(!isIntBetween(0,5,$("#hotel-star").val())){
				alert("酒店星级应从0至5");
				return false;
			}
			if(isEmpty($("#hotel-max-price").val())){
				alert("请输入最高价格");
				return false;
			}
			if(isNaN($("#hotel-max-price").val())){
				alert("最高价格应为数字");
				return false;
			}
			if(isEmpty($("#hotel-min-price").val())){
				alert("请输入最低价格");
				return false;
			}
			if(isNaN($("#hotel-min-price").val())){
				alert("最低价格应为数字");
				return false;
			}
			if(isEmpty($("#hotel-rest-rooms").val())){
				alert("请输入剩余房间数");
				return false;
			}
			if(!isInt($("#hotel-rest-rooms").val())){
				alert("剩余房间数应为整数");
				return false;
			}
			if(isEmpty($("#hotel-phone").val())){
				alert("请输入联系方式");
				return false;
			}
			if(!isInt($("#hotel-phone").val())){
				alert("联系方式应为数字");
				return false;
			}
			return true;
		}
		function restValidate(){
			if(isEmpty($("#rest-flavor").val())){
				alert("请输入口味");
				return false;
			}
			if(isEmpty($("#rest-avg-price").val())){
				alert("请输入人均消费水平");
				return false;
			}
			if(isEmpty($("#rest-phone").val())){
				alert("请输入联系方式");
				return false;
			}
			if(!isInt($("#rest-phone").val())){
				alert("联系方式应为数字");
				return false;
			}
			return true;
		}
		function scenicValidate(){
			if(!isIntBetween(0,5,$("#scenic-star").val())){
				alert("酒店星级应从0至5");
				return false;
			}
			return true;
		}
		function enterValidate(){
			if(isEmpty($("#enter-phone").val())){
				alert("请输入联系方式");
				return false;
			}
			if(!isInt($("#enter-phone").val())){
				alert("联系方式应为数字");
				return false;
			}
			return true;
		}
		function otherValidate(){
			return true;
		}
		
		function isEmpty(value){
			return value == null || value.trim()=="";
		}
		
		function isLalong(value){
			if(isEmpty(value)) return false;
			var array = value.split(',');
			if(array.length != 2) return false;
			return !(isNaN(array[1]) || isNaN(array[1]));
		}
		
		function isIntBetween(min,max,value){
			if(isEmpty(value)) return false;
			if(isNaN(value))return false;
			return value >= min && value <= max;
		}
		
		function isInt(value){
			var r = /^\+?[1-9][0-9]*$/;
			return r.test(value);
		}