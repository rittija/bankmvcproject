<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact Info Page</title>
</head>
<body>
<center><h1>Insert Contact Details</h1></center>
<form action="/springsampleweb1/addContactInfo" method="POST">
<table>
<tr>
<td><label>Address ::</label></td>
<td><input id = "id_address" name ="address" type = "text" ></td>
</tr>
<tr>
<td><label>City ::</label></td>
<td><input id = "id_state" Name = "city" type ="text"></td>
</tr>
<tr>
<td><label>State ::</label></td>
<td><input id = "id_state" Name = "state" type ="text"></td>
</tr>
<tr>
<td><label>Country ::</label></td>
<td><select id="country" name="country">
  <option value="usa">United States</option>
  <option value="australia">Australia</option>
  <option value="china">China</option>
  <option value="japan">Japan</option>
  <option value="germany">Germany</option>
  <option value="canada">Canada</option>
  <option value="india">India</option>
  <option value="uk">United Kingdom</option>
</select></td>
</tr>
<tr>
<td><label> Phone :: </label></td>
<td><input id = "id_phoneNumber" name= "phoneNumber" type="tel">
</td>
</tr>
<tr align="center">
<td colspan="2"><input type="submit" value="Submit...">
</td>
</tr>
</table>
</form>
              
</body>
</html>