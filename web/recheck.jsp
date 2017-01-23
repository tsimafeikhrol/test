<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Recheck</title>
    </head>
    <body>
        <h1>
            <%
            String name = request.getParameter("name");

            if (name == null || name.length() == 0) {
                
                %>
                JSP Recheck
                <% } else {
                %>
                
                JSP Recheck <%= name%>
                
                <%
                }
                %>
        </h1>
    </body>
</html>
