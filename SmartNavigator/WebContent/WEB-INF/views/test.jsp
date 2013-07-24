<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	helloworld!
	<form action="../upload" method="post" enctype="multipart/form-data">
		<input type="file" name="file">
		<input type="submit">
	</form>
	
	<form action="../account/register" method="post" enctype="multipart/form-data">
		<input type="text" name="email">
		<input type="password" name="password">
		<input type="text" name="name">
		<input type="text" name="sex">
		<input type="file" name="avatar">
		<input type="submit">
	</form>
	
	<form action="../account/comment/add" method="post" enctype="multipart/form-data">
		<input type="text" name="placeid">
		<input type="text" name="content">
		<input type="text" name="star">
		<input type="submit">
	</form>
	
	<form action="../account/login" method="post" enctype="multipart/form-data">
		<input type="text" name="email">
		<input type="text" name="password">
		<input type="submit">
	</form>
	
	
	<form action="../account/comment/delete" method="post" enctype="multipart/form-data">
		<input type="text" name="id">
		<input type="submit">
	</form>
</body>
</html>