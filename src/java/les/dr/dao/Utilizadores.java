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

public class Utilizadores implements ICollection<Utilizador> {

    @Override
    public boolean add(Utilizador a) {
        boolean res = false;
        DBConnection mdb = DBConnection.instance();
        Connection cc = mdb.connect();
            if(cc!=null){
            
            try {
                Statement st;
                st =cc.createStatement();
                st.executeUpdate("replace into utilizador "+
                        "values('"+a.getName()+"','"+a.getEmail()+"', '"+a.getPassword()+"','"+a.getTipo()+"');");
                st.close();
                res = true;
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Utilizadores.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                
           
            
        }
        return res;
    }

    @Override
    public boolean rem(Utilizador a) {
        boolean res = false;
        DBConnection mdb = DBConnection.instance();
        Connection cc = mdb.connect();
            if(cc!=null){
            
            try {
                Statement st;
                st =cc.createStatement();
                st.executeUpdate("delete from Utilizador where email='"+a.getEmail()+"';");
                st.close();
                res = true;
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Utilizadores.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                
           
            
        }
        return res;
    }

    @Override
    public Utilizador find(Utilizador a) {
         Utilizador res = null;
        DBConnection mdb = DBConnection.instance();
        Connection cc = mdb.connect();
            if(cc!=null){
            
            try {
                Statement st;
                st =cc.createStatement();
                ResultSet rs = st.executeQuery("select * from utilizador "
                                                  +" where email='"+a.getEmail()+"';");
                if(rs.first())
                   res = new Utilizador(rs.getString("email"),
                                     rs.getString("nome"),
                                     rs.getString("password"),
                                     rs.getInt("tipo"));
                rs.close();
                st.close();
               
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Utilizadores.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                
           
            
        }
        return res;
        
          }

    @Override
    public List<Utilizador> list() {
        List<Utilizador> res = new java.util.LinkedList<Utilizador>();
        Utilizador u;
        DBConnection mdb = DBConnection.instance();
        Connection cc = mdb.connect();
            if(cc!=null){
            
            try {
                Statement st;
                st =cc.createStatement();
                ResultSet rs = st.executeQuery("select * from utilizador;");
                while(rs.next()){
                   u = new Utilizador(rs.getString("email"),
                                        rs.getString("nome"),
                                        rs.getString("password"),
                                        rs.getInt("tipo"));
                res.add(u);
                }
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Utilizadores.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                
           
            
        }
        return res;
    }
    
    public List<Utilizador> admin(int tipo){
        List<Utilizador> res=new java.util.LinkedList<Utilizador>();
        Utilizador u;
        DBConnection mdb = DBConnection.instance();
        Connection cc =mdb.connect();
        if(cc!=null){   
        try {
            Statement st;
            st=cc.createStatement();
            ResultSet rs=st.executeQuery("select * from utilizador where tipo=1;");
            while(rs.next()){
                u = new Utilizador(rs.getString("email"),rs.getString("nome"),rs.getString("password"),rs.getInt("tipo"));
                res.add(u);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Utilizador.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
        return res;
    }
    
    public List<Utilizador> cliente(int tipo){
        List<Utilizador> res=new java.util.LinkedList<Utilizador>();
        Utilizador u;
        DBConnection mdb = DBConnection.instance();
        Connection cc =mdb.connect();
        if(cc!=null){   
        try {
            Statement st;
            st=cc.createStatement();
            ResultSet rs=st.executeQuery("select * from utilizador where tipo=0;");
            while(rs.next()){
                u = new Utilizador(rs.getString("email"),rs.getString("nome"),rs.getString("password"),rs.getInt("tipo"));
                res.add(u);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Utilizador.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
        return res;
    }
    
}
