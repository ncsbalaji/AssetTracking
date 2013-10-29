<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="${ pageContext.servletContext.contextPath }/css/navStyle.css" type="text/css" />
</head>
<body>

<div id="navigationBar">
	<ul id="nav" class="fly">
	
		<li><a href="/">Home</a></li>
		<li>
			<a class="fly" href="#" tabindex="1">USER</a>
			<ul class="dd">
				<li><a href="${ pageContext.servletContext.contextPath }/asset/addUser">Add User</a></li>
				<li><a href="#">Update User</a></li>
				<li><a href="#">Delete User</a></li>
				<li><a href="#">List of Users</a></li>
				<li><a href="#">Change Password</a></li>
			</ul>
		</li>
		<li>
			<a class="fly" href="#" tabindex="1">ASSET</a>
			<ul class="dd">
				<li><a href="${ pageContext.servletContext.contextPath }/asset/addAsset.do">Add Asset</a></li>
				<li><a href="#">Update Asset</a></li>
				<li><a href="#">Delete Asset</a></li>
				<li><a href="#">Assign Assets</a></li>
				<li><a class="fly" href="#" tabindex="1">Display Assets</a>
					<ul>
						<li><a href="#">All</a></li>
						<li><a href="#">Desktop</a></li>
						<li><a href="#">Laptop</a></li>
					</ul>
				</li>
				<li><a href="#">Asset Status</a></li>
			</ul>
		</li>
		<li>
			<a class="fly" href="#" tabindex="1">LOCATION</a>
			<ul class="dd">
				<li><a href="${ pageContext.servletContext.contextPath }/asset/addLocation.do">Add Location</a></li>
				<li><a href="#">Delete Location</a></li>
				<li><a href="#">Display Location</a></li>
			</ul>
		</li>
		<li><a href="/logout/">Logout</a></li>		
	</ul>
</div>
</body>
</html>