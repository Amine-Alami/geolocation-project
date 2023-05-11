<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
<h2>
    <a href="<c:url value="/?lang=fr" />">fr</a>
    <a href="<c:url value="/?lang=en" />">en</a>
</h2>
<h1 style="text-align: center"><spring:message code="application.title"/></h1>
<div style="text-align: center" class="w3-container">
    <h2>
        <a href="countries"><spring:message code="application.countries"/></a>
        <a href="cities"><spring:message code="application.cities"/></a>
    </h2>
</div>
</body>
</html>
