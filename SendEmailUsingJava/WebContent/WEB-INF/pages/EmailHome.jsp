<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Email Sender</title>

    <!-- Bootstrap core CSS -->
	<link rel="stylesheet" href="http://localhost:1000/SendEmailUsingJava/resources/css/bootstrap.min.css" />
    <link rel="stylesheet" href="http://localhost:1000/SendEmailUsingJava/resources/css/style.css" />
  </head>

  <body onload="fetchBookmarks()">

    <div class="container">
      <div class="header clearfix">
        <nav>

        </nav>
        <h3 class="text-muted">Email Sender</h3>
      </div>

      <div class="jumbotron">
        <h2>Enter Your Mail</h2>
        <form id="myForm" action="/SendEmailUsingJava/SendMail" method="post">
          <div class="form-group">
            <input type="email" class="form-control" id="siteName" name="username" placeholder="Enter your mail">
          </div>
          <button type="submit" class="btn btn-primary">Submit</button>
        </form>
      </div>


      <footer class="footer">
        <p>&copy; 2020 By Agam Jain EmailSender, Inc.</p>
      </footer>

    </div> <!-- /container -->

  </body>
</html>