<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Course</title>
    <style>
        .error{color:red}
    </style>
</head>
<body>
<div>
    <div style="float: left"><jsp:include page="../admin_menu.jsp"/></div>
    <div class="action_div">
        <div class="form_div">
            <spring:form action="../save" commandName="course" >
                <ul class="form-style-1">
                <input type="hidden" name="id" value="${course.id}">
                <jsp:include page="_form.jsp"/>
                    <li>
                        <input type="Submit" class="submit" value="Update">
                    </li>

                </ul>
            </spring:form>
        </div>
    </div>
</div>
</body>
</html>