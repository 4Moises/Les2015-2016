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
public abstract class OPages extends Page {

    public OPages(PrintWriter o) {
        super(o);
    }
    protected void genMetaTab(){
        super.genMetaTab();
         printTab(); out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />");
    }
     protected void   genCSS(){
         super.genCSS();
          printTab(); out.println("<link rel=\"stylesheet\" href=\"assets/css/main.css\" />");
     }
   protected void genJS(){
       super.genJS();
       printTab(); out.println("<script src=\"assets/js/jquery.min.js\"></script>\n" +
"			<script src=\"assets/js/skel.min.js\"></script>\n" +
"			<script src=\"assets/js/util.js\"></script>\n" +
"			<!--[if lte IE 8]><script src=\"assets/js/ie/respond.min.js\"></script><![endif]-->\n" +
"			<script src=\"assets/js/main.js\"></script>");
   }
    protected void genRightSide(){}
    
    protected void genLeftSide(){
        printTab(); out.println("<div id=\"sidebar\">\n" +
"\n" +
"				<!-- Logo -->\n" +
"			<h1 id=\"logo\"><a href=\"#\">D.R</a></h1>\n" +
"\n" +
"				<!-- Nav -->\n" +
"			<nav id=\"nav\">\n" +
"			    <ul>\n" +
"                                                     \n" +
"				<li><a href=\"#\"><i class=\"fa fa-files-o\"></i> Alerta</a></li>\n" +
"                                                       <!-- <li class=\"current\"><a href=\"#\">Alerta</a></li>-->\n" +
"				<li><a href=\"configuracoes.php\" data-toggle=\"control-sidebar\"><i class=\"fa fa-gears\"></i> Configuração</a>  </li>\n" +
"							\n" +
"			    </ul>\n" +
"		       </nav>\n" +
"\n" +
"					<section class=\"box search\">\n" +
"						<form method=\"post\" action=\"#\">\n" +
"							<input type=\"text\" class=\"text\" name=\"search\" placeholder=\"Search\" />\n" +
"						</form>\n" +
"					</section>\n" +
"\n" +
"					<ul id=\"copyright\">\n" +
"						<li>&copy; LesCompany.</li><li>Design: <a href=\"http://html5up.net\">Les 2016</a></li>\n" +
"					</ul>\n" +
"\n" +
"			</div>");
        
    }
    @Override
    protected void genBody() {
        genRightSide();
        genLeftSide();
        
    }
    
}
