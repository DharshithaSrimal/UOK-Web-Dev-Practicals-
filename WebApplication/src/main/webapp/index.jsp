<!-- JSP Directive -->
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>

<!-- JSP Scriplet -->
<%
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
    out.println(dtf.format(now));
%>

<!-- JSP Declarations -->
<%! Date date = new Date(); %>
<%! String text = "The current date and time is "; %>

<!-- JSP Expression -->
<p>Today's date: <%= (new java.util.Date()).toLocaleString()%></p>

<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>