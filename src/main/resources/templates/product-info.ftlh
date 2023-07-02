<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>BUSEL</title>
</head>
<body>
    <h1> BUYSEL</h1><hr>
    <h3>Product Details<h3>
    <#list images as img>
        <img src="/images/${img.id}" height="60"/><br><br>
    </#list>
    <b>Title product: </b>${product.title}<br>
    <b>Description product: </b>${product.description}<br>
    <b>Price: </b>${product.price}<br>
    <b>City: </b>${product.city}<br>
    <b>Name: </b>${product.user.name}<br>
    <b>Phone number: </b>${product.user.phoneNumber}<br>
</body>
</html>