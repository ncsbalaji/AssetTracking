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
<title> Add New Location</title>
</head>
<body>
<%@include file = "./header.jsp" %>
<br><br><br><br><br><br>

<div id="add location" align="center">
	
	<br>
	<form:form method="post" commandName="locationPojo" action="${ pageContext.request.contextPath }/asset/addLocation/process.html">
	<table align="center">
		<tbody>
		<tr>
			<td colspan="2" align="center">
				<font color="aa0000">
					<u>Telecom-OSS Asset Tracking: <b>Add Location</b></u>
				</font>
			</td>
		</tr>
		<tr>
			<td>Block:</td>
			<td><form:input path="block"/> </td>
		</tr>
		<tr>
			<td>Floor:</td>
			<td><form:input path="floor"/> </td>
		</tr>	
		<tr>	
			<td>Phase:</td>
			<td><form:input path="phase"/> </td>
		</tr>
		<tr>
			<td>Area:</td>
			<td><form:input path="area"/></td>
		</tr>
		<tr>
			<td>City:</td>
			<td><form:input path="city"/></td>
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