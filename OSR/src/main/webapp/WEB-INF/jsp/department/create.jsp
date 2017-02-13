<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Department</title>
    <style>
        .error{color:red}
    </style>
</head>
<body>
<div>
    <div style="float: left"><jsp:include page="../admin_menu.jsp"/></div>
    <div class="action_div">
        <div class="form_div">
            <spring:form action="save" commandName="department" >
                <ul class="form-style-1">
                <input type="hidden" name="id" value="${department.id}">
                 <jsp:include page="_form.jsp"/>
                    <li>
                        <input type="submit" name="submit" value="Create">
                    </li>

                </ul>
            </spring:form>
</div>
    </div>
</div>


</body>
</html>