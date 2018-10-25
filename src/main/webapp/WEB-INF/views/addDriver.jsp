<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf8">
	<title>Add Driver</title>
</head>
<body>
<jsp:include page="fragments/header.jsp" />

<form:form method="post" action="adddriver" modelAttribute="addDriver">

	<table>
		<tr>
			<td><form:label path="name">name
			</form:label></td>
			<td><form:input path="name" /></td>
		</tr>
		<tr>
			<td><form:label path="sirname">Sirname
			</form:label></td>
			<td><form:input path="sirname" /></td>
		</tr>
		<tr>
			<td><form:label path="personalNumber">PersonalNumber
			</form:label></td>
			<td><form:input path="personalNumber" /></td>
		</tr>
        <tr>
            <td><form:label path="workingHoursThisMonth">WorkingHoursThisMonth
            </form:label></td>
            <td><form:input path="workingHoursThisMonth" /></td>
        </tr>
        <tr>
            <td><form:label path="driverStatus">DriverStatus
            </form:label></td>
            <td><form:input path="driverStatus" value="REST"/></td>
        </tr>
		<tr>
			<td colspan="2"><input type="submit"
				value="Add Driver" /></td>
		</tr>
	</table>
</form:form>

<jsp:include page="fragments/footer.jsp" />
</body>
</html>