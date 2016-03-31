<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<sf:form modelAttribute="usuario" action="executarRegistro" enctype="multipart/form-data">
	<table>
		<tr>
			<td>
				<label for="nome">Nome:<sf:errors path="nome" cssClass="erro"/></label>
			</td>
			<td>
				<sf:input path="nome"/>
			</td>
		</tr>
		
		<tr>
			<td>
				<label for="email">Email:<sf:errors path="email" cssClass="erro"/></label>
			</td>
			<td>
				<sf:input path="email"/>
			</td>
		</tr>
		
		<tr>
			<td>
				<label for="login">Nome do usuário (login):<sf:errors path="login" cssClass="erro"/></label>
			</td>
			<td>
				<sf:input path="login"/>
			</td>
		</tr>
		
		<tr>
			<td>
				<label for="senha">Senha:<sf:errors path="senha" cssClass="erro"/></label>			
			</td>
			<td>
				<sf:password path="senha"/>			
			</td>
		</tr>
		<tr>
			<td>
				<label for="avatar">Avatar:</label>
			</td>
			<td>
				<input type="file" name="avatar"/>
			</td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="Faça parte!"/>
			</td>	
		</tr>
	</table>
</sf:form>