<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../style.jsp"/>

<li>
    <label>Full Name <span class="required">*</span></label>
    <input type="text" name="firstName" value="${employee.firstName}"  class="field-divided" placeholder="First Name"/>&nbsp;<input type="text" name="lastName" value="${employee.lastName}"  class="field-divided" placeholder="Last Name"/>
    <spring:errors path="firstName" cssClass="error"/>

    <spring:errors path="lastName" cssClass="error"/>
</li>
<li>
    <label>Email <span class="required">*</span></label>
    <input type="email" name="email" value="${employee.email}" class="field-long" />
    <spring:errors path="email" cssClass="error"/>
</li>
<li>
    <label>Department<span class="required">*</span></label>
    <spring:select path="department.id" class="field-select">
        <c:forEach items="${departments}" var="department">
            <spring:option value="${department.id}">${department.departmentName}</spring:option>
        </c:forEach>
    </spring:select>
    <spring:errors path="department.id" cssClass="error"/>
</li>
<li>
   <label>Birthdate<span class="required">*</span></label>
    <input type="date" name="birthDate" value="${employee.birthDate}"class="field-long"/>
    <spring:errors path="birthDate" cssClass="error"/>
</li>
<li>
    <label>Contactnumber<span class="required">*</span></label>
    <input type="tel" name="contactNumber" value="${employee.contactNumber} "class="field-long"/>
    <spring:errors path="contactNumber" cssClass="error"/>
</li>
<li>
    <label>UserType</label><span class="required">*</span></label>
    <input type="text" name="userType" value="${employee.userType}" class="field-long"/>
   <spring:errors path="userType" cssClass="error"/>
</li>
<li>
    <label>Address1<span class="required">*</span></label>
     <input type="text"  name="address.address1" value="${employee.address.address1}" class="field-long field-textarea"></input>
    <spring:errors path="address.address1" cssClass="error"/>
</li>
<li>
    <label>Address2<span class="required">*</span></label>
    <input type="text"  name="address.address2" value="${employee.address.address2}" class="field-long field-textarea"></input>
    <spring:errors path="address.address2" cssClass="error"/>
</li>
<li>
    <label>City<span class="required">*</span></label>
    <input type="text" name="address.city" value="${employee.address.city}"  class="field-long"/>
    <spring:errors path="address.city" cssClass="error"/>
</li>
<li>
    <label>State<span class="required">*</span></label>
    <input type="text" name="address.state" value="${employee.address.state}"  class="field-long"/>
    <spring:errors path="address.state" cssClass="error"/>
</li>
<li>
    <label>Country<span class="required">*</span></label>
    <input type="text" name="address.country" value="${employee.address.country}"  class="field-long"/>
    <spring:errors path="address.country" cssClass="error"/>
</li>
<li>
    <label>Zipcode<span class="required">*</span></label>
    <input type="text" name="address.zipcode" value="${employee.address.zipcode}"  class="field-long"/>
    <spring:errors path="address.zipcode" cssClass="error"/>
</li>






