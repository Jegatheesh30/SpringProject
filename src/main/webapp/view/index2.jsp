<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "/saveData">
<label>Input name    : </label>
<Input type="text" name="name"><br>
<label>Input email   : </label>
<Input type="text" name="email"><br>
<label>Input Password: </label>
<Input type="text" name="password"><br>
<Input type="submit" value="Save">
</form>
<form action = "/deleteData" method="post">
	<label>Enter ID  : </label>
	<input type = "text" name="id"><br>
	<input type = "submit" value="Delete">  

</body>
</html>