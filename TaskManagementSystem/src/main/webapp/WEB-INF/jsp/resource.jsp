<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
<link
	href="//cdn.rawgit.com/Eonasdan/bootstrap-datetimepicker/e8bddc60e73c1ec2475f827be36e1957af72e2ea/build/css/bootstrap-datetimepicker.css"
	rel="stylesheet">


<script type="text/javascript"
	src="//code.jquery.com/jquery-2.1.1.min.js"></script>
<script type="text/javascript"
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/moment.js/2.9.0/moment-with-locales.js"></script>
<script
	src="//cdn.rawgit.com/Eonasdan/bootstrap-datetimepicker/e8bddc60e73c1ec2475f827be36e1957af72e2ea/src/js/bootstrap-datetimepicker.js"></script>

<title>Task Management</title>
</head>
<body>

	<div class="container">
		<h1 style='text-align: center;'>Task Management</h1>
		<br>
		<h2 style='text-align: center;'>Assign Tasks</h2>
		<br>
		<hr />
		<form action="task">
			<div class="form-group row">
				<label for="inputProject" class="col-sm-2 col-form-label">Project</label>
				<div class="col-sm-7">
					<%-- <select name="title">
						<%
							ArrayList<String> projects = (ArrayList<String>) request.getAttribute("projectList");
							for (String project : projects) {
						%>
						<option value="<%=project%>"><%=project%></option>
						<%
							}
						%>
					</select> --%>
				</div>
			</div>
			<div class="form-group row">
				<label for="name" class="col-sm-2 col-form-label">Employee
					Name</label>
				<div class="col-sm-7">
					<input type="text" name="name" class="form-control" id="name"
						placeholder="Enter Employee Name">
				</div>
			</div>
		</form>
	</div>
</body>
</html>