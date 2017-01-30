<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div>
<div class="chamada row">

			<div class="twelve columns" style="background: #9eb4c3;">
				<h4 style="color:white;"><spring:message code="dados.text"/></h4>
			</div>

</div>
</div>
<div class="row">
	<h4><spring:message code="dados.text"/></h4>
</div>
<br/>
<div class="row">
	<div class="two columns"><b><spring:message code="avatar.text"/></b></div>
	<div class="ten columns"><img style="width:128px;" src='<c:url value="/usuario/avatar/${usuario.login}"/>'/></div>
</div>

<div class="row">
	<div class="two columns"><b><spring:message code="name.text"/></b></div>
	<div class="ten columns">${usuario.nome}</div>
</div>
<br/>
<div class="row">
	<div class="two columns"><b><spring:message code="login.text"/></b></div>
	<div class="ten columns">${usuario.login}</div>
</div>
<br/>
<div class="row">
	<div class="two columns"><b><spring:message code="email.text"/></b></div>
	<div class="ten columns"><a href="mailto:${usuario.email}">${usuario.email}</a></div>
</div>
<br/>
<div class="row">
	<h4><spring:message code="posts.text"/>/h4>
	<a href="javascript:exporPosts('${usuario.login}')"><spring:message code="showPosts.text"/></a>
	<div id="posts"></div>
</div>

<script type="text/javascript">
	function exporPosts(login) {
		var url = "<c:url value="/usuario/posts/"/>" + login
		$("#posts").load(url)
	}
</script>