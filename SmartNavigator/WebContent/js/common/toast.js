/*toast*/
function Toast(){
	this.isShowing = false;
	this.isFading = false;
	function toast_init(){
		var toast_html="<div class=\"_s_toast_div\"></div>";
		$("body").prepend(toast_html);
	}

	function finish_toast(){
		this.isShowing = false;
		this.isFading = false;
		$("._s_toast_div").css({"opacity":"1","filter":"alpha(opacity=100)",
			"-moz-opacity":"1","-ms-filter":"progid:DXImageTransform.Microsoft.Alpha(Opacity=100)"})
		$("._s_toast_div").css({"z-index":"-10","display":"none"});	
		//remove
		$("._s_toast_div").remove();
		/*
		var local_url = document.location.href;
		var get = local_url.indexOf("?");
		if(get != -1){
			var url = local_url.substr(0,get);
			location =url;
		}*/
	}

	function fading_toast(){
		this.isFading = true;
		$("._s_toast_div").animate({"opacity":"0.1","filter":"alpha(opacity=10)",
			"-moz-opacity":"0.1","-ms-filter":"progid:DXImageTransform.Microsoft.Alpha(Opacity=10)"}
			,1000,finish_toast);
	}

	this.show = function (message,top,left){
		//add first
		toast_init();
		$("._s_toast_div").html(message);
		$("._s_toast_div").css({"display":"block","z-index":"500"});
		$("._s_toast_div").css({"top":top,"left":left});
		$("._s_toast_div").animate({"opacity":"1"},400,fading_toast);
		this.isShowing = true;
	}
}

function show_toast(message){
	var height = $(window).height();
	var width = $(window).width();
	var toast = new Toast();
	toast.show(message,"200px",width/2-100+"px");
}