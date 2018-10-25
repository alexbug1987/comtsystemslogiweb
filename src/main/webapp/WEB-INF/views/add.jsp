<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Alexey
  Date: 25.10.2018
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Driver</title>
</head>
<body>
<jsp:include page="fragments/header.jsp" />

<form:form method="post" action="/welcome/adddriver" modelAttribute="adddriver">

    <table>
        <tr>
            <td><form:label path="name">Name
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
            <td><form:label path="status">Status
            </form:label></td>
            <td><form:input path="status" /></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Add Driver" /></td>
        </tr>
    </table>
</form:form>
<jsp:include page="fragments/footer.jsp" />
</body>
</html>
