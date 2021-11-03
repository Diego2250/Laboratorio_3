/******************************************************************
postmultimedia.java
Autor: Diego Morales
Última modificación: 28/09/2021

Modelo de jugador para uso del Controlador.
******************************************************************/
public class postmultimedia extends post{
    protected String url; 
    protected int resolucion; 
    protected int tamano; 
    public postmultimedia(String u, int r, int t){
        super(f, a, ho, c, h);
        url=u; 
        resolucion=r; 
        tamano=t; 
    }

    public String getUrl(){
        return url; 
    }

    public String getResolucion(){
        return resolucion; 
    }

    public String getTamano(){
        return tamano; 
    }
}