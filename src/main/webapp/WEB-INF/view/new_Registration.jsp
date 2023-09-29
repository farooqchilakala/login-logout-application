<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>New Registration</title>
    
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    
    <!-- Custom CSS -->
    <link rel="stylesheet" href="style.css">
    
    <!-- Additional CSS -->
    <style>
        /* Custom CSS for New Registration JSP */
        
        .container {
            margin-top: 50px;
            max-width: 500px;
        }
        
        h1 {
            text-align: center;
            margin-bottom: 30px;
        }
        
        table {
            width: 100%;
        }
        
        form {
            background-color: #fff;
            padding: 30px;
            border-radius: 5px;
            box-shadow: 0px 2px 5px rgba(0,0,0,0.3);
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>New Registration</h1>
        <form action="NewRegistrationController" method="post">
            <table class="table table-striped">
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="Name" class="form-control"/></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="text" name="Email" class="form-control"/></td>
                </tr>
                <tr>
                    <td>Mobile</td>
                    <td><input type="text" name="Mobile" class="form-control"/></td>
                </tr>
                <tr>
                    <td>City</td>
                    <td><input type="text" name="City" class="form-control"/></td>
                </tr>
            </table>
            <input type="submit" value="Save" class="btn btn-primary"/>  
        </form>
        <%
        if(request.getAttribute("Error")!=null){
            out.println("<div class='alert alert-danger'>" + request.getAttribute("Error") + "</div>");
        }
        %>
    </div>
    
    <!-- Bootstrap JS -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</body>
</html>
