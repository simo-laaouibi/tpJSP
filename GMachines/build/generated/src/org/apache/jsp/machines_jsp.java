package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entities.Machine;
import services.MachineService;

public final class machines_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("       <form action=\"MachineController\">\n");
      out.write("            <fieldset>\n");
      out.write("                <legend> Informations machine </legend>\n");
      out.write("                <table border=\"0\">\n");
      out.write("               \n");
      out.write("                    \n");
      out.write("                        <tr>\n");
      out.write("                            <td> Reference :</td>\n");
      out.write("                            <td><input type=\"text\" name= \"ref\" value=\"\"/> </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Marque :</td>\n");
      out.write("                            <td><input type=\"text\" name= \"marque\" value=\"\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Prix :</td>\n");
      out.write("                            <td><input type=\"text\" name= \"prix\" value=\"\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td><input type=\"submit\" value=\"Ajouter \" /><input type=\"reset\" value=\"Annuler\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <fieldset>\n");
      out.write("            <legend>Liste des machines</legend>\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Id</th>\n");
      out.write("                        <th>Reference</th>\n");
      out.write("                        <th>Marque</th>\n");
      out.write("                        <th>Prix</th>\n");
      out.write("                        <th>Modifier</th>\n");
      out.write("                        <th>Supprimer</th>\n");
      out.write("                        \n");
      out.write("                            \n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        MachineService ms = new MachineService();
                        for(Machine m : ms.findAll()){
                            
                        
                        
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( m.getId() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( m.getRef() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( m.getMarque() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( m.getPrix() );
      out.write("</td>\n");
      out.write("                        <td><a href=\"MachineController?id=\"");
      out.print( m.getId());
      out.write(">Modifier</a></td>\n");
      out.write("                        <td><a href=\"MachineController?op=delete&id=");
      out.print( m.getId());
      out.write("\">Supprimer</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                    \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </fieldset>\n");
      out.write("    </body>\n");
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
