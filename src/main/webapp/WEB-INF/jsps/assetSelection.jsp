<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Asset Selection</title>
</head>
<body>
<%@include file = "./header.jsp" %>
<br><br><br><br><br><br>
<div id="assetSelection" align="center">
	<font color="aa0000">
	<u>Telecom-OSS Asset Tracking: <b>Select Asset Type</b></u>
	</font>
	<br>
	<a href="${pageContext.servletContext.contextPath }/assetSelection.do/type/laptop">Laptop</a><br>
	<a href="${pageContext.servletContext.contextPath }/assetSelection.do/type/desktop">Desktop</a><br>
	<a href="${pageContext.servletContext.contextPath }/assetSelection.do/type/All">All</a><br>
</div>
<%@include file = "./footer.jsp" %>
</body>
</html>