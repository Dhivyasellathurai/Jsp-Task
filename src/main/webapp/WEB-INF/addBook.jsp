<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Registration</title>
</head>
<body>
	Enter the book details
	<form action="/save" method="post">
		Book ID : <input type="text" name="id"> <br> <br>
		Book no : <input type="text" name="isbn"> <br> <br>
		Book name : <input type="text" name="name"> <br> <br>
		Book author : <input type="text" name="author"> <br> <br>
		<button>submit</button>
	</form>
</body>
</html>