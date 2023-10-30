/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Machine;
import entities.Salle;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.MachineService;
import services.SalleService;

/**
 *
 * @author oussama
 */
@WebServlet(name = "MachineController", urlPatterns = {"/MachineController"})
public class MachineController extends HttpServlet {
     MachineService ms = new MachineService();
    SalleService salleService = new SalleService();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("op") != null) {
            String op = request.getParameter("op");
            if (op.equals("delete")) {
                ms.delete(ms.findById(Integer.parseInt(request.getParameter("id"))));
            }
        } else {
            if (request.getParameter("valider") != null) {

                String ref = request.getParameter("ref");
                String marque = request.getParameter("marque");
                double prix = Double.parseDouble(request.getParameter("prix"));
                Salle s = salleService.findById(Integer.parseInt(request.getParameter("salleId")));
                ms.create(new Machine(ref, marque, prix, s));
            } else {
                String ref = request.getParameter("ref");
                String marque = request.getParameter("marque");
                double prix = Double.parseDouble(request.getParameter("prix"));
                Salle s = salleService.findById(Integer.parseInt(request.getParameter("salleId")));

                Machine m = ms.findById(Integer.parseInt(request.getParameter("id")));
                m.setRef(ref);
                m.setMarque(marque);
                m.setPrix(prix);
                m.setSalle(s);
                ms.update(m);
            }
        }
        response.sendRedirect("machine.jsp");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
