<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>${texto}</h2>
	${num1} + ${num2}

	<form action="numeros4.html" method="post">
		<input type="text" name="num1">
		<input type="text" name="num1">
		<button type="submit">Enviar</button>
	</form>
	
	<form action="calculadora.html" method="post">
		<input type="text" name="num1">
		<input type="text" name="num1">
		<select name="operacion">
			<option value="sumar">Sumar</option>
			<option value="restar">Restar</option>
		</select>
		<button type="submit">Total</button>
	</form>
</body>
</html>