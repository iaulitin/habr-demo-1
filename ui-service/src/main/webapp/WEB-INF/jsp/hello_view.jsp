<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>

<head>
    <title>Hello view</title>
</head>

<body>
<div id="jsp-hello">Hello from JSP</div>
<div id="api-hello"></div>
<br/>


<a href="/view/goodbye_view">Go to goodbye page</a>


<script type="text/javascript">
    fetch('/api/hello/')
        .then(response => response.text())
        .then(response => document.getElementById("api-hello").innerText = response);
</script>
</body>


</html>