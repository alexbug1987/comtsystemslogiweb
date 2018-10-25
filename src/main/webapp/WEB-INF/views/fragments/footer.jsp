<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<div class="container", id="footer">
	<hr>
	<footer>
		<p>&copy; Tsystems.com 2018</p>
	</footer>
</div>

<script
        src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<spring:url value="/resources/core/js/hello.js" var="coreJs" />
<spring:url value="/resources/core/js/bootstrap.min.js" var="bootstrapJs" />

<script src="${coreJs}"></script>
<script src="${bootstrapJs}"></script>


