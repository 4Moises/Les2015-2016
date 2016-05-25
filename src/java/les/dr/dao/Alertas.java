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
 * @author rodma
 */
public class Alertas implements ICollection<Alerta> {
    
    @Override
    public boolean add(Alerta a) {
        boolean res=false;
        DBConnection mdb = DBConnection.instance();
        Connection cc =mdb.connect();
        if(cc!=null){   
        try {
            Statement st;
            st=cc.createStatement();
            st.executeUpdate("replace into alerta "+" values('"+a.getId_alerta()+"','"+a.getNome()+"','"+a.getEmaill()+"','"+a.getDescricao()+"','"+a.getEstado()+"','"+a.getData()+"','"+a.getNota()+"','"+a.getOn()+"','"+a.getAssunto()+"','"+a.getEmail()+"');");
            st.close();
            res=true;
        } catch (SQLException ex) {
            Logger.getLogger(Alerta.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
        return res;
    }

    @Override
    public boolean rem(Alerta a) {
        boolean res=false;
        DBConnection mdb = DBConnection.instance();
        Connection cc =mdb.connect();
        if(cc!=null){   
        try {
            Statement st;
            st=cc.createStatement();
            st.executeUpdate("delete from alerta where id_alerta='"+a.getId_alerta()+"';");
            st.close();
            res=true;
        } catch (SQLException ex) {
            Logger.getLogger(Alerta.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
        return res;
    }

    @Override
    public Alerta find(Alerta a) {
        Alerta res=null;
        DBConnection mdb = DBConnection.instance();
        Connection cc =mdb.connect();
        if(cc!=null){   
        try {
            Statement st;
            st=cc.createStatement();
            ResultSet rs=st.executeQuery("select * from alerta where id_alerta='"+a.getId_alerta()+"';");
            res=new Alerta(rs.getInt("id_alerta"), rs.getString("nome"), rs.getString("emaill"), rs.getString("descricao"), rs.getInt("estado"), rs.getString("data"), rs.getString("nota"), rs.getInt("on"), rs.getString("assunto"), rs.getString("email"));
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(Utilizador.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
        return res;
    }

    @Override
    public List<Alerta> list() {
        List<Alerta> res=new java.util.LinkedList<Alerta>();
        Alerta a;
        DBConnection mdb = DBConnection.instance();
        Connection cc =mdb.connect();
        if(cc!=null){   
        try {
            Statement st;
            st=cc.createStatement();
            ResultSet rs=st.executeQuery("select * from alerta;");
            while(rs.next()){
                a = new Alerta(rs.getInt("id_alerta"), rs.getString("nome"), rs.getString("emaill"), rs.getString("descricao"), rs.getInt("estado"), rs.getString("data"), rs.getString("nota"), rs.getInt("on"), rs.getString("assunto"), rs.getString("email"));
                res.add(a);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(Alerta.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
        return res;
        
        
    }

    
}