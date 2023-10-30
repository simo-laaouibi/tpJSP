package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entities.Machine;
import services.MachineService;
import entities.Salle;
import services.SalleService;

public final class machine_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <!-- Inclure les fichiers Bootstrap via CDN -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Gestion des Machines</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("    <div>\n");
      out.write("        <a class=\"navbar-brand\" href=\"\">\n");
      out.write("            <img src=\"machine.png\" style=\"margin-left: 80px;\" alt=\"Logo\" width=\"30\" height=\"30\">\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("        <ul class=\"navbar-nav\">\n");
      out.write("            <li class=\"nav-item\"><a class=\"nav-link\" href=\"machine.jsp\">Machine</a></li>\n");
      out.write("            <li class=\"nav-item\"><a class=\"nav-link\" href=\"salle.jsp\">Salle</a></li>\n");
      out.write("            <li class=\"nav-item\"><a class=\"nav-link\" href=\"recherche.jsp\">Recherche</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<div class=\"container mt-5\">\n");
      out.write("    ");

        String action = request.getParameter("action");
        MachineService machineService = new MachineService();
        SalleService salleService = new SalleService();

        if (action != null && action.equals("modifier")) {
            int machineId = Integer.parseInt(request.getParameter("id"));
            Machine machine = machineService.findById(machineId);
    
      out.write("\n");
      out.write("\n");
      out.write("    <form action=\"MachineController\" method=\"post\">\n");
      out.write("        <fieldset>\n");
      out.write("            <legend>Modifier une Machine</legend><br><br>\n");
      out.write("\n");
      out.write("            ");
 if (machine != null) {
      out.write("\n");
      out.write("            <input type=\"hidden\" name=\"id\" value=\"");
      out.print( machine.getId());
      out.write("\"/>\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"row mb-3\">\n");
      out.write("                <div class=\"col-md-2\">\n");
      out.write("                    <label for=\"ref\" class=\"form-label\">Référence</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"ref\" name=\"ref\" value=\"");
      out.print( (machine != null) ? machine.getRef() : "");
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row mb-3\">\n");
      out.write("                <div class=\"col-md-2\">\n");
      out.write("                    <label for=\"marque\" class=\"form-label\">Marque</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"marque\" name=\"marque\" value=\"");
      out.print( (machine != null) ? machine.getMarque() : "");
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row mb-3\">\n");
      out.write("                <div class=\"col-md-2\">\n");
      out.write("                    <label for=\"prix\" class=\"form-label\">Prix</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"prix\" name=\"prix\" value=\"");
      out.print( (machine != null) ? machine.getPrix() : "");
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row mb-3\">\n");
      out.write("                <div class=\"col-md-2\">\n");
      out.write("                    <label for=\"salleId\" class=\"form-label\">Salle</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <select class=\"form-select\" id=\"salleId\" name=\"salleId\">\n");
      out.write("                        <option value=\"\" selected>Choisir une salle</option>\n");
      out.write("                        ");

                            for (Salle salle : salleService.findAll()) {
                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print( salle.getId());
      out.write('"');
      out.write(' ');
      out.print( (machine != null && machine.getSalle() != null && machine.getSalle().getId() == salle.getId()) ? "selected" : "");
      out.write('>');
      out.print( salle.getCode());
      out.write("</option>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row mb-3\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\" name=\"modifier\" style=\"width: 200px; margin-left: 190px;\" value=\"Modifier\">Modifier</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </fieldset>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    ");

    } else {
    
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"container mt-5\">\n");
      out.write("        <form action=\"MachineController\" method=\"post\">\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Gestion des Machines</legend><br><br>\n");
      out.write("\n");
      out.write("                <div class=\"row mb-3\">\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("                        <label for=\"ref\" class=\"form-label\">Référence</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"ref\" name=\"ref\" value=\"\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row mb-3\">\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("                        <label for \"marque\" class=\"form-label\">Marque</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"marque\" name=\"marque\" value=\"\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row mb-3\">\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("                        <label for=\"prix\" class=\"form-label\">Prix</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"prix\" name=\"prix\" value=\"\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row mb-3\">\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("                        <label for=\"salleId\" class=\"form-label\">Salle</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <select class=\"form-select\" id=\"salleId\" name=\"salleId\">\n");
      out.write("                            <option value=\"\" selected>Choisir une salle</option>\n");
      out.write("                            ");

                                for (Salle salle : salleService.findAll()) {
                            
      out.write("\n");
      out.write("                            <option value=\"");
      out.print( salle.getId());
      out.write('"');
      out.write('>');
      out.print( salle.getCode());
      out.write("</option>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row mb-3\">\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\" name=\"valider\" style=\"width: 200px; margin-left: 190px;\">Valider</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    ");

    }
    
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"container mt-5\">\n");
      out.write("        <fieldset><br><br>\n");
      out.write("            <legend>Liste des Machines</legend><br><br>\n");
      out.write("            <table class=\"table table-striped\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Référence</th>\n");
      out.write("                        <th>Marque</th>\n");
      out.write("                        <th>Prix</th>\n");
      out.write("                        <th>Salle</th>\n");
      out.write("                        <th>Actions</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        for (Machine machine : machineService.findAll()) {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( machine.getRef());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( machine.getMarque());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( machine.getPrix());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( (machine.getSalle() != null) ? machine.getSalle().getCode() : "");
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"MachineController?op=delete&id=");
      out.print(machine.getId());
      out.write("\" class=\"btn btn-danger\">Supprimer</a>\n");
      out.write("                            <a href=\"?action=modifier&id=");
      out.print(machine.getId());
      out.write("\" class=\"btn btn-primary\">Modifier</a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </fieldset>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
