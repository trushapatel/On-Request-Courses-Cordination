<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>List Departments</title>
    <style>
        .error{color:red}
        .button{
            display: block;
            background-color: pink;
            float: left;
            padding: 3px;
            cursor: auto;
            text-decoration: none;
        }
        .left{
            margin-left: 10px;
        }
    </style>
</head>
<body>
<div>
    <table border="1">
        <tr>
            <td> Sr. No.</td>
            <td>Name</td>
            <td>Description</td>
            <td>Actions</td>
        </tr>
        <c:forEach items="${departments}" var="department" varStatus="status">
            <tr>
                <td>${status.index}</td>
                <td>${department.departmentName}</td>
                <td>${department.description}</td>
                <td><a href="edit/${department.id}" class="button left">Edit</a><a href="delete/${department.id}" class="button left">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>