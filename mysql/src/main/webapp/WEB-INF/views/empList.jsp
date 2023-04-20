<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>

<body>
	<table>
		<thead>
			<tr>
				<th>employeeId</th>
				<th>firstName</th>
				<th>lastName</th>
				<th>salary</th>
				<th>hireDate</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach   items="${list}" var="emp">
				<tr>
					<td>${emp.employeeId }</td>
					<td>${emp.firstName }</td>
					<td>${emp.lastName }</td>
					<td>${emp.salary }</td>
					<td>${emp.hireDate }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>

</html>