/******************************************************************
postmultimedia.java
Autor: Diego Morales
Última modificación: 02/11/2021

Modelo de postmultimedia para uso del Controlador.
******************************************************************/
public class postmultimedia extends post{
    protected String url; 
    protected int tamano; 
    /*Costructor de clase*/
    public postmultimedia(String f, String a, String ho, String[] c, String[] h, String u, int t){
        super(f, a, ho, c, h);
        url=u; 
        tamano=t; 
    }

    /*Metodo para devolver el valor de Url
      @return valor de Url
      */
    public String getUrl(){
        return url; 
    }

    /*Metodo para devolver el valor de Tamano
      @return valor de Tamano
      */
    public int getTamano(){
        return tamano; 
    }
}