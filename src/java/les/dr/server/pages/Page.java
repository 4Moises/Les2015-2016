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
abstract public class Page {
    protected PrintWriter out =null;
    protected int tab=0;
    protected void printTab(){
        for(int i=0;i<tab;i++) out.print("\t");
    }
    
    public Page(PrintWriter o){
        out= o;
        
    }
    protected void genInit(){
        printTab(); out.println("<!DOCTYPE html>");
        printTab(); out.println("<html>");
    }
    protected void genClose(){
        printTab(); out.println("</html");
    }
    protected abstract void genHeader();
    protected abstract void genBody();
    public void genPage(){
        genInit();
        genHeader();
        genBody();
        genClose();
    }
}
