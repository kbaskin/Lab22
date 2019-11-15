<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>

<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/journal/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-ciphE0NCAlD2/N6NUApXAN2dAs/vcSAOTzyE202jJx3oS8n4tAQezRgnlHqcJ59C"
	crossorigin="anonymous">
</head>
<body>

	<h2>Please fill in the form to register:</h2>
	<hr>
	<form action="add-person" method="post">
		First Name: <input type="text" name="first" required>
		<hr>
		Last Name: <input type="text" name="last" required>
		<hr>
		Email: <input type="text" name="email" required>
		<hr>
		Phone Number: <input type="text" name="last" required>
		<hr>
		Password: <input type="text" name="email" required>
		<hr>
		<input class="btn-primary" type="submit" value="Register">
	</form>
	




</body>
</html>