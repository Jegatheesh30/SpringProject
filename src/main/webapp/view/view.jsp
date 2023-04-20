<%@page import="com.example.demo.model.UserData"%>
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
<%
	List<UserData> dataList=(List<UserData>)request.getAttribute("data");
	for(int c=0; c<dataList.size(); c++){
		out.print("ID: "+dataList.get(c).getId()+ "<br>");
		out.print("Name: "+dataList.get(c).getName()+ "<br>");
		out.print("Email: "+dataList.get(c).getemail()+ "<br>");
		out.print("Password"+dataList.get(c).getpassword()+"<br>");
		out.print("<br>");
	}
%>
//${password} 
</body>
</html>