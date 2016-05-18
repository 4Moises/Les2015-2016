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
public class IndexPage extends OPages {

    public IndexPage(PrintWriter o) {
        super(o);
    }
    @Override
    protected void genTitle() {
          printTab(); out.println("<title>DR - Login Page</title>");
        }
     protected void genRightSide(){
          printTab(); out.println("<div id=\"content\">\n" +
"				<div class=\"inner\">\n" +
"\n" +
"					<!-- Post -->\n" +
"						<article class=\"box post post-excerpt\">\n" +
"							<header>\n" +
"								<!--\n" +
"									Note: Titles and subtitles will wrap automatically when necessary, so don't worry\n" +
"									if they get too long. You can also remove the <p> entirely if you don't\n" +
"									need a subtitle.\n" +
"								-->\n" +
"								<h2><a href=\"#\">Welcome to Diário da Republica</a></h2>\n" +
"								<!--<p>A free, fully responsive HTML5 site template by HTML5 UP</p>-->\n" +
"							</header>\n" +
"							<div class=\"info\">\n" +
"								<!--\n" +
"									Note: The date should be formatted exactly as it's shown below. In particular, the\n" +
"									\"least significant\" characters of the month should be encapsulated in a <span>\n" +
"									element to denote what gets dropped in 1200px mode (eg. the \"uary\" in \"January\").\n" +
"									Oh, and if you don't need a date for a particular page or post you can simply delete\n" +
"									the entire \"date\" element.\n" +
"\n" +
"								-->\n" +
"								<!--<span class=\"date\"><span class=\"month\">Jul<span>y</span></span> <span class=\"day\">14</span><span class=\"year\">, 2014</span></span>-->\n" +
"								<!--\n" +
"									Note: You can change the number of list items in \"stats\" to whatever you want.\n" +
"								-->\n" +
"								<!--<ul class=\"stats\">\n" +
"									<li><a href=\"#\" class=\"icon fa-comment\">16</a></li>\n" +
"									<li><a href=\"#\" class=\"icon fa-heart\">32</a></li>\n" +
"									<li><a href=\"#\" class=\"icon fa-twitter\">64</a></li>\n" +
"									<li><a href=\"#\" class=\"icon fa-facebook\">128</a></li>\n" +
"								</ul>-->\n" +
"							</div>\n" +
"							<a href=\"#\" class=\"image featured\"><img src=\"images/Diario_da_republica.jpg\" alt=\"\" /></a>\n" +
"							<!--<p>\n" +
"								<strong>Hello!</strong> You're looking at <strong>Striped</strong>, a fully responsive HTML5 site template designed by <a href=\"http://n33.co\">AJ</a>\n" +
"								for <a href=\"http://html5up.net\">HTML5 UP</a> It features a clean, minimalistic design, styling for all basic page elements (including blockquotes, tables and lists), a\n" +
"								repositionable sidebar (left or right), and HTML5/CSS3 code designed for quick and easy customization (see code comments for details).\n" +
"							</p>\n" +
"							<p>\n" +
"								Striped is released for free under the <a href=\"http://html5up.net/license\">Creative Commons Attribution license</a> so feel free to use it for personal projects\n" +
"								or even commercial ones &ndash; just be sure to credit <a href=\"http://html5up.net\">HTML5 UP</a> for the design. If you like what you see here, be sure to check out\n" +
"								<a href=\"http://html5up.net\">HTML5 UP</a> for more cool designs or follow me on <a href=\"http://twitter.com/n33co\">Twitter</a> for new releases and updates.\n" +
"							</p>-->\n" +
"						</article>\n" +
"\n" +
"					<!-- Post -->\n" +
"					<!--	<article class=\"box post post-excerpt\">\n" +
"							<header>\n" +
"								<h2><a href=\"#\">Lorem ipsum dolor sit amet</a></h2>\n" +
"								<p>Feugiat interdum sed commodo ipsum consequat dolor nullam metus</p>\n" +
"							</header>\n" +
"							<div class=\"info\">\n" +
"								<span class=\"date\"><span class=\"month\">Jul<span>y</span></span> <span class=\"day\">8</span><span class=\"year\">, 2014</span></span>\n" +
"								<ul class=\"stats\">\n" +
"									<li><a href=\"#\" class=\"icon fa-comment\">16</a></li>\n" +
"									<li><a href=\"#\" class=\"icon fa-heart\">32</a></li>\n" +
"									<li><a href=\"#\" class=\"icon fa-twitter\">64</a></li>\n" +
"									<li><a href=\"#\" class=\"icon fa-facebook\">128</a></li>\n" +
"								</ul>\n" +
"							</div>\n" +
"							<a href=\"#\" class=\"image featured\"><img src=\"images/pic02.jpg\" alt=\"\" /></a>\n" +
"							<p>\n" +
"								Quisque vel sapien sit amet tellus elementum ultricies. Nunc vel orci turpis. Donec id malesuada metus.\n" +
"								Nunc nulla velit, fermentum quis interdum quis, tate etiam commodo lorem ipsum dolor sit amet dolore.\n" +
"								Quisque vel sapien sit amet tellus elementum ultricies. Nunc vel orci turpis. Donec id malesuada metus.\n" +
"								Nunc nulla velit, fermentum quis interdum quis, convallis eu sapien. Integer sed ipsum ante.\n" +
"							</p>\n" +
"						</article>\n" +
"                                        -->\n" +
"					<!-- Pagination -->\n" +
"					<!-- 	<div class=\"pagination\">\n" +
"							<a href=\"#\" class=\"button previous\">Previous Page</a>\n" +
"							<div class=\"pages\">\n" +
"								<a href=\"#\" class=\"active\">1</a>\n" +
"								<a href=\"#\">2</a>\n" +
"								<a href=\"#\">3</a>\n" +
"								<a href=\"#\">4</a>\n" +
"								<span>&hellip;</span>\n" +
"								<a href=\"#\">20</a>\n" +
"							</div>\n" +
"							<a href=\"#\" class=\"button next\">Next Page</a>\n" +
"						</div>\n" +
"                            -->\n" +
"\n" +
"				</div>\n" +
"			</div>");
         
     }
    
    
}
