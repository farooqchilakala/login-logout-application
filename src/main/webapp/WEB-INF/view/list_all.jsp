<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="css/retrieveStyle.css">
</head>
<body>
<div class="container">
    <h2 class="text-center">All Registration</h2>
    <table class="table table-bordered">
        <thead>
            <tr> 
                <th>Name</th>
                <th>Email</th>
                <th>Mobile</th>
                <th>City</th>
                <th>Delete</th>
                <th>Update</th>
            </tr>
        </thead>
        <tbody>
            <% ResultSet result = (ResultSet)request.getAttribute("result");
            while(result.next()){
            %>
            <tr> 
                <td><%=result.getString(1) %></td>
                <td><%=result.getString(2) %></td>
                <td><%=result.getString(3) %></td>
                <td><%=result.getString(4) %></td>
                <td><a href="Delete?email=<%= result.getString(2) %>" class="btn btn-danger">Delete</a></td>
                <td><a href="Update?Email=<%= result.getString(2) %>&Mobile=<%=result.getString(3) %>" class="btn btn-primary">Update</a></td>
            </tr>
            <%}%>
        </tbody>
    </table>
</div>
</body>
</html>
