<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form  method= "post"action="../../RRegistrationController">
  <div >
    <h1 >Register</h1>
    
    <hr>
	 <label ><b>Name</b></label>
    <input type="text" placeholder="Enter name..." name="userName" required><br>
	
	
    <label ><b>Password</b></label>
    <input type="password" placeholder="Enter Password.." name="password" required><br>
    <hr>
    <p>Already have an account ? <a href="login.jsp">sign in here</a>.</p>

    <button type="submit" >Register</button>
  </div>
  
  
    
</form>




</body>
</html>