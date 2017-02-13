<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>List Courses</title>
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

        table {
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even){background-color: #f2f2f2}

        tr:hover{
            background-color: #adadad;
            color: #080808;
        }

        th {
            background-color: #4CAF50;
            color: white;
        }
    </style>
</head>
<body>
<div>
    <div style="float: left"><jsp:include page="../admin_menu.jsp"/></div>
    <div class="action_div">
        <div>
            <table border="1">
                <tr>
                    <th> Sr. No.</th>
                    <th>Name</th>
                    <th>Description</th>
                    <th>Actions</th>
                </tr>
                <c:if test="${courses.size() == 0}">
                    <tr>
                        <td colspan="4"> No courses available. </td>
                    </tr>
                </c:if>
                <c:forEach items="${courses}" var="course" varStatus="status">
                    <tr>
                        <td>${status.index + 1}</td>
                        <td>${course.courseName}</td>
                        <td>${course.description}</td>
                        <td><a href="edit/${course.id}" class="button left">Edit</a><a href="delete/${course.id}" class="button left">Delete</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</div>
</body>
</html>