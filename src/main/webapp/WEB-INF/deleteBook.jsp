<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Book</title>
</head>
<body>
	<form action="/deleteBookById" method="get">
		Book ID : <input type="text" name="id"> <br> <br>
		<button>delete</button>
		<button>cancel</button>

	</form>
</body>
</html>