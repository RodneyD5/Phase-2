<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Search Flight Details</h2>
<form action="SearchFlightDetails" method="post">
	<label>DOJ</label>
	<input type="date" name="doj">
	<label>Source</label>
	<input type="text" name="source">
	<label>Destination</label>
	<input type="text" name="destination">
	<label>NumberOfTicket</label>
	<input type="number" name="seats"><br/>
	<input type="submit" value="Search Flight Details">
	<input type="reset" value="reset">
</form>
<br/>
<%
%>
<br/>
<a href="index.jsp">Back</a>
</body>
</html>