<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BookStore</title>
</head>
<body>
	<h2>BookStore - All Books</h2>
	<hr />
	<input type="button" value="Add New Book"
		onclick="window.location.href='showForm'; return false;" />

	<br></br>

	<table>
		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Author</th>
			<th>Price</th>
			<th>Stock</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>

		<c:forEach var="book" items="${listBooks}">
			<c:url var="updateLink" value="/bookstore/showFormForUpdate">
				<c:param name="bookId" value="${book.id}"></c:param>
			</c:url>
			<c:url var="deleteLink" value="/bookstore/delete">
				<c:param name="bookId" value="${book.id}"></c:param>
			</c:url>
			<tr>
				<td>${book.id}</td>
				<td>${book.title}</td>
				<td>${book.author}</td>
				<td>${book.price}</td>
				<td>${book.stock}</td>
				<td><a href="${updateLink}">Update</a></td>
				<td><a href="${deleteLink}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
