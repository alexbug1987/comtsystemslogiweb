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

<h2>Add Driver</h2>

<div class="container-fluid">

    <div class="row">
        <div class="col-md-6">
        </div>
        <div class="col-md-6">
            <form class="form-horizontal" action="<%=request.getContextPath()%>/customer/addCustomer.action" method="post" role="form">
                <div class="form-group">
                    <label> Customer Name</label>
                    <div class="input-group">
                        <span class="input-group-addon"> <span class="glyphicon glyphicon-cog"></span></span>
                        <input type="text" class="form-control" name="name" id="name" placeholder="Enter Name" required>
                    </div>
                </div>
                <div class="form-group">
                    <label for="desc">Country</label>
                    <div class="input-group">
                        <span class="input-group-addon">
                            <span class="glyphicon glyphicon-pencil"></span>
                        </span> <input type="text" class="form-control" name="country" id="desc" placeholder="Enter Country" required>
                    </div>
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>

        </div>
    </div>
</div>
<jsp:include page="fragments/footer.jsp" />
</body>
</html>
