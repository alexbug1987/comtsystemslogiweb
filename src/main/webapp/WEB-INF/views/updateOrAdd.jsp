<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="fragments/header.jsp" />

<div class="container">

	<c:choose>
		<c:when test="${userForm['new']}">
			<h1>Add Driver</h1>
		</c:when>
		<c:otherwise>
			<h1>Update Driver</h1>
		</c:otherwise>
	</c:choose>
	<br />

	<spring:url value="/welcome" var="userActionUrl" />

    <form:form class="form-horizontal" method="post" modelAttribute="userForm" action="${userActionUrl}">
		<form:hidden path="id" />

		<spring:bind path="name">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="col-sm-2 control-label">Name</label>
				<div class="col-sm-10">
					<form:input path="name" type="text" class="form-control " id="name" placeholder="Name" />
					<form:errors path="name" class="control-label" />
				</div>
			</div>
		</spring:bind>

		<spring:bind path="sirname">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="col-sm-2 control-label">Sirname</label>
				<div class="col-sm-10">
					<form:input path="sirname" class="form-control" id="sirname" placeholder="Sirname" />
					<form:errors path="sirname" class="control-label" />
				</div>
			</div>
		</spring:bind>

		<spring:bind path="personalNumber">
			<div class="form-group ${status.error ? 'has-error' : ''}">
                    <label class="col-sm-2 control-label">PersonalNumber</label>
                    <div class="col-sm-10">
                        <form:input path="personalNumber" class="form-control" id="personalNumber" placeholder="89081302536" />
                        <form:errors path="personalNumber" class="control-label" />
				</div>
			</div>
		</spring:bind>

		<spring:bind path="workingHoursThisMonth">
			<div class="form-group ${status.error ? 'has-error' : ''}">
                        <label class="col-sm-2 control-label">WorkingHoursThisMonth</label>
                        <div class="col-sm-10">
                            <form:input path="workingHoursThisMonth" class="form-control" id="workingHoursThisMonth" placeholder="WorkingHoursThisMonth" />
                            <form:errors path="workingHoursThisMonth" class="control-label" />
				</div>
			</div>
		</spring:bind>

        <spring:bind path="driverStatus">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="col-sm-2 control-label">DriverStatus</label>
                <div class="col-sm-10">
                    <form:radiobuttons path="driverStatus" items="${driverStatus}" element="label class='radio-inline'" />
                    <br />
                    <form:errors path="driverStatus" class="control-label" />
                </div>
            </div>
        </spring:bind>



<%--		<spring:bind path="country">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="col-sm-2 control-label">Country</label>
				<div class="col-sm-5">
					<form:select path="country" class="form-control">
						<form:option value="NONE" label="--- Select ---" />
						<form:options items="${countryList}" />
					</form:select>
					<form:errors path="country" class="control-label" />
				</div>
				<div class="col-sm-5"></div>
			</div>
		</spring:bind>--%>

		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<c:choose>
					<c:when test="${userForm['new']}">
						<button type="submit" class="btn-lg btn-primary pull-right">Add</button>
					</c:when>
					<c:otherwise>
						<button type="submit" class="btn-lg btn-primary pull-right">Update</button>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
	</form:form>

</div>

<jsp:include page="fragments/footer.jsp" />

</body>
</html>