/******************************************************************
postimagen.java
Autor: Diego Morales
Última modificación: 28/09/2021

Modelo de jugador para uso del Controlador.
******************************************************************/
public class postimagen extends postmultimedia{
    private int resolucion;
    private String formato; 
    public postimagen(String f, String a, String ho, String[] c, String[] h, String u, int r, int t, String form){
        super(f, a, ho, c, h, u, t); 
        resolucion=r; 
        formato=form; 

    }

    public int getResolucion(){
        return resolucion; 
    }

    public String getFormato(){
        return formato; 
    }

    public void reproducir(postaudio p){
        vista.MostrarPost(p);
    }
}