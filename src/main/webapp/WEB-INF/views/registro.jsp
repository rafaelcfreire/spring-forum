<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

	<sf:form modelAttribute="usuario" action="executarRegistro" enctype="multipart/form-data">
		<div class="form-group">
			<label for="nome">Nome:<sf:errors path="nome" cssClass="erro"/></label>
			<sf:input path="nome"/>
		</div>

		<div class="form-group">
			<label for="email">Email:<sf:errors path="email" cssClass="erro"/></label>
			<sf:input path="email"/>
		</div>

		<div class="form-group">
			<label for="login">Nome do usuário (login):<sf:errors path="login" cssClass="erro"/></label>
			<sf:input path="login"/>
		</div>					

		<div class="form-group">
			<label for="senha">Senha:<sf:errors path="senha" cssClass="erro"/></label>			
			<sf:password path="senha"/>			
		</div>			

		<div class="form-group">
			<label for="avatar">Avatar:</label>
			<input type="file" name="avatar"/>
		</div>
					
		<button type="submit" class="btn btn-default">Submit</button>			
	</sf:form>
