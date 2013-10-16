<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<c:url var="deleteUrl" value="/admin/delete" />

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Template &middot; Bootstrap</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- Le styles -->
<link rel="stylesheet" type="text/css"
	href='${pageContext.request.contextPath}/css/bootstrap.css'>
<style type="text/css">
body {
	padding-top: 20px;
	padding-bottom: 60px;
}

/* Custom container */
.container {
	margin: 0 auto;
	max-width: 1000px;
}

.container>hr {
	margin: 60px 0;
}

/* Main marketing message and sign up button */
.jumbotron {
	margin: 80px 0;
	text-align: center;
}

.jumbotron h1 {
	font-size: 100px;
	line-height: 1;
}

.jumbotron .lead {
	font-size: 24px;
	line-height: 1.25;
}

.jumbotron .btn {
	font-size: 21px;
	padding: 14px 24px;
}

/* Supporting marketing content */
.marketing {
	margin: 60px 0;
}

.marketing p+h4 {
	margin-top: 28px;
}

/* Customize the navbar links to be fill the entire space of the .navbar */
.navbar .navbar-inner {
	padding: 0;
}

.navbar .nav {
	margin: 0;
	display: table;
	width: 100%;
}

.navbar .nav li {
	display: table-cell;
	width: 1%;
	float: none;
}

.navbar .nav li a {
	font-weight: bold;
	text-align: center;
	border-left: 1px solid rgba(255, 255, 255, .75);
	border-right: 1px solid rgba(0, 0, 0, .1);
}

.navbar .nav li:first-child a {
	border-left: 0;
	border-radius: 3px 0 0 3px;
}

.navbar .nav li:last-child a {
	border-right: 0;
	border-radius: 0 3px 3px 0;
}
</style>

<link rel="stylesheet" type="text/css"
	href='${pageContext.request.contextPath}/css/bootstrap-responsive.css'>s
<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="../assets/js/html5shiv.js"></script>
    <![endif]-->

<!-- Fav and touch icons -->
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="${pageContext.request.contextPath}/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="${pageContext.request.contextPath}/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="${pageContext.request.contextPath}/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="${pageContext.request.contextPath}/ico/apple-touch-icon-57-precomposed.png">
<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/ico/favicon.png">
</head>

<body>

	<div class="container">

		<div class="masthead">
			<h3 class="muted">Project name</h3>
			<div class="navbar">
				<div class="navbar-inner">
					<div class="container">
						<ul class="nav">
							<li><a href='${pageContext.request.contextPath}/admin/home'>Home</a></li>
							<li class="active"><a
								href='${pageContext.request.contextPath}/admin/list'>View
									Librarians</a></li>
							<li><a
								href='${pageContext.request.contextPath}/admin/insert'>Insert
									Librarian</a></li>
							<li><a href='${pageContext.request.contextPath}/admin/check'>Check
									Librarian</a></li>
							<li><a
								href='${pageContext.request.contextPath}/admin/cleardb'>Clear
									Database</a></li>
						</ul>
					</div>
				</div>
			</div>
			<!-- /.navbar -->
		</div>
		<h2>
			<c:out value="${output}"></c:out>
		</h2>
		<hr>
		<!-- Example row of columns -->
		<div class="row-fluid">
			<div class="span12">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>ID</th>
							<th>First Name</th>
							<th>Middle Name</th>
							<th>Last Name</th>
							<th>User Name</th>
							<th>Email</th>
						</tr>
					<thead>
					<tbody>
						<c:forEach items="${librarianList}" var="librarian">

							<tr>
								<td>${librarian.firstName}</td>
								<td>${librarian.middleName}</td>
								<td>${librarian.lastName}</td>
								<td>${librarian.username}</td>
								<td>${librarian.email}</td>
								<td><a
									href='${pageContext.request.contextPath}/admin/info/${librarian.librarianId}'>
										<i class="icon-edit"></i>
								</a> &nbsp; <a
									href='${pageContext.request.contextPath}/admin/delete/${librarian.librarianId}'>
										<i class="icon-remove"></i>
								</a></td>

							</tr>

						</c:forEach>
					</tbody>
				</table>
				<div class="pagination pagination-right">
					<ul>
						<li><a href="#"> &laquo; </a></li>
						<li><a href="#">1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">4</a></li>
						<li><a href="#">5</a></li>
						<li><a href="#"> &raquo; </a></li>
					</ul>
				</div>
			</div>
		</div>

		<hr>

		<div class="footer">
			<p>&copy; Company 2013</p>
		</div>

	</div>
	<!-- /container -->

	<!-- Le javascript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script type="text/javascript"
		src='${pageContext.request.contextPath}/js/jquery.js'></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</body>
</html>