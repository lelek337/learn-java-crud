<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>BUSEL</title>
</head>
<body>
    <h1> BUYSEL | <a href="/registration">Register oneself</a></h1><hr>
    <form action="/logout" method="post">
        <input type="hidden" name="_csrf" value="${_csrf.token}"/>
        <input type="submit" value="Exit"/>
    </form>
    <h3> Products from Belarus<h3>
    <form action="/" method="get">
        Search by ad name: <input type="text" name="title"><br>
        <input type="submit" value="Search"/>
    </form>
    <#list products as product>
        <div>
            <p><b>${product.title}<b> ${product.price} Br | <a href="/product/${product.id}">more...</a></p>
        </div>
        <#else>
            <h3>Products non</h3>
    </#list>
    <hr>
    <h3>Create a new directory</h3>
    <form action="/product/create" method="post" enctype="multipart/form-data">
        Title: <input type="text" name="title"><br><br> 
        Description: <input type="text" name="description"><br><br> 
        Price: <input type="number" name="price"/><br><br> 
        City: <input type="text" name="city"/><br><br> 
        Name: <input type="text" name="author"/><br><br>
        first photo: <input type="file" name="file1"/><br><br>
        second photo: <input type="file" name="file2"/><br><br>
        third photo: <input type="file" name="file3"/><br><br>

        <input type="submit" value="Add product"/> 
    </form>
</body>
</html>

