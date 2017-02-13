<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<style>
    form {
        border: 3px solid #f1f1f1;
    }

    input[type=text], input[type=password] {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        box-sizing: border-box;
    }

    button {
        background-color: #4CAF50;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        cursor: pointer;
        width: 100%;
    }

    .cancelbtn {
        width: auto;
        padding: 10px 18px;
        background-color: #f44336;
    }

    .imgcontainer {
        text-align: center;
        margin: 24px 0 12px 0;
    }

    img.avatar {
        width: 40%;
        border-radius: 50%;
    }

    .container {
        padding: 16px;
        margin: auto;
        width: 89%;
    }

    span.psw {
        float: right;
        padding-top: 16px;
    }

    /* Change styles for span and cancel button on extra small screens */
    @media screen and (max-width: 300px) {
        span.psw {
            display: block;
            float: none;
        }
        .cancelbtn {
            width: 100%;
        }
    }
</style>
<script type="application/javascript">
    function clearError(){
        document.getElementById("errorSpan").innerHTML = '';
    }
</script>
<body>

<form action="doLogin" method="post" style="margin: auto;width: 30%; margin-top: 10%;">
    <div class="container">

        <label><b>Username</b></label>
        <input type="text" placeholder="Enter Username" name="username" required onkeypress="clearError()"/>

        <label><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="password" required onkeypress="clearError()"/>
        <c:if test="${errorMessage != null}" >
            <span id="errorSpan" style="color:red;">${errorMessage}</span>
        </c:if>
        <button type="submit">Login</button>
    </div>
</form>

</body>
</html>
