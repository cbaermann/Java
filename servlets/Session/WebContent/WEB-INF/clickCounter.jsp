<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Click Counter Page</title>
</head>
<body>
	<a href="/Session/ClickCounter"><button>Click Me!</button></a>
	<h1>You have clicked the button <c:out value="${count}"/> times!</h1>
	
</body>
</html>