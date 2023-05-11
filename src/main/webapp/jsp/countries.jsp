<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 	CSS (w3css) de la Page -->
    <link rel="stylesheet" href="<c:url value="css/w3.css" />"/>
    <style>
        #map {
            height: 400px;
            width: 100%;
        }
    </style>

    <title>Countries JSP</title>

</head>

<body onload="init();">


<div class="w3-container">
    <h2 style="text-align: center"><spring:message code="page.country.title"/></h2>
    <br>
    <a class="w3-button" href="<c:url value="/" />"><spring:message code="application.back"/></a>

    <div class="w3-container w3-center">
        <a class="w3-button" href="<c:url value="countryModify" />"><spring:message code="application.new"/></a>
        <table id="countriesTable" class="w3-centered w3-table-all">
            <thead>
            <tr class="w3-light-grey">
                <th><spring:message code="application.id"/></th>
                <th><spring:message code="application.country"/></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${countries}" var="elem">
                <tr>
                    <th scope="row">${elem.id}</th>
                    <td>${elem.country}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>

<div class="w3-container w3-center">
    <a class="w3-button" href="<c:url value="/" />"><spring:message code="application.new"/></a>
    <table id="appTable" class="display w3-centered w3-table-all">
        <thead>
        <tr>
            <th>ID</th>
            <th>Nom</th>
            <th>Prénom</th>
            <th>Email</th>
            <th>Active</th>
            <th>Ville</th>
            <th>Pays</th>
        </tr>
        </thead>
        <tbody>
        <%--            <c:forEach items="${customers}" var="customer">--%>
        <tr>
            <%--                    <td>${customer.id}</td>--%>
            <%--                    <td>${customer.nom}</td>--%>
            <%--                    <td>${customer.prenom}</td>--%>
            <%--                    <td>${customer.email}</td>--%>
            <%--                    <td>${customer.active}</td>--%>
            <%--                    <td>${customer.ville}</td>--%>
            <%--                    <td>${customer.pays}</td>--%>

            <td>2</td>
            <td>Garoiaz</td>
            <td>Radouane</td>
            <td>garoaiz.radouane@gg.gg</td>
            <td>True</td>
            <td>Paris</td>
            <td>France</td>

        </tr>
        <%--            </c:forEach>--%>
        </tbody>
    </table>
    <div id="map"></div>
</div>
</div>
<script>
    function initMap() {
        var map = new google.maps.Map(document.getElementById('map'), {
            zoom: 8,
            <%--center: {lat: ${users[0].latitude}, lng: ${users[0].longitude}}--%>
            center: {lat: 48.856614, lng: 2.3522219}
        });
        <%--        <c:forEach var="user" items="${users}">--%>

        var marker = new google.maps.Marker({
            <%--position: {lat: ${user.latitude}, lng: ${user.longitude}},--%>
            position: {lat: 48.856614, lng: 2.3522219},
            map: map,
            <%--title: '${user.ville}'--%>
            title: 'Paris'
        });
        <%--        </c:forEach>--%>
    }
</script>
<script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyA0v_BXwGv-2-CZTMR_g371WtJy9JoWkPA&callback=initMap"></script>
</body>
<!-- JavaScript resources dataTables + jQuery -->

</html>
