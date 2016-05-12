/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les.dr.dao;

/**
 *
 * @author Utilizador
 */
public class Notificacao {
     private int _id_notificacao;
    private String _discricao;
    private String _link;
    private String _serie;
    private String _data;

    public Notificacao(){}
    public Notificacao(int n){_id_notificacao=n;}
    public Notificacao(int n, String d, String l, String s,String dt){
        _id_notificacao=n;
        _discricao=d;
        _link=l;
        _serie=s;
        _data =dt;
    }
    /**
     * @return the _id_notificacao
     */
    public int getId_notificacao() {
        return _id_notificacao;
    }

    /**
     * @param _id_notificacao the _id_notificacao to set
     */
    public void setId_notificacao(int _id_notificacao) {
        this._id_notificacao = _id_notificacao;
    }

    /**
     * @return the _discricao
     */
    public String getDiscricao() {
        return _discricao;
    }

    /**
     * @param _discricao the _discricao to set
     */
    public void setDiscricao(String _discricao) {
        this._discricao = _discricao;
    }

    /**
     * @return the _link
     */
    public String getLink() {
        return _link;
    }

    /**
     * @param _link the _link to set
     */
    public void setLink(String _link) {
        this._link = _link;
    }

    /**
     * @return the _serie
     */
    public String getSerie() {
        return _serie;
    }

    /**
     * @param _serie the _serie to set
     */
    public void setSerie(String _serie) {
        this._serie = _serie;
    }

    /**
     * @return the data
     */
    public String getData() {
        return _data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this._data = _data;
    }
    

    
}
