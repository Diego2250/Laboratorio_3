/******************************************************************
postvideo.java
Autor: Diego Morales
Última modificación: 28/09/2021

Modelo de jugador para uso del Controlador.
******************************************************************/
public class postvideo extends postmultimedia{
    private int framerate;
    public postvideo(String f, String a, String ho, String[] c, String[] h, String u, int t, int fr){
        super(f, a, ho, c, h, u, t); 
        framerate=fr; 
    }

    public int getFramerate(){
        return framerate; 
    }

    public void reproducir(postvideo p){
        vista.MostrarPost(p);
    }
}