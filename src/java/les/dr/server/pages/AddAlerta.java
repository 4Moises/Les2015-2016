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
public class AddAlerta extends OPages {

    public AddAlerta(PrintWriter o) {
        super(o);
    }

    @Override
    protected void genTitle() {
    printTab(); out.println("<title>DR - Alerta Page</title>");
    }
    protected void genRightSide(){
        printTab(); out.println("<div id=\"content\">\n" +
"            <div class=\"inner\">\n" +
"\n" +
"                <!-- Post -->\n" +
"                <article class=\"box post post-excerpt\">\n" +
"                    <header>\n" +
"                        <!--\n" +
"                                Note: Titles and subtitles will wrap automatically when necessary, so don't worry\n" +
"                                if they get too long. You can also remove the <p> entirely if you don't\n" +
"                                need a subtitle.\n" +
"                        -->\n" +
"                        <h2><img src=\"images/DRE.png\" alt=\"\" /></h2>\n" +
"                        <!--<p>A free, fully responsive HTML5 site template by HTML5 UP</p>-->\n" +
"                    </header>\n" +
"                    <div class=\"info\">\n" +
"                        <!--\n" +
"                                Note: The date should be formatted exactly as it's shown below. In particular, the\n" +
"                                \"least significant\" characters of the month should be encapsulated in a <span>\n" +
"                                element to denote what gets dropped in 1200px mode (eg. the \"uary\" in \"January\").\n" +
"                                Oh, and if you don't need a date for a particular page or post you can simply delete\n" +
"                                the entire \"date\" element.\n" +
"\n" +
"                        -->\n" +
"                        <!--<span class=\"date\"><span class=\"month\">Jul<span>y</span></span> <span class=\"day\">14</span><span class=\"year\">, 2014</span></span>-->\n" +
"                        <!--\n" +
"                                Note: You can change the number of list items in \"stats\" to whatever you want.\n" +
"                        -->\n" +
"                        <!--<ul class=\"stats\">\n" +
"                                <li><a href=\"#\" class=\"icon fa-comment\">16</a></li>\n" +
"                                <li><a href=\"#\" class=\"icon fa-heart\">32</a></li>\n" +
"                                <li><a href=\"#\" class=\"icon fa-twitter\">64</a></li>\n" +
"                                <li><a href=\"#\" class=\"icon fa-facebook\">128</a></li>\n" +
"                        </ul>-->\n" +
"                    </div>\n" +
"                    <div class=\"container\">\n" +
"                        <div class=\"jumbotron\">\n" +
"                            <h2><i class=\"fa fa-files-o\"></i>Alerta</h2> \n" +
"                        </div>\n" +
"                        <br>\n" +
"                        <br>\n" +
"                        <br>\n" +
"                        <br>\n" +
"                        <nav class=\"navbar navbar-default\">\n" +
"\n" +
"\n" +
"                        </nav>\n" +
"                        <!-- REGISTRATION FORM -->\n" +
"                        <div class=\"panel panel-default\">\n" +
"                            <div class=\"panel-heading\"></div>\n" +
"                            <div class=\"panel-body\">    \n" +
"                                <form class=\"form-horizontal\" role=\"form\" action=\"inserir.php\" method=\"post\">\n" +
"\n" +
"                                    <div class=\"form-group\">\n" +
"                                        <label class=\"control-label col-sm-2\" for=\"nome\">Nome Alerta:</label>\n" +
"                                        <div class=\"col-sm-10\">\n" +
"                                            <input type=\"text\" class=\"form-control\" id=\"nome_alerta\" name=\"nome_alerta\" placeholder=\"Introduza o Alerta\">\n" +
"                                        </div>\n" +
"                                    </div>\n" +
"                                    <div class=\"form-group\">\n" +
"                                        <label class=\"control-label col-sm-2\" for=\"nome\">E-mail:</label>\n" +
"                                        <div class=\"col-sm-10\">          \n" +
"                                            <input type=\"text\" class=\"form-control\" id=\"email\" name=\"email\" placeholder=\"Introduza a email\">\n" +
"                                        </div>\n" +
"                                    </div>\n" +
"                                    <div class=\"form-group\">\n" +
"                                        <label class=\"control-label col-sm-2\" for=\"nome\">Data:</label>\n" +
"                                        <div class=\"col-sm-10\">          \n" +
"                                            <input type=\"date\" class=\"form-control\" id=\"data\" name=\"data\" placeholder=\"Introduza a password\">\n" +
"                                        </div>\n" +
"                                    </div>\n" +
"                                    <div class=\"form-group\">\n" +
"                                        <label class=\"control-label col-sm-2\" for=\"nome\">Discrição:</label>\n" +
"                                        <div class=\"col-sm-10\">          \n" +
"                                            <input type=\"text\" class=\"form-control\" id=\"discricao\" name=\"discricao\" placeholder=\"Introduza a discricao\">\n" +
"                                        </div>\n" +
"                                    </div>\n" +
"                                    <div class=\"form-group\">\n" +
"                                        <label class=\"control-label col-sm-2\" for=\"nome\">Nota:</label>\n" +
"                                        <div class=\"col-sm-10\">          \n" +
"                                            <input type=\"text\" class=\"form-control\" id=\"nota\" name=\"nota\" placeholder=\"Introduza a Nota\">\n" +
"                                        </div>\n" +
"                                    </div>\n" +
"                                    <div class=\"form-group\">\n" +
"                                        <label class=\"control-label col-sm-2\" for=\"pwd\">Assunto:</label>\n" +
"                                        <div class=\"col-sm-10\">          \n" +
"                                            <input type=\"text\" class=\"form-control\" id=\"assunto\" name=\"assunto\" placeholder=\"Introduza a assunto\">\n" +
"                                        </div>\n" +
"                                    </div>\n" +
"                                    <div class=\"form-group\">\n" +
"                                        <label class=\"control-label col-sm-2\" for=\"pwd\">Termo:</label>\n" +
"                                        <div class=\"col-sm-10\">          \n" +
"                                            <input type=\"text\" class=\"form-control\" id=\"assunto\" name=\"assunto\" placeholder=\"Introduza a assunto\">\n" +
"                                        </div>\n" +
"                                    </div>\n" +
"                                    <br>\n" +
"                                    <br>\n" +
"                                    <div class=\"form-group\">\n" +
"\n" +
"                                        <div class=\"col-sm-10\">          \n" +
"                                            <input type=\"radio\" name=\"gender\" value=\"1\"> Activo\n" +
"                                            <input type=\"radio\" name=\"gender\" value=\"0\"> Desatico\n" +
"                                        </div>\n" +
"                                    </div>\n" +
"                                    <br>\n" +
"                                    <br>\n" +
"                                    <div class=\"form-group\">        \n" +
"                                        <div class=\"col-sm-offset-2 col-sm-10\">\n" +
"                                            <button type=\"submit\" class=\"btn btn-default\" name=\"Submeter\">Submit</button>\n" +
"                                        </div>\n" +
"                                    </div>\n" +
"                                    <ul id=\"copyright\">\n" +
"                                        <li>&copy; LesCompany.</li><li>Design: <a href=\"http://html5up.net\">Les 2016</a></li>\n" +
"                                    </ul>\n" +
"                                </form>\n" +
"                            </div>\n" +
"                        </div>\n" +
"\n" +
"                    </div>\n" +
"                </article>\n" +
"\n" +
"                <!-- Post -->\n" +
"                <!--	<article class=\"box post post-excerpt\">\n" +
"                                <header>\n" +
"                                        <h2><a href=\"#\">Lorem ipsum dolor sit amet</a></h2>\n" +
"                                        <p>Feugiat interdum sed commodo ipsum consequat dolor nullam metus</p>\n" +
"                                </header>\n" +
"                                <div class=\"info\">\n" +
"                                        <span class=\"date\"><span class=\"month\">Jul<span>y</span></span> <span class=\"day\">8</span><span class=\"year\">, 2014</span></span>\n" +
"                                        <ul class=\"stats\">\n" +
"                                                <li><a href=\"#\" class=\"icon fa-comment\">16</a></li>\n" +
"                                                <li><a href=\"#\" class=\"icon fa-heart\">32</a></li>\n" +
"                                                <li><a href=\"#\" class=\"icon fa-twitter\">64</a></li>\n" +
"                                                <li><a href=\"#\" class=\"icon fa-facebook\">128</a></li>\n" +
"                                        </ul>\n" +
"                                </div>\n" +
"                                <a href=\"#\" class=\"image featured\"><img src=\"images/pic02.jpg\" alt=\"\" /></a>\n" +
"                                <p>\n" +
"                                        Quisque vel sapien sit amet tellus elementum ultricies. Nunc vel orci turpis. Donec id malesuada metus.\n" +
"                                        Nunc nulla velit, fermentum quis interdum quis, tate etiam commodo lorem ipsum dolor sit amet dolore.\n" +
"                                        Quisque vel sapien sit amet tellus elementum ultricies. Nunc vel orci turpis. Donec id malesuada metus.\n" +
"                                        Nunc nulla velit, fermentum quis interdum quis, convallis eu sapien. Integer sed ipsum ante.\n" +
"                                </p>\n" +
"                        </article>\n" +
"                -->\n" +
"                <!-- Pagination -->\n" +
"                <!-- 	<div class=\"pagination\">\n" +
"                                <a href=\"#\" class=\"button previous\">Previous Page</a>\n" +
"                                <div class=\"pages\">\n" +
"                                        <a href=\"#\" class=\"active\">1</a>\n" +
"                                        <a href=\"#\">2</a>\n" +
"                                        <a href=\"#\">3</a>\n" +
"                                        <a href=\"#\">4</a>\n" +
"                                        <span>&hellip;</span>\n" +
"                                        <a href=\"#\">20</a>\n" +
"                                </div>\n" +
"                                <a href=\"#\" class=\"button next\">Next Page</a>\n" +
"                        </div>\n" +
"                -->\n" +
"\n" +
"            </div>\n" +
"        </div>\n" +
"");
    }
    
}
