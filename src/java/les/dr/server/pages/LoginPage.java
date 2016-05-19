/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les.dr.server.pages;

import java.io.PrintWriter;


/**
 *
 * @author Carlos Sampaio
 */
public class LoginPage extends Page {
    private String _msg="";

    public LoginPage(PrintWriter o) {super(o);}
    public LoginPage(PrintWriter o, String msg){
        super(o);
        _msg=msg;
    }
    
    protected void genCSS(){
         printTab(); out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"logincss.css\" />");
    }
    protected void genTitle(){
        printTab(); out.println("<title>DR - Login Page</title>");
    }
    
    @Override
      protected void genBody(){
           out.println("<Body>");
           tab++;
           tab--;
           printTab(); out.println("<div class=\"container\">\n" +
"    \n" +
"	<section id=\"content\">\n" +
"            <h2 style=\"margin-bottom: 15px\"><img src=\"images/DRE.png\" alt=\"\" /></h2> \n" +
"		<form action=\"Index\" method=\"POST\">\n" +
"		\n" +
"			<div>\n" +
"				<input type=\"text\" placeholder=\"Email\" required=\"\" name=\"email\" />\n" +
"			</div>\n" +
"			<div>\n" +
"				<input type=\"password\" placeholder=\"Password\" required=\"\" name=\"password\" />\n" +
"			</div>\n" +
         "           <div id=\"ppp\">"+_msg+"</div>"+
"			<div>\n" +
"				<input type=\"submit\" value=\"Log in\" />\n" +
"				<a href=\"#\">Esqueci-me da palavra-passe</a>\n" +
"                                <a href=\"Registar.php\">Register</a>\n" +
"			</div>\n" +
"		</form><!-- form -->\n" +
"		<div class=\"button\">\n" +
"			<!--<a href=\"#\">Download source file</a> -->\n" +
"		</div><!-- button -->\n" +
"	</section><!-- content -->\n" +
"</div>");
      }
}
