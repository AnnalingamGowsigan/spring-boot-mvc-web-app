<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1>My First JSP Page</h1>
    <p>Today's date is <%= new java.util.Date() %></p>

    <form action="add">
        <label >
            Enter the number 1
            <input type="text" name="num1" />
        </label>
        <br>
        <label>
            Enter the number 2
            <input type="text" name="num2" />
        </label>
        <br>
        <input type="submit" />
    </form>
</body>
</html>
