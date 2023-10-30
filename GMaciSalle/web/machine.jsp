<%--
Document : Machine
Created on: 6 oct. 2023, 21:18:55
Author: hp
--%>

<%@page import="entities.Machine"%>
<%@page import="services.MachineService"%>
<%@page import="entities.Salle"%>
<%@page import="services.SalleService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Inclure les fichiers Bootstrap via CDN -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Gestion des Machines</title>
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

<div class="container mt-5">
    <%
        String action = request.getParameter("action");
        MachineService machineService = new MachineService();
        SalleService salleService = new SalleService();

        if (action != null && action.equals("modifier")) {
            int machineId = Integer.parseInt(request.getParameter("id"));
            Machine machine = machineService.findById(machineId);
    %>

    <form action="MachineController" method="post">
        <fieldset>
            <legend>Modifier une Machine</legend><br><br>

            <% if (machine != null) {%>
            <input type="hidden" name="id" value="<%= machine.getId()%>"/>
            <% }%>

            <div class="row mb-3">
                <div class="col-md-2">
                    <label for="ref" class="form-label">Référence</label>
                </div>
                <div class="col-md-4">
                    <input type="text" class="form-control" id="ref" name="ref" value="<%= (machine != null) ? machine.getRef() : ""%>">
                </div>
            </div>

            <div class="row mb-3">
                <div class="col-md-2">
                    <label for="marque" class="form-label">Marque</label>
                </div>
                <div class="col-md-4">
                    <input type="text" class="form-control" id="marque" name="marque" value="<%= (machine != null) ? machine.getMarque() : ""%>">
                </div>
            </div>

            <div class="row mb-3">
                <div class="col-md-2">
                    <label for="prix" class="form-label">Prix</label>
                </div>
                <div class="col-md-4">
                    <input type="text" class="form-control" id="prix" name="prix" value="<%= (machine != null) ? machine.getPrix() : ""%>">
                </div>
            </div>

            <div class="row mb-3">
                <div class="col-md-2">
                    <label for="salleId" class="form-label">Salle</label>
                </div>
                <div class="col-md-4">
                    <select class="form-select" id="salleId" name="salleId">
                        <option value="" selected>Choisir une salle</option>
                        <%
                            for (Salle salle : salleService.findAll()) {
                        %>
                        <option value="<%= salle.getId()%>" <%= (machine != null && machine.getSalle() != null && machine.getSalle().getId() == salle.getId()) ? "selected" : ""%>><%= salle.getCode()%></option>
                        <%
                            }
                        %>
                    </select>
                </div>
            </div>

            <div class="row mb-3">
                <div class="col-md-4">
                    <button type="submit" class="btn btn-primary" name="modifier" style="width: 200px; margin-left: 190px;" value="Modifier">Modifier</button>
                </div>
            </div>
        </fieldset>
    </form>

    <%
    } else {
    %>

    <div class="container mt-5">
        <form action="MachineController" method="post">
            <fieldset>
                <legend>Gestion des Machines</legend><br><br>

                <div class="row mb-3">
                    <div class="col-md-2">
                        <label for="ref" class="form-label">Référence</label>
                    </div>
                    <div class="col-md-4">
                        <input type="text" class="form-control" id="ref" name="ref" value="">
                    </div>
                </div>

                <div class="row mb-3">
                    <div class="col-md-2">
                        <label for "marque" class="form-label">Marque</label>
                    </div>
                    <div class="col-md-4">
                        <input type="text" class="form-control" id="marque" name="marque" value="">
                    </div>
                </div>

                <div class="row mb-3">
                    <div class="col-md-2">
                        <label for="prix" class="form-label">Prix</label>
                    </div>
                    <div class="col-md-4">
                        <input type="text" class="form-control" id="prix" name="prix" value="">
                    </div>
                </div>

                <div class="row mb-3">
                    <div class="col-md-2">
                        <label for="salleId" class="form-label">Salle</label>
                    </div>
                    <div class="col-md-4">
                        <select class="form-select" id="salleId" name="salleId">
                            <option value="" selected>Choisir une salle</option>
                            <%
                                for (Salle salle : salleService.findAll()) {
                            %>
                            <option value="<%= salle.getId()%>"><%= salle.getCode()%></option>
                            <%
                                }
                            %>
                        </select>
                    </div>
                </div>

                <div class="row mb-3">
                    <div class="col-md-4">
                        <button type="submit" class="btn btn-primary" name="valider" style="width: 200px; margin-left: 190px;">Valider</button>
                    </div>
                </div>
            </fieldset>
        </form>
    </div>

    <%
    }
    %>

    <div class="container mt-5">
        <fieldset><br><br>
            <legend>Liste des Machines</legend><br><br>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Référence</th>
                        <th>Marque</th>
                        <th>Prix</th>
                        <th>Salle</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        for (Machine machine : machineService.findAll()) {
                    %>
                    <tr>
                        <td><%= machine.getRef()%></td>
                        <td><%= machine.getMarque()%></td>
                        <td><%= machine.getPrix()%></td>
                        <td><%= (machine.getSalle() != null) ? machine.getSalle().getCode() : ""%></td>
                        <td>
                            <a href="MachineController?op=delete&id=<%=machine.getId()%>" class="btn btn-danger">Supprimer</a>
                            <a href="?action=modifier&id=<%=machine.getId()%>" class="btn btn-primary">Modifier</a>
                        </td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
        </fieldset>
    </div>
</body>
</html>
