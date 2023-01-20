<%--
  Created by IntelliJ IDEA.
  User: biao
  Date: 13/01/2023
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Trainings</title>
</head>
<body>
<h3> Trainings</h3>
<c:set var="baseURL" valaue="${pageContext.request.contextPath}">
    <table border="1" cellpadding="5" cellspacing="1">
    <tr>
    <th>Name</th>
    <th>Number Of Students</th>
    <th>Duration</th>
    <th colspan="2">Action</th>
    </tr>
    <tr>
    <c:forEach items="${applicationScope.trainings}" var="training">
        <td>${training.name}</td>
        <td>${training.nbrOfStudents}</td>
        <td>${training.duration}</td>
        <td>
            <a href="${baseURL}/trainings?name=${training.name}&action=update"></a>
        </td>
        <td>
            <a href="${baseURL}/trainings?name=${training.name}&action=delete"></a>
        </td>

        </tr>
    </c:forEach>
    </table>
    <a href="${baseURL}/trainings?action=create"></a>
    </body>
    </html>
