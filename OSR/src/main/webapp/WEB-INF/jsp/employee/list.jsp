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
            <td>First Name</td>
            <td>Last Name</td>
            <td>Email</td>
            <td>User Role</td>
            <td>Department Name</td>
            <td>Birthdate</td>
            <td>address1</td>
            <td>address2</td>
            <td>city</td>
            <td>country</td>
            <td>state</td>
            <td>zipcode</td>
        </tr>
        <c:forEach items="${employees}" var="employee" varStatus="status">
            <tr>
                <td>${status.index}</td>
                <td>${employee.firstName}</td>
                <td>${employee.lastName}</td>
                <td>${employee.email}</td>
                <td>${employee.userType}</td>
                <td>${employee.department.departmentName}</td>
                <td>${employee.birthDate}</td>
                <td>${employee.address.address1}</td>
                <td>${employee.address.address2}</td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td><a href="edit/${employee.id}" class="button left">Edit</a><a href="delete/${employee.id}" class="button left">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>