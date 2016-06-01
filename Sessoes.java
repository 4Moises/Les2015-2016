/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les.dr.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Joeline
 */
public class Sessoes implements ICollection<Sessao> {

    @Override
    public boolean add(Sessao a) {
        boolean res=false;
        DBConnection mdb = DBConnection.instance();
        Connection cc =mdb.connect();
        if(cc!=null){   
        try {
            Statement st;
            st=cc.createStatement();
            st.executeUpdate("replace into les values('" + a.getId()+ "', '" + a.getEmail()+ "','" + a.gethora_inicio()+"'); ");
            st.close();
            res=true;
        } catch (SQLException ex) {
            Logger.getLogger(Sessoes.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
        return res;}

    @Override
    public boolean rem(Sessao a) {
             boolean res = false;
        DBConnection mdb = DBConnection.instance();
        Connection cc = mdb.connect();
        if (cc != null) {

            Statement st;

            try {
                st = cc.createStatement();
                st.executeUpdate("delete from Sessao where id_sessao='" + a.getId()+ "';");
                st.close();
                res = true;
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Sessoes.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return res;
    
    }

    @Override
    public Sessao find(Sessao a) {
         Sessao res = null;
        DBConnection mdb = DBConnection.instance();
        Connection cc = mdb.connect();
        if (cc != null) {
            try {
                Statement st;
                st = cc.createStatement();
                ResultSet rs = st.executeQuery("select * from Sessao"
                        + " where id_sessao='" + a.getId()+ "';");
                if (rs.first()) {
                    res = new Sessao(rs.getString("id_sessao"),
                            rs.getDate("hora_inicio"),
                            rs.getString("email")
                         );
                }
                rs.close();
                st.close();

            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Sessoes.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return res;
    
    }


@Override
    public List<Sessao> list() {
        List<Sessao> res = new java.util.LinkedList<Sessao>();
        Sessao s;
        DBConnection mdb = DBConnection.instance();
        Connection cc = mdb.connect();
        if (cc != null) {
            try {
                Statement st;
                st = cc.createStatement();
                ResultSet rs = st.executeQuery("select * from sessao");
                while (rs.next()){
                    s = new Sessao(rs.getString("id_sessao"),
                             rs.getDate("hora_inicio"),
                            rs.getString("email")
                            );
                    res.add(s);
                }
                rs.close();
                st.close();

            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Sessoes.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return res;
    }

}

