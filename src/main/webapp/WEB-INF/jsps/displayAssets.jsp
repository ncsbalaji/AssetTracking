<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="${ pageContext.servletContext.contextPath }/css/tableStyle1.css" type="text/css" />
<title> Display Assets </title>
</head>
<body>
<%@include file = "./header.jsp" %>
<br><br><br><br><br><br>
<div id="asset list table" align="center" >
<font color="aa0000">
	The following are <b>${assetType}</b> assets available
	</font>
<table align="center">
	<thead>
		<tr>
			<td> User Name </td>
			<td> Email </td>
			<td> User Id </td>
			<td> Company </td>
			<td> Hard Disk </td>
			<td> Location </td>
			<td> Model </td>
			<td> Monitor Number </td>
			<td> Ram </td>
			<td> IP </td>
			<td> Update </td>
			<td> Delete </td>
		</tr>
	</thead>
		<c:if test="${ fn: length(assetList) eq 0 }">
				<tr>
					<td colspan="6"><font color="red">No Records to Display</font></td>
				</tr>
		</c:if>
		
		<c:forEach var="asset" items="${ assetList }">
			<tr>
				<td>${ asset.getUser().getUser_name() }</td>
				<td>${ asset.getUser().getEmail()}</td>
				<td>${ asset.getUser().getUser_id()}</td>
				<td>${ asset.getComp_name() }</td>
				<td>${ asset.getHardDrive() }</td>
				<td>${ asset.getLocation().getLocation_name() }</td>
				<td>${ asset.getModel() }</td>
				<td>${ asset.getMonitor_number() }</td>
				<td>${ asset.getRam() }</td>
				<td>${ asset.getIp_address() }</td>
				<td>
					<a href="${ pageContext.request.contextPath }/asset/edit/${asset.getAsset_details_id()}">Edit</a><br>
				</td>
				<td>
					<a href="${ pageContext.request.contextPath }/asset/delete/${asset.getAsset_details_id()}">Delete</a><br>
				</td>
			</tr>
		</c:forEach>
	
</table>
	<p align="center">
		<a href="${ pageContext.request.contextPath }/index">home</a>
	</p>
</div>

<%@include file = "./footer.jsp" %>
</body>
</html>