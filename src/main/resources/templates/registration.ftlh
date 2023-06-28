<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>BUYSELL</title>
</head>
<body>
    <h1>BUYSELL</h1>
    <h3>Registration</h3>
    <form action="/registration" method="post">
        User name: <input type="text" name="name"><br><br>
        email: <input type="email" name="email"><br><br>
        Phone number: <input type="text" name="phoneNumber">
        password: <input type="password" name="password"><br><br>
        <input type="hidden" name="_csrf" value="${_csrf.token}">
        <input type="submit" value="Registration">
    </form>
    <#if errorMessage??>
        <h2 style="color: red">${errorMessage}</h2>
    </#if>    
</body>
</html>