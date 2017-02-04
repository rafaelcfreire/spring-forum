<body>
	<form class="form-narrow form-horizontal" action="/spring-forum/login" method="post">
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
			<div class="erro">
			O Usuario nao existe!!
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
