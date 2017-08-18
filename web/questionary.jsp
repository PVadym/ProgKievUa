<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <title>Form Page</title>
</head>
<body>
<h1>Hello, please answer a few questions</h1>
<form action="/statistic" method="post">
  First name:<br>
  <input type="text" name="firstname" ><br>
  Last name:<br>
  <input type="text" name="lastname" ><br>
  Age:<br>
  <input type="number" name="age" min="0" max="100" value="0"><br>

  Are you happy?<br>
  <select name="happy">
    <option value="yes">Yes</option>
    <option value="no">No</option>
    </select><br>
  What program language do you know Java?<br>
  <input type="radio" name="lang" value="java" checked> Java<br>
  <input type="radio" name="lang" value="c++"> C++<br>
  <br>
  <input type="submit" name = "submit" value="Get statistic!">

</form>

</body>
</html>
