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
<title> Add New User</title>
</head>
<body>
<%@include file = "./header.jsp" %>
<br><br><br><br><br><br>

<div id="add user" align="center">
	
	<br>
	<form:form method="post" commandName="user" action="${ pageContext.request.contextPath }/asset/addUser/process.html">
	<table align="center">
		<tbody>
		<tr>
			<td colspan="2" align="center">
				<font color="aa0000">
					<u>Telecom-OSS Asset Tracking: <b>Add User</b></u>
				</font>
			</td>
		</tr>
		<tr>
			<td>Associate Id:</td>
			<td><form:input path="user_id"/> </td>
		</tr>
		<tr>
			<td>Associate Name:</td>
			<td><form:input path="user_name"/> </td>
		</tr>	
		<tr>	
			<td>Password:</td>
			<td><form:input path="password"/> </td>
		</tr>
		<tr>
			<td>Email Id:</td>
			<td><form:input path="email"/></td>
		</tr>
		<tr>
			<td>Vertical Name:</td>
			<td><form:input path="vertical_name"/></td>
		</tr>
		<tr>
			<td>Role: </td>
			<td><form:select path="role_id">
					<c:forEach items="${ roleList }" var="role">
					<form:option value="${ role.getRole_id()}">${ role.getRole_name() }</form:option>
					</c:forEach>
				</form:select>
			</td>
		<tr>
			<td colspan="2" align="center"><input value="Submit" name="submit" type="submit" />
			<input value="Cancel" name="cancel" type="submit" />
			<input value="Reset" name="submit" type="reset" />
			</td>
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