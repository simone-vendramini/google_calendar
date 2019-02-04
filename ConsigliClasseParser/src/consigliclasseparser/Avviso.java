/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consigliclasseparser;

/**
 *
 * @author LENOVO
 */
public class Avviso {
    private String URL;
    private String testoURL;
    private String tipo;
    private String data;

    public Avviso() {
        URL = "";
        testoURL = "";
        tipo = "";
        data = "";
    }

    public Avviso(String URL, String testoURL, String tipo, String data) {
        this.URL = URL;
        this.testoURL = testoURL;
        this.tipo = tipo;
        this.data = data;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getTestoURL() {
        return testoURL;
    }

    public void setTestoURL(String testoURL) {
        this.testoURL = testoURL;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public String toString() {
        return "["+tipo+"], ["+ data +"], [" + URL + "], [" + testoURL + "]" ;
    }
}
