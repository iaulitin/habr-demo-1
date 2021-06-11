<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>

<head>
    <title>Hello view</title>
</head>

<body>
<div id="jsp-goodbye">Goodbye from JSP</div>
<div id="api-hello"></div>
<div id="api-goodbye"></div>

<br/>
<a href="/view/hello_view">Go to Hello page</a>

<script type="text/javascript">
    fetch('/api/hello/')
        .then(response => response.text())
        .then(response => document.getElementById("api-hello").innerText = response);

    fetch('/api/goodbye/')
        .then(response => response.text())
        .then(response => document.getElementById("api-goodbye").innerText = response);
</script>

</body>

</html>