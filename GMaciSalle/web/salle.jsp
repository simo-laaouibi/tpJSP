<%-- 
    Document   : salle
    Created on : Oct 24, 2023, 11:05:22 PM
    Author     : oussama
--%>

<%@page import="entities.Salle"%>
<%@page import="services.SalleService"%>
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
        <form action="Sallecontroller" method="GET">
            <fieldset>
                <legend> Informations salle</legend>
                <table class="table table-striped">
                    <tr>
                        <td>code:</td>
                        <td><input type="text" name="code" value="" /></td>
                    </tr> 
                    <tr>
                        <td></td>
                        <td><input type="submit" class="btn btn-primary" value="Ajouter" /> &nbsp &nbsp<input type="reset" class="btn btn-danger" accept="" value="Annuler" /></td>
                    </tr>
                </table>
            </fieldset>
        </form> 
        <fieldset>
            <legend> Liste des salles</legend>
            <table class="table table-striped" border="1">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Code</th>
                        <th>Modifier</th>
                        <th>Supprimer</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        SalleService ss = new SalleService();
                        for (Salle s : ss.findAll()){
                    %>
                    <tr>
                        <td><%= s.getId() %></td>
                        <td><%= s.getCode() %></td>
                        <td><a href="Sallecontroller?op=update&id=<%= s.getId()%>" class="btn btn-primary">Modifier</a></td>
                        <td><a href="Sallecontroller?op=delete&id=<%= s.getId()%>" class="btn btn-danger">Supprimer</a></td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
            <a href="recherche.jsp" class="btn btn-primary">Filtrage salle</a>
            <a href="machine.jsp" class="btn btn-primary">Aller vers Machines</a>
        </fieldset>
    </div>
</div>
</body>
</html>
