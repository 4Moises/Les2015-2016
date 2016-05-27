/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les.dr.dao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
/**
 *
 * @author rodma
 */
public class Alerta {
    private int _id_alerta;
    private String _nome;
    private String _descricao;
    private String _emaill;
    private Date _data;
    private String _nota;
    private String _assunto;
    private int _estado;
    private int _on;
    private String _email;
    
    DateFormat format = new SimpleDateFormat("yyyy/MM/dd");

    /**
     * @return the on
     */
//    public Oest getOn() {
//        return on;
//    }
//
//    /**
//     * @param on the on to set
//     */
//    public void setOn(Oest on) {
//        this.on = on;
//    }
//
//    /**
//     * @return the est
//     */
//    public Estado getEst() {
//        return est;
//    }
//
//    /**
//     * @param est the est to set
//     */
//    public void setEst(Estado est) {
//        this.est = est;
//    }
// 
//    public enum Oest{
//        on("on"),off("off");
//        public String state;
//        Oest(String s){
//            state=s;
//        }
//    }
//    
//    private Oest on; 
//    
//    public enum Estado{
//        ativo("on"),desativo("off");
//        public String estad;
//        Estado(String e){
//            estad=e;
//        }    
//    }
//    
//    private Estado est;
    
    public Alerta(){}
    public Alerta(int i){_id_alerta=i;}
    public Alerta(int i, String n, String el, String d, int et, String dt, String nt, int o, String a, String e){
        _id_alerta=i; _nome=n; _descricao=d; _emaill=el; _data=dt; _nota=nt; _assunto=a; _email=e; _estado=et; _on=o;
    }
    

    /**
     * @return the _id_alerta
     */
    public int getId_alerta() {
        return _id_alerta;
    }

    /**
     * @param _id_alerta the _id_alerta to set
     */
    public void setId_alerta(int _id_alerta) {
        this._id_alerta = _id_alerta;
    }

    /**
     * @return the _nome
     */
    public String getNome() {
        return _nome;
    }

    /**
     * @param _nome the _nome to set
     */
    public void setNome(String _nome) {
        this._nome = _nome;
    }

    /**
     * @return the _descricao
     */
    public String getDescricao() {
        return _descricao;
    }

    /**
     * @param _descricao the _descricao to set
     */
    public void setDescricao(String _descricao) {
        this._descricao = _descricao;
    }

    /**
     * @return the _emaill
     */
    public String getEmaill() {
        return _emaill;
    }

    /**
     * @param _emaill the _emaill to set
     */
    public void setEmaill(String _emaill) {
        this._emaill = _emaill;
    }

    /**
     * @return the _data
     */
    public String getData() {
        return _data;
    }

    /**
     * @param _data the _data to set
     */
    public void setData(String _data) {
        this._data = _data;
    }

    /**
     * @return the _nota
     */
    public String getNota() {
        return _nota;
    }

    /**
     * @param _nota the _nota to set
     */
    public void setNota(String _nota) {
        this._nota = _nota;
    }

    /**
     * @return the _assunto
     */
    public String getAssunto() {
        return _assunto;
    }

    /**
     * @param _assunto the _assunto to set
     */
    public void setAssunto(String _assunto) {
        this._assunto = _assunto;
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
     * @return the estado
     */
    public int getEstado() {
        return _estado;
    }

    /**
     * @param _estado the estado to set
     */
    public void setEstado(int _estado) {
        this._estado = _estado;
    }

    /**
     * @return the on
     */
    public int getOn() {
        return _on;
    }

    /**
     * @param _on the on to set
     */
    public void setOn(int _on) {
        this._on = _on;
    }
    
    
}
