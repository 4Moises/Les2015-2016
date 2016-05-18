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
abstract public class Page {

    PrintWriter out = null;
    protected int tab = 0;

    protected void printTab() {
        for (int i = 0; i < tab; i++) {
            out.print("\t");
        }
    }

    public Page(PrintWriter o) { //PrintWriter é 
        out = o;
    }

    protected void genInit() { // para gerar uma pag. -- fixo para todos
        printTab();
        out.println("<!DOCTYPE html>");
        printTab();
        out.println("<html>");
    }

    protected void genClose() { // --fixo para todas as pag
        printTab();
        out.println("</html>");
    }
    
    protected void genMetaTab(){
        printTab(); out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
    }
     protected abstract void genTitle();
     protected void   genCSS(){}
     protected void   genJS(){}
      protected void  genScript(){}

    protected void genHeader(){
        
        out.println("<head>");
        tab++;
        genMetaTab();
        genTitle();
        genCSS();
        genJS();
        genScript();
        tab--;
        out.println("<head>");
    }

    protected abstract void genBody(); //
    public void genPage() { //
        genInit();
        genHeader();
        genBody();
        genClose();
    }

    

}
