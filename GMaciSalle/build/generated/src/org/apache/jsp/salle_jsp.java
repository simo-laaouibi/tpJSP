package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entities.Salle;
import services.SalleService;

public final class salle_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <link href=\"css/styles.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js\"></script>\n");
      out.write("    <title>JSP Page</title>\n");
      out.write("    <style>\n");
      out.write("        /* Ajout de styles personnalisés */\n");
      out.write("        body {\n");
      out.write("            text-align: center;\n");
      out.write("            background-color: #f0f0f0;\n");
      out.write("        }\n");
      out.write("        .centered-container {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            height: 100vh;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            background-color: #ffffff;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            padding: 20px;\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("        fieldset {\n");
      out.write("            border: 2px solid #007BFF;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            margin: 20px;\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
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
      out.write("<div class=\"centered-container\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <form action=\"Sallecontroller\" method=\"GET\">\n");
      out.write("            <fieldset>\n");
      out.write("                <legend> Informations salle</legend>\n");
      out.write("                <table class=\"table table-striped\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>code:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"code\" value=\"\" /></td>\n");
      out.write("                    </tr> \n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><input type=\"submit\" class=\"btn btn-primary\" value=\"Ajouter\" /> &nbsp &nbsp<input type=\"reset\" class=\"btn btn-danger\" accept=\"\" value=\"Annuler\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </fieldset>\n");
      out.write("        </form> \n");
      out.write("        <fieldset>\n");
      out.write("            <legend> Liste des salles</legend>\n");
      out.write("            <table class=\"table table-striped\" border=\"1\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Id</th>\n");
      out.write("                        <th>Code</th>\n");
      out.write("                        <th>Modifier</th>\n");
      out.write("                        <th>Supprimer</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        SalleService ss = new SalleService();
                        for (Salle s : ss.findAll()){
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( s.getId() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( s.getCode() );
      out.write("</td>\n");
      out.write("                        <td><a href=\"Sallecontroller?op=update&id=");
      out.print( s.getId());
      out.write("\" class=\"btn btn-primary\">Modifier</a></td>\n");
      out.write("                        <td><a href=\"Sallecontroller?op=delete&id=");
      out.print( s.getId());
      out.write("\" class=\"btn btn-danger\">Supprimer</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("            <a href=\"recherche.jsp\" class=\"btn btn-primary\">Filtrage salle</a>\n");
      out.write("            <a href=\"machine.jsp\" class=\"btn btn-primary\">Aller vers Machines</a>\n");
      out.write("        </fieldset>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
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
