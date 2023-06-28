<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>BUYSELL</title>
</head>
<body>
    <h1>BUYSELL</h1><hr>
    <h4>authorization</h4>
    <form action="/login" method="post">
        email: <input type="email" name="username"><br><br>
        password: <input type="password" name="password"><br><br>
        <input type="hidden" name="_csrf" value="${_csrf.token}">
        <input type="submit" value="Entrance">
    </form>
    <a href="/registration">Register oneself</a>   
</body>
</html>