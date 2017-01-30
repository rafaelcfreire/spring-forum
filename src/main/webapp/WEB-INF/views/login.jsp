<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Signup</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<link href="<c:url value="/resources/stylesheets/bootstrap.min.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/stylesheets/estilo.css" />" rel="stylesheet">
    <script href="<c:url value="/resources/js/bootstrap.min.js" />"></script>	
	<script src="http://code.jquery.com/jquery-latest.js"></script>
</head>
<body>
	<form class="form-narrow form-horizontal" action="<c:url value="/login"/>" method="post">
		<fieldset>
			<legend>Please Sign Up</legend>
			<div class="form-group">
				<label for="email" class="col-lg-2 control-label">Email</label>
	            <div class="col-lg-10">
	                <input type="text" class="form-control" id="email" placeholder="Email address" name="email" value="" />
	            </div>				
			</div>
	        <div class="form-group">
	            <label for="password" class="col-lg-2 control-label">Password</label>
	            <div class="col-lg-10">
	                <input type="password" class="form-control" id="password" placeholder="Password" name="senha" value="" />
	            </div>
	        </div>
			
	        <div class="form-group">
	            <div class="col-lg-offset-2 col-lg-10">
	                <button type="submit" class="btn btn-default">Sign up</button>
	            </div>
	        </div>
	        <div class="form-group">
	            <div class="col-lg-offset-2 col-lg-10">
	                <p>Create New User <a href="/spring-forum/registro">Here</a></p>
	            </div>
	        </div>
		</fieldset>
	</form>
</body>

</html>