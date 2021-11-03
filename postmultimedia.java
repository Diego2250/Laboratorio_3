/******************************************************************
postmultimedia.java
Autor: Diego Morales
Última modificación: 28/09/2021

Modelo de jugador para uso del Controlador.
******************************************************************/
public class postmultimedia extends post{
    protected String url; 
    protected int tamano; 
    public postmultimedia(String f, String a, String ho, String[] c, String[] h, String u, int t){
        super(f, a, ho, c, h);
        url=u; 
        tamano=t; 
    }

    public String getUrl(){
        return url; 
    }

    public int getTamano(){
        return tamano; 
    }
}