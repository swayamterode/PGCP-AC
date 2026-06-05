<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Form</title>
</head>
<body>
	<h2>BookStore - Book Form</h2>
	<hr />
	<form:form
		action="${pageContext.request.contextPath}/bookstore/saveBook"
		method="post" modelAttribute="book">
		<form:hidden path="id" />
		<table>
			<tr>
				<td>Title:</td>
				<td><form:input path="title" /></td>
			</tr>
			<tr>
				<td>Author:</td>
				<td><form:input path="author" /></td>
			</tr>
			<tr>
				<td>Price:</td>
				<td><form:input path="price" /></td>
			</tr>
			<tr>
				<td>Stock:</td>
				<td><form:input path="stock" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Save" /></td>
				<td><a href="${pageContext.request.contextPath}/bookstore/list">Cancel</a></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
