<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@include file="menu.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Registration</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
crossorigin="anonymous">
<!-- Custom CSS -->
<style>
    body {
        padding: 20px;
        background-color: #f8f9fa; /* light gray */
    }

    .form-control {
        width: 50%;
    }

    input[type=submit] {
        margin-top: 10px;
    }
</style>
</head>
<body>
<div class="container">
    <h1>Update Registration</h1>
    <form action="Update" method="post">
        <div class="form-group">
            <label for="Email">Email:</label>
            <input type="text" class="form-control" name="Email" value="<%=request.getAttribute("Email") %>"/>
        </div>
        <div class="form-group">
            <label for="Mobile">Mobile:</label>
            <input type="text" class="form-control" name="Mobile" value="<%=request.getAttribute("Mobile") %>"/>
        </div>
        <input type="submit" class="btn btn-primary" name="Update" value="Update"/>
    </form>
</div>
<!-- Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
crossorigin="anonymous"></script>
</body>
</html>