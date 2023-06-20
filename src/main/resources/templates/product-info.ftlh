<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>BUSEL</title>
</head>
<body>
    <h1> BUySEL</h1><hr>
    <h3>Product Details<h3>
    <b>Title product: </b>${product.title}<br>
    <b>Description product: </b>${product.description}<br>
    <b>Price: </b>${product.price}<br>
    <b>City: </b>${product.city}<br>
    <b>Name: </b>${product.author}<br>
    <hr>
    <form action="/product/delete/${product.id}" method="post">
       
        <input type="submit" value="Delete product"> 
    </form>
</body>
</html>