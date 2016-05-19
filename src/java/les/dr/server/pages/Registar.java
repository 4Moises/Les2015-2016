/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les.dr.server.pages;

import java.io.PrintWriter;

/**
 *
 * @author Utilizador
 */
public class Registar extends Page {

    public Registar(PrintWriter o) {
        super(o);
    }
     protected void genCSS(){
         printTab(); out.println("<link href=\"styles.css\" rel=\"stylesheet\">\n" +
"        <link rel=\"stylesheet\" type=\"text/css\" href=\"logincss.css\" />\n"+" <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">");
    }
      protected void genScript(){
          printTab(); out.println(" <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n" +
"        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>");
      }

    @Override
    protected void genTitle() {
     printTab(); out.println(" <title>Gestão de Utilizadores</title>");
    }

    @Override
    protected void genBody() {
        out.println("<Body>");
           tab++;
           tab--;
         printTab(); out.println("<div class=\"container\">\n" +
"            <div class=\"jumbotron\">\n" +
"                <h2><img src=\"images/DRE.png\" alt=\"\" /></h2> \n" +
"            </div>\n" +
"\n" +
"            <nav class=\"navbar navbar-default\">\n" +
"               \n" +
"\n" +
"            </nav>\n" +
"            <!-- REGISTRATION FORM -->\n" +
"            <div class=\"panel panel-default\">\n" +
"                <div class=\"panel-heading\">Registar</div>\n" +
"                <div class=\"panel-body\">    \n" +
"                    <form class=\"form-horizontal\" role=\"form\" action=\"inserir.php\" method=\"post\">\n" +
"                        \n" +
"                        <div class=\"form-group\">\n" +
"                            <label class=\"control-label col-sm-2\" for=\"nome\">Email:</label>\n" +
"                            <div class=\"col-sm-10\">\n" +
"                                <input type=\"email\" class=\"form-control\" id=\"email\" name=\"email\" placeholder=\"Introduza o email\">\n" +
"                            </div>\n" +
"                        </div>\n" +
"                        <div class=\"form-group\">\n" +
"                            <label class=\"control-label col-sm-2\" for=\"pwd\">Password:</label>\n" +
"                            <div class=\"col-sm-10\">          \n" +
"                                <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" placeholder=\"Introduza a password\">\n" +
"                            </div>\n" +
"                        </div>\n" +
"                        <div class=\"form-group\">\n" +
"                            <label class=\"control-label col-sm-2\" for=\"pwd\">Confirmação da Password:</label>\n" +
"                            <div class=\"col-sm-10\">          \n" +
"                                <input type=\"password\" class=\"form-control\" id=\"confirmacaoPassword\" name=\"confirmacaoPassword\" placeholder=\"Introduza a password\">\n" +
"                            </div>\n" +
"                        </div>\n" +
"                        \n" +
"                     \n" +
"                        <div class=\"form-group\">        \n" +
"                            <div class=\"col-sm-offset-2 col-sm-10\">\n" +
"                                <button type=\"submit\" class=\"btn btn-default\" name=\"Submeter\">Submit</button>\n" +
"                            </div>\n" +
"                        </div>\n" +
"<ul id=\"copyright\">\n" +
"						<li>&copy; LesCompany.</li><li>Design: <a href=\"http://html5up.net\">Les 2016</a></li>\n" +
"					</ul>\n" +
"                    </form>\n" +
"                </div>\n" +
"            </div>\n" +
"\n" +
"        </div>");
    
    }
    
}
