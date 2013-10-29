<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Modify Asset</title>
</head>
<body>
<%@include file = "./header.jsp" %>
<br><br><br><br><br><br>

<div id="add location" align="center">
	
	<br>
	<form:form method="post" commandName="assetDetails" action="${ pageContext.request.contextPath }/asset/edit/${ assetDetails.getAsset_details_id() }">
	<table align="center">
		<tbody>
		<tr>
			<td colspan="2" align="center">
				<font color="aa0000">
					<u>Telecom-OSS Asset Tracking: <b>Update Asset</b></u>
				</font>
			</td>
		</tr>
		<tr>
			<td>Asset Type:</td>
			<td><form:select path="assetDetails_type_id">
					<c:forEach items="${ typeList }" var="type">
					<form:option value="${ type.getAsset_type_id() }">${ type.getAsset_name() }</form:option>
					</c:forEach>
				</form:select>
			</td>
		</tr>
		<tr>
			<td>Associate Id:</td>
			<td><form:select path="associate_id">
					<c:forEach items="${ userList }" var="user">
					<form:option value="${ user.getUser_id() }">${ type.getUser_name() }</form:option>
					</c:forEach>
				</form:select>
			</td>
		</tr>	
		<tr>	
			<td>Location:</td>
			<td><form:select path="location_id">
					<c:forEach items="${ locationList }" var="location">
					<form:option value="${ location.getLocation_id() }">${ location.getLocation_name() }</form:option>
					</c:forEach>
				</form:select>
			</td>
		</tr>
		<tr>
			<td>Desktop Model:</td>
			<td><form:input path="model"/></td>
		</tr>
		<tr>
			<td>Computer/Laptop Name:</td>
			<td><form:input path="comp_name"/></td>
		</tr>
		<tr>
			<td>IP Address:</td>
			<td><form:input path="ip_address"/></td>
		</tr>
		<tr>
			<td>Monitor Tracking Number:</td>
			<td><form:input path="monitor_number"/></td>
		</tr>
		<tr>
			<td>CPU/Laptop Tracking Number:</td>
			<td><form:input path="track_number"/></td>
		</tr>
		<tr>
			<td> RAM: </td>
			<td><form:input path="ram"/></td>
		</tr>
		<tr>
			<td>Hard Drive:</td>
			<td><form:input path="hardDrive"/></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input value="Submit" name="submit" type="submit" />
			<input value="Cancel" name="cancel" type="submit" />
			<input value="Reset" name="submit" type="reset" />
		</tr>
		</tbody>
	</table>
	</form:form>
</div>

	<p align="center">
		<a href="${ pageContext.request.contextPath }/index">home</a>
	</p>


<%@include file = "./footer.jsp" %>
</body>
</html>