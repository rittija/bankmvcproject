<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Personal Info Page</title>
</head>
<body>
<form method="post" action="/springsampleweb1/addPersonInfo">
<table>
<tr>
<td><label>First Name ::</label></td>
<td><input id = "user_id1" name ="firstName" type = "text" ></td>
</tr>
<tr>
<td><label>Last Name ::</label></td>
<td><input id = "user_id2" Name = "lastName" type ="text"></td>
</tr>
<tr>
<td><label>Middle Name ::</label></td>
<td><input id = "user_id3" Name = "middleName" type ="text"></td>
</tr>
<tr><td><label>Gender ::</label></td>
<td><label><input id = "male_id" name = "gender" type ="radio" value ="male" >Male</label></td>
<td><label><input id = "male_id" name = "gender" type ="radio" value ="female" >Female</label></td>
</tr>


<tr align="center">
<td colspan="2"><input type="submit" value="Submit...">
</td>
</tr>


</table>
</form>
</body>
</html>