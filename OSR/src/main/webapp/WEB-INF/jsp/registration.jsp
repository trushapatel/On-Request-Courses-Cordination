<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration</title>
    <style>
        .error{color:red}
    </style>
</head>
<body>
<div>
<spring:form action="submit" commandName="organization">
        <table>
            <tr>
                <td>Organization Name:</td>
                <td><input type="text" name="name"/></td>
                <td><spring:errors path="name" cssClass="error"/></td>
            </tr>
            <tr>
                <td>Email Address</td>
                <td><input type="text" name="email"/></td>
                <td><spring:errors path="email" cssClass="error"/></td>
            </tr>
            <tr>
                <td>URL</td>
                <td><input type="text" name="websiteUrl"/></td>
                <td><spring:errors path="websiteUrl" cssClass="error"/></td>
            </tr>
            <tr>
                <td>Address</td>
                <td><input type="text" name="address.address1"/></td>
                <td><spring:errors path="address.address1" cssClass="error"/></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="text" name="address.address2"/></td>
            </tr>
            <tr>
                <td>City</td>
                <td><input type="text" name="address.city"/></td>
                <td><spring:errors path="address.city" cssClass="error"/></td>
            </tr>
            <tr>
                <td>State</td>
                <td><input type="text" name="address.state"/></td>
                <td><spring:errors path="address.state" cssClass="error"/></td>
            </tr>
            <tr>
                <td>Country</td>
                <td><input type="text" name="address.country"/></td>
                <td><spring:errors path="address.country" cssClass="error"/></td>
            </tr>
            <tr>
                <td>Zipcode</td>
                <td><input type="text" name="address.zipcode"/></td>
                <td><spring:errors path="address.zipcode" cssClass="error"/></td>
            </tr>
            <tr>
                <td>Description</td>
                <td><input type="text" name="description"/></td>
            </tr>
            <tr>
                <td colspan="2"><input type="Submit" value="Submit"></td>
            </tr>

        </table>
    </spring:form>
</div>

</body>
</html>