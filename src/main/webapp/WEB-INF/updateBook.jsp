<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
</head>
<body>
<h1>Update Page</h1>
Enter the book details
	<form action="/updateBookDetails" method="put">
		Book ID : <input type="text" name="id"> <br> <br>
		Book no : <input type="text" name="isbn"> <br> <br>
		Book name : <input type="text" name="name"> <br> <br>
		Book author : <input type="text" name="author"> <br> <br>
		<button>submit</button>
	</form>
</body>
</html>