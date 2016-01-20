<%-- 
    Document   : resume
    Created on : Jan 18, 2016, 11:28:12 PM
    Author     : timothy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
     <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<script src="//ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>
    </head>
    <body>
         <div class="navbar-wrapper">
      <div class="container">

        <nav class="navbar navbar-inverse navbar-static-top">
          <div class="container">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <a class="navbar-brand" href="home.jsp">My resume</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
              <ul class="nav navbar-nav">
                <li class=""><a href="home.jsp">Home</a></li>
                <li class="active"><a href="resume.jsp">Resume</a></li>
                  </ul>
                </li>
              </ul>
            </div>
          </div>
        </nav>

      </div>
    </div>
      
        
        
  <form name="resumeBuilderForm" method="POST" action="ResumeController">
     
      <div class="container">
      <div class="form-group">
           <label>
          <h3>Please build the resume with the items you would like to see.</h3>
      </label>
   <div class="checkbox">
    <label>
      <input type="checkbox" name="Education"> Education
      <br />
      <input type="checkbox" name="Job History"> Job History
       <br />
      <input type="checkbox" name="Skills"> Skills
       <br />
      <input type="checkbox" name="Achievements"> Achievements
       <br />
      <input type="checkbox" name="Volunteer"> Volunteer
       <br />
      <input type="checkbox" name="Goals"> Goals
    </label>
  </div>
     
  <input type="submit" value="Build" class="btn btn-default"/>
  </div>
      </div>
</form>
    </body>
</html>
