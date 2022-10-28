<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<fieldset>
  <legend> Result Division </legend>
  <c:forEach items="${condiment}" var="math">
    <h1><c:if test="${math == 'Addition(+)'}">24</c:if></h1>
    <h2><c:if test="${math == 'Subtraction(-)'}">0</c:if></h2>
    <h3><c:if test="${math == 'Multiplication(X)'}">144</c:if></h3>
    <h4><c:if test="${math == 'Division(/)'}">1</c:if></h4>
  </c:forEach>
</fieldset>
</body>
</html>
