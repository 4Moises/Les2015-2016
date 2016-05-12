/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les.dr.server.pages;

import java.io.PrintWriter;
import java.util.List;
import les.dr.dao.Utilizador;
import les.dr.dao.Utilizadores;

/**
 *
 * @author Carlos Sampaio
 */
public class PInicial extends Page {

    public PInicial(PrintWriter o) {
        super(o);
    }

    @Override
    protected void genHeader() {
        out.println("<head>");
        tab++;
        printTab();
        out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
        printTab();
        out.println("<title>JSP Page</title>");
        tab--;
        out.println("</head>");

    }

    @Override
    protected void genBody() {
        printTab();
        out.println("<body>");
        tab++;
        printTab();
        out.println("<table style='width: 100%'>");

        Utilizadores uts = new Utilizadores();
        List<Utilizador> lu = uts.list();
        tab++;
        for (Utilizador u : lu) {
            printTab();
            out.println("tr");
            tab++;
            printTab();
            out.println("<td>" + u.getEmail() + "</td>");
            printTab();
            out.println("<td>" + u.getName() + "</td>");
            printTab();
            out.println("<td>" + u.getPassword() + "</td>");
            tab--;
            printTab();
            out.println("</tr>");

        }
        tab--;
        printTab();
        out.println("</table>");
        tab--;
        printTab(); out.println("</body>");

    }

}
