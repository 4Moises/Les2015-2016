/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les.dr.dao;

import com.sun.istack.internal.logging.Logger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;


/**
 *
 * @author Utilizador
 */
public class Notificacoes implements ICollection<Notificacao> {

    @Override
    public boolean add(Notificacao a) {
         boolean res = false;
        DBConnection mdb = DBConnection.instance();
        Connection cc = mdb.connect();
        if(cc!=null){
            
             try {
                 Statement st;
                 st =cc.createStatement();
                  st.executeUpdate("replace into notificacao "+
                        "values('"+a.getId_notificacao()+"','"+a.getDiscricao()+"', '"+a.getLink()+"','"+a.getSerie()+"','"+a.getData()+"');");
                  st.close();
                res = true;
             } catch (SQLException ex) {
                 java.util.logging.Logger.getLogger(Notificacoes.class.getName()).log(Level.SEVERE, null, ex);
             }
                
        }
        return res;
    }

    @Override
    public boolean rem(Notificacao a) {
        boolean res = false;
        DBConnection mdb = DBConnection.instance();
        Connection cc = mdb.connect();
            if(cc!=null){
                
            try {
                Statement st;
                st =cc.createStatement();
                st.executeUpdate("delete from Notificacao where email='"+a.getId_notificacao()+"';");
                st.close();
                res = true;
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Notificacoes.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            }
            return res;
    }

    @Override
    public Notificacao find(Notificacao a) {
       Notificacao res = null;
        DBConnection mdb = DBConnection.instance();
        Connection cc = mdb.connect();
            if(cc!=null){
            
            try {
                Statement st;
                st =cc.createStatement();
                ResultSet rs = st.executeQuery("select * from notificacao "
                                                  +" where id_notificacao='"+a.getId_notificacao()+"';");
                if(rs.first())
                   res = new Notificacao(rs.getInt("id_notificacao"),
                                     rs.getString("discricao"),
                                     rs.getString("link"),
                                     rs.getString("serie"),
                                     rs.getString("data"));
                rs.close();
                st.close();
               
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Notificacao.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                
           
            
        }
        return res;
        
    }

    @Override
    public List<Notificacao> list() {
        List<Notificacao> res = new java.util.LinkedList<Notificacao>();
        Notificacao n;
        DBConnection mdb = DBConnection.instance();
        Connection cc = mdb.connect();
            if(cc!=null){
            
            try {
                Statement st;
                st =cc.createStatement();
                ResultSet rs = st.executeQuery("select * from notificacao;");
                while(rs.next()){
                   n = new Notificacao(rs.getInt("id_notificacao"),
                                        rs.getString("discricao"),
                                        rs.getString("link"),
                                        rs.getString("serie"),
                                        rs.getString("data"));
                res.add(n);
                }
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Notificacao.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                
           
            
        }
        return res;
    }
    
}
