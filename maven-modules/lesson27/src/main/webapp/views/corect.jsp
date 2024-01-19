<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Right user</title>
  </head>

  <body>
    <h2>Application successfully saved</h2>
    <p>Name : <%= request.getAttribute("name") %></p>
    <p>Order : <%= request.getAttribute("order") %></p>
    <p>Price : <%= request.getAttribute("price") %></p>

    <div>
      <button onclick="location.href='index.html'">Back to app</button>
    </div>
  </body>
</html>
