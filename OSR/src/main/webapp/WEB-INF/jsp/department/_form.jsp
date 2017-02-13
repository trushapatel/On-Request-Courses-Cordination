<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<jsp:include page="../style.jsp"/>
<li>
    <label> Department Name<span class="required">*</span></label>
    <input type="text" name="departmentName" value="${department.departmentName}" required class="field-long"/>
    <spring:errors path="departmentName" cssClass="error"/>
</li>
<li>
    <label> Description<span class="required">*</span></label>
    <textarea name="description" class="field-long field-textarea">${department.description}</textarea>
    <spring:errors path="description" cssClass="error"/>

</li>

