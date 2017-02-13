<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Employee</title>
    <
</head>
<body>
<div>
    <div style="float: left"><jsp:include page="../admin_menu.jsp"/></div>
    <div class="action_div">
        <div class="form_div">
            <spring:form action="save" commandName="employee" >
                <ul class="form-style-1">
                <input type="hidden" name="id" value="${employee.id}">
                    <jsp:include page="_form.jsp"/>
                    <li>
                        <input type="Submit" value="Create">
                    </li>
                </ul>
            </spring:form>
        </div>
    </div>
</div>

</body>
</html>