<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form commandName="formCalculadora" method="POST" action="numeros4.html">
	<table>
		<tr>
			<td>Num1</td>
			<td><form:input path="num1" /><form:errors path="num1" /></td>
		</tr>
		<tr>
			<td>Num2</td>
			<td><form:input path="num2" /><form:errors path="num2" /></td>
		</tr>
		<tr>
			<td>Operacion</td>
			<td>
				<form:select path="operacion" >
				<form:option value="sumar">Sumar</form:option>
				<form:option value="restar">Restar</form:option>
				</form:select>
			</td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="Calcular" />
			</td>
		</tr>
		<tr>
			<td>${total}</td>
		</tr>
		
	</table>
</form:form>

</body>
</html>