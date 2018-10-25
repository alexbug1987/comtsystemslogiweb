<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
<title>Tsystems LogiWeb </title>

<spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCss" />
<link href="${bootstrapCss}" rel="stylesheet" />
</head>

<spring:url value="/welcome" var="urlHome" />
<spring:url value="/welcome/adddriver" var="urlAddDriver" />
<spring:url value="/welcome/addtruck" var="urlAddTruck" />
<spring:url value="/welcome/addorder" var="urlAddOrder" />
<spring:url value="/welcome/addcity" var="urlAddCity" />

<nav class="navbar navbar-inverse ">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="${urlHome}">Home page</a>
		</div>
        <div id="navbar">
            <ul class="nav navbar-nav navbar-right">
                <li class="active"><a href="<c:url value="/logout" />">&nbsp;&nbsp;LOGOUT</a></li>
            </ul>
        </div>
        <div id="navbar">
			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="${urlAddDriver}">&nbsp;&nbsp;+Driver</a></li>
			</ul>
		</div>
        <div id="navbar">
            <ul class="nav navbar-nav navbar-right">
                <li class="active"><a href="${urlAddTruck}">&nbsp;&nbsp;+Truck</a></li>
            </ul>
        </div>
        <div id="navbar">
            <ul class="nav navbar-nav navbar-right">
                <li class="active"><a href="${urlAddOrder}">&nbsp;&nbsp;+Order</a></li>
            </ul>
        </div>
        <div id="navbar">
            <ul class="nav navbar-nav navbar-right">
                <li class="active"><a href="${urlAddCity}">&nbsp;&nbsp;+City</a></li>
            </ul>
        </div>
	</div>
</nav>