<%--
    Document   : recherche
    Created on : Oct 29, 2023, 5:42:11 PM
    Author     : oussama
--%>

<%@page import="entities.Salle"%>
<%@page import="services.SalleService"%>
<%@page import="entities.Machine"%>
<%@page import="services.MachineService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="css/styles.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
    <title>JSP Page</title>
    <style>
        /* Ajout de styles personnalisés */
        body {
            text-align: center;
            background-color: #f0f0f0;
        }
        .centered-container {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            background-color: #ffffff;
            border-radius: 10px;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        fieldset {
            border: 2px solid #007BFF;
            border-radius: 10px;
            margin: 20px;
            padding: 20px;
        }
    </style>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div>
            <a class="navbar-brand" href="">
                <img src="machine.png" style="margin-left: 80px;" alt="Logo" width="30" height="30">
            </a>
        </div>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item"><a class="nav-link" href="machine.jsp">Machine</a></li>
                <li class="nav-item"><a class="nav-link" href="salle.jsp">Salle</a></li>
                <li class="nav-item"><a class="nav-link" href="recherche.jsp">Recherche</a></li>
            </ul>
        </div>
    </nav>
    <div class="centered-container">
        <div class="container">
            <form action="RechercheController" method="post">
                <fieldset>
                    <legend>Recherche Machines par Salle</legend>
                    <label for="salleId">Select a Salle:</label>
                    <select name="salleId" class="form-control">
                        <%
                            SalleService ss = new SalleService();
                            Salle s = null;
                            for (Salle salle : ss.findAll()) {
                        %>
                        <option value="<%=salle.getId()%>"><%= salle.getCode()%></option>
                        <%
                            }
                        %>
                    </select>
                    <input type="submit" class="btn btn-primary" value="Search">
                </fieldset>
            </form>
            <fieldset>
                <legend>Liste des Machines</legend>
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>REF</th>
                            <th>MARQUE</th>
                            <th>PRIX</th>
                            <th>SALLE</th>
                            <th>Supprimer</th>
                            <th>Modifier</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            MachineService ms = new MachineService();
                            int id = -1;
                            if (request.getParameter("salleId") != null) {
                                id = Integer.parseInt(request.getParameter("salleId"));
                                for (Machine m : ms.findAll()) {
                                    if (m.getSalle().getId() == id) {
                        %>
                        <tr>
                            <td><%= m.getId()%></td>
                            <td><%= m.getRef()%></td>
                            <td><%= m.getMarque()%></td>
                            <td><%= m.getPrix()%></td>
                            <td><%= m.getSalle().getCode()%></td>
                            <td><a href="MachineController?op=delete&id=<%= m.getId()%>" class="btn btn-danger">Supprimer</a></td>
                            <td><a href="MachineController?op=update&id=<%= m.getId()%>" class="btn btn-primary">Modifier</a></td>
                        </tr>
                        <%
                                        System.out.println("Machine matched with selected Salle ID.");
                                    }
                                }
                            }
                        %>
                    </tbody>
                </table>
            </fieldset>
        </div>
    </div>
</body>
</html>
