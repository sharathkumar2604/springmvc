<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Home page</h1>
<form action="organic" method="post">
<fieldset>
<legend>fruits Details form</legend>
<label>name</label>
<input type="text" name="name" placeholder="name" required>
<label>price</label>
<input type="text" name="price" placeholder="price" required>
<label>color</label>
<input type="text" name="color" placeholder="color" required>

<button type="submit">create</button>
</fieldset>
</form>
</body>
</html>