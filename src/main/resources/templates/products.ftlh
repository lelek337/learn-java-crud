<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>BUSEL</title>
</head>
<body>
    <h1> BUySEL</h1><hr>
    <h3> Products from Belarus<h3>
    <#list products as product>
        <div>
            <p><b>${product.title}<b> ${product.price} Br | <a href="/product/${product.id}">more...</a></p>
        </div>
    </#list>
    <hr>
    <h3>Create a new directory</h3>
    <form action="/product/create" method="post">
        Title Ad: <input type="text" name="title"><br><br> 
        Description Ad: <input type="text" name="description"><br><br> 
        Price: <input type="number" name="price"><br><br> 
        City: <input type="text" name="city"><br><br> 
        Name: <input type="text" name="author"><br><br>
        <input type="submit" value="Add product"> 
    </form>
</body>
</html>

