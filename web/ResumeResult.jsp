<%-- 
    Document   : ResumeResult
    Created on : Jan 19, 2016, 9:37:15 PM
    Author     : timothy
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      
    </head>
    <body>
      <div class="jumbotron">
                   
                 <h3>TIMOTHY LIEBL</h3>
                  <h3>2151 KENSINGTON DRIVE</h3>
                  <h3>WAUKESHA, WI 53188</h3>
                  <h3>TLIEBL@MY.WCTC.EDU</h3>
                  <hr>
          <%
              List<String> i = (List)request.getAttribute("resumeList");
          
              int count = 0;
             if(i != null){
              for(String b : i){
                  %>
                  
                  <h4><%= i.get(count)%></h4>
                  <hr>
             <%
                 count++;
              }
                
             }
              %>
          
          
  <p><a class="btn btn-primary btn-lg" href="home.jsp" role="button">HOME</a></p>
  <p><a class="btn btn-primary btn-lg" href="resume.jsp" role="button">RESUME</a></p>
</div>
    </body>
</html>
