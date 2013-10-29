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
			<a href="/about/">About</a>
		</li>
		<li>
			<a class="fly" href="#" tabindex="1">Operations</a>
			<ul class="dd">
				<li><a class="fly" href="#" tabindex="1">Add</a>
				 <ul>
				 	<li><a href="${ pageContext.servletContext.contextPath }/asset/addUser">Add user</a></li>
				 	<li><a href="${ pageContext.servletContext.contextPath }/asset/addAsset.do">Add Asset</a></li>
				 	<li><a href="${ pageContext.servletContext.contextPath }/asset/addLocation.do">Add Location</a></li>
				 </ul>
				 </li>
				<li><a class="fly" href="#" tabindex="1">Delete</a>
				 <ul>
				 	<li><a href="#">Delete User</a></li>
				 </ul>
				</li>
				<li><a class="fly" href="#" tabindex="1">Assign</a>
				  <ul>
				    <li><a href="#">Assign Asset</a></li>
				  </ul>
				</li>
				<li><a class="fly" href="#" tabindex="1">Assets</a>
				  <ul>
				    <li><a href="#">Unassigned Assets</a></li>
				  </ul>
				</li>
			</ul>
		</li>
		<li><a href="/changePassword/">Change Password</a></li>
		<li><a href="/logout/">Logout</a></li>		
	</ul>
</div>
</body>
</html>