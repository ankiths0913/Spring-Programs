<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
              <h2>Welcome User</h2>
              
              <h3> Name : ${user.getName()}</h3>
              <h3> Email Id : ${user.getEmail()}</h3>
              <h3> Phone No. : ${user.getPhoneno()}</h3>
</body>
</html>