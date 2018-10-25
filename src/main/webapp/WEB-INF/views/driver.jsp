<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf8">
	<link rel="stylesheet" type="text/css" href="../../resources/css/styleList.css">
	<title>Tsystems Logiweb</title>
</head>
<body>
<jsp:include page="fragments/header.jsp" />

<h4>&nbsp&nbsp&nbsp&nbsp&nbspDrivers List</h4>

<c:if test="${!empty driverList}">
	<table class="data">
		<tr class="simple">
            <th>&nbsp&nbsp&nbsp</th>
			<th>Name</th>
			<th>Sirname</th>
			<th>PersonalNumber</th>
			<th>WorkingHoursThisMonth</th>
            <th>Status</th>
          <%--  <th>City</th>--%>
            <th></th>
		</tr>
		<c:forEach items="${driverList}" var="driver">
			<tr class="simple">
                <td></td>
				<td>${driver.name}</td>
				<td>${driver.sirname}</td>
				<td>${driver.personalNumber}</td>
				<td>${driver.workingHoursThisMonth}</td>
                <td>${driver.driverStatus}</td>
               <%-- <td>${driver.driverCountry.city}</td>--%>
				<%--<td><a href="delete/${driver.driverId}">Delete</a></td>--%>
                <td>
                    <spring:url value="/welcome/${driver.name}" var="detailUrl" />
                    <spring:url value="/welcome/delete/${driver.driverId}" var="deleteUrl" />
                    <spring:url value="/welcome/update/${driver.driverId}" var="updateUrl" />

                    <button class="btn btn-info" onclick="location.href='${detailUrl}'">Details</button>
                    <button class="btn btn-primary" onclick="location.href='${updateUrl}'">Update</button>
                    <button class="btn btn-danger" onclick="location.href='${deleteUrl}'">Delete</button></td>
            </tr>
		</c:forEach>
	</table>
</c:if>
<%--<script src="../../resources/jquery-3.3.1.js"></script>--%>

<jsp:include page="fragments/footer.jsp" />
</body>
</html>