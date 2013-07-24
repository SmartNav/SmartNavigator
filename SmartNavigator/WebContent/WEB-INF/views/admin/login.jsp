<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/common/global.jsp"%>
<%@ include file="/common/meta.jsp"%>
<%@ include file="/common/common.jsp"%>
<title>智慧导航管理登录</title>

<link rel="stylesheet" type="text/css" href="${ctx }/css/common/style.css" />
</head>

<body>
	<form id="login-form" action="http://www.865171.cn" method="post">
  <fieldset>
  <legend>Log in</legend>
  <label for="login">Email</label>
  <input type="text" id="login" name="login"/>
  <div class="clear"></div>
  <label for="password">Password</label>
  <input type="password" id="password" name="password"/>
  <div class="clear"></div>
  <label for="remember_me" style="padding: 0;">Remember me?</label>
  <input type="checkbox" id="remember_me" style="position: relative; top: 3px; margin: 0; " name="remember_me"/>
  <div class="clear"></div>
  <br />
  <input type="submit" style="margin: -20px 0 0 287px;" class="button" name="commit" value="Log in"/>
  </fieldset>
</form>
</body>

</html>