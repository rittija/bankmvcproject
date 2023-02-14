<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bank Info Page</title>
</head>
<body>
<center><h1>Insert Bank Details</h1></center>
<form action="/bankmvcproject/addBankInfo" method="POST">
<table>
<tr>
<td><label>Bank Name ::</label></td>
<td><select id="bank" name="bank">
  <option value="BOA">Bank of America</option>
  <option value="BNP">BNP PARIBAS</option>
  <option value="wellsfargo">Wells Fargo</option>
  <option value="chasebank">Chase Bank</option>
</select></td>
</tr>
<tr>
<td><label>Account # ::</label></td>
<td><input id = "account_id" Name = "account" type ="text"></td>
</tr>

<tr>
<td><label> SSN:: </label></td>
<td><input id = "ssn_id" name= "ssn" type="text">
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