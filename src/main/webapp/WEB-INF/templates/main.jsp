<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<html>
<head>
	<link rel="stylesheet" href="<c:url value="/recursos/stylesheets/estilo.css"/>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">		
	<title><tiles:getAsString name="title" /></title>
</head>
<body>
	<tiles:insertAttribute name="header"/>
	<tiles:insertAttribute name="body"/>
	<tiles:insertAttribute name="footer"/>
</body>
</html>