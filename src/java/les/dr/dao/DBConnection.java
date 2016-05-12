/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les.dr.dao;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
    private static DBConnection _con=null;
    private static Connection _cc=null;
    private String _constring="jdbc:mysql://192.168.217.137:3306/les";
    private String _login="les";
    private String _passwd="les123";
    private DBConnection(){}
    public static DBConnection instance(){
        if(_con==null){
            _con = new DBConnection();
          
        }
        return _con;
    }
    public Connection connect(){
         try {
            if(_cc==null || _cc.isClosed()){
       
                    Class.forName("com.mysql.jdbc.Driver");
                     _cc = DriverManager.getConnection(_constring, _login, _passwd);
             
            }
          
        } catch (ClassNotFoundException ex) {
            _cc=null;
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
         catch (SQLException ex) {
             _cc=null;
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return _cc;
    }
    public boolean disconect(){
        boolean res = false;
        try {
            _cc.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    return true;
        
    }
    
    
}
