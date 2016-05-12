/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les.dr.dao;

public class Utilizador {
    private String _email;
    private String _name;
    private String _password;
    private int _tipo;
    
    public Utilizador(){}
    public Utilizador(String e){_email=e;}
    public Utilizador(String e, String n, String p, int t){
        _email=e;
        _name=n;
        _password=p;
        _tipo=t;
    
    }

    /**
     * @return the _email
     */
    public String getEmail() {
        return _email;
    }

    /**
     * @param _email the _email to set
     */
    public void setEmail(String _email) {
        this._email = _email;
    }

    /**
     * @return the _name
     */
    public String getName() {
        return _name;
    }

    /**
     * @param _name the _name to set
     */
    public void setName(String _name) {
        this._name = _name;
    }

    /**
     * @return the _password
     */
    public String getPassword() {
        return _password;
    }

    /**
     * @param _password the _password to set
     */
    public void setPassword(String _password) {
        this._password = _password;
    }

    /**
     * @return the _tipo
     */
    public int getTipo() {
        return _tipo;
    }

    /**
     * @param _tipo the _tipo to set
     */
    public void setTipo(int _tipo) {
        this._tipo = _tipo;
    }
    
}
