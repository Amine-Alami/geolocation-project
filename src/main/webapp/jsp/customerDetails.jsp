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
    <link rel="stylesheet" href="https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css" />

    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>

    <title>user localisation JSP</title>
</head>

<body onload="init()">

<div class="w3-container">
    <h2 style="text-align: center"><spring:message code="page.customer.title"/></h2>
    <br>
    <a class="w3-button" href="<c:url value="/" />"><spring:message code="application.back"/></a>

    <div class="w3-container w3-center">

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
                <tr>
                    <td>${customer.id}</td>
                    <td>${customer.prenom}</td>
                    <td>${customer.email}</td>
                    <td>${customer.active}</td>
                    <td>${customer.address.city}</td>
                    <td>${customer.address.city.country}</td>
                </tr>
            </tbody>
        </table>
        <div id="map"></div>
    </div>
</div>
<script>
    function initMap() {
        var map = new google.maps.Map(document.getElementById('map'), {
            zoom: 8,
            center: {lat: ${customers[0].latitude}, lng: ${customers[0].longitude}}

        });
        <c:forEach var="customer" items="${customers}">

        var marker = new google.maps.Marker({
            position: {lat: ${customer.latitude}, lng: ${customer.longitude}},

            map: map,
            title: '${customer.ville}'

        });
        </c:forEach>
    }
</script>
<script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyA0v_BXwGv-2-CZTMR_g371WtJy9JoWkPA&callback=initMap"></script>
</body>
</html>






