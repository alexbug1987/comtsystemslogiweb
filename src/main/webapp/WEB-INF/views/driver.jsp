<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf8">
	<link rel="stylesheet" type="text/css" href="../../resources/styleContact.css">
	<title>Simple</title>
</head>
<body>

<a href="<c:url value="/logout" />">kjgghjghjg
</a>

<h2>label.title</h2>

	<th><form:form method="post" action="add" modelAttribute="driver">
			<table>
				<tr>
					<td><form:label path="name"> label.name
					</form:label></td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td><form:label path="sirname"> label.sirname
					</form:label></td>
					<td><form:input path="sirname" /></td>
				</tr>
				<tr>
					<td><form:label path="personalNumber"> label.personalNumber
					</form:label></td>
					<td><form:input path="personalNumber" /></td>
				</tr>
				<tr>
					<td><form:label path="workingHoursThisMonth"> label.workingHoursThisMonth
					</form:label></td>
					<td><form:input path="workingHoursThisMonth" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value=label.adddriver /></td>
				</tr>
			</table>
		</form:form></th>

<h3>label.drivers</h3>
<c:if test="${!empty driverList}">
	<table class="data">
		<tr class="simple">
			<th>label.name</th>
			<th>label.sirname</th>
			<th>label.personalNumber</th>
			<th>label.workingHoursThisMonth</th>
            <th>label.status</th>
            <th>label.status</th>
			<th>&nbsp;</th>
		</tr>
		<c:forEach items="${driverList}" var="driver">
			<tr class="simple">
				<td>${driver.name}</td>
				<td>${driver.sirname}</td>
				<td>${driver.personalNumber}</td>
				<td>${driver.workingHoursThisMonth}</td>
                <td>${driver.driverStatus}</td>
                <td>${driver.driverCountry.city}</td>
				<td><a href="delete/${driver.driverId}">label.delete</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
<script src="../../resources/jquery-3.3.1.js"></script>
</body>
</html>