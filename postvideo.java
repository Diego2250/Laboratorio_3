/******************************************************************
postvideo.java
Autor: Diego Morales
Última modificación: 28/09/2021

Modelo de jugador para uso del Controlador.
******************************************************************/
public class postvideo extends postmultimedia{
    private int framerate;
    public postvideo(int f){
        super(u, r, t); 
        framerate=f; 
    }

    public int getFramerate(){
        return framerate; 
    }

    public void reproducir(postvideo p){
        vista.ReproducirVideo(p);
    }
}