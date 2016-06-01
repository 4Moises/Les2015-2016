/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les.dr.dao;

import java.util.Date;

/**
 *
 * @author Joeline
 */
public class Sessao {
    private String _id_sessao;
    private String _email;   
    private Date _hora_inicio;

    Sessao(String s,  Date h, String e) {
        _id_sessao=s; 
        _email=e;
        _hora_inicio=h;
    }

    Sessao(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public String getId(){
        return _id_sessao;
    }
    
    public void setId(String _id_sessao){
        this._id_sessao = _id_sessao;
    }   
    
    
    public String getEmail(){
        return _email;
    }
    
    public void setEmail(String _emaill){
        this._email = _emaill;
    }
    
    public Date gethora_inicio(){
        return _hora_inicio;
    }
    
    public void setData(Date _hora_inicio){
        this._hora_inicio = _hora_inicio;
    }
    
    
}

    

