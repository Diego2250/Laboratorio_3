/******************************************************************
postaudio.java
Autor: Diego Morales
Última modificación: 28/09/2021

Modelo de jugador para uso del Controlador.
******************************************************************/
public class postaudio extends postmultimedia{
    private int samplerate;
    private int bitdepth; 
    public postaudio(String f, String a, String ho, String[] c, String[] h, String u, int t, int sr, int bd){
        super(f, a, ho, c, h, u, t); 
        samplerate=sr; 
        bitdepth=bd; 
    }

    public int getsamplerate(){
        return samplerate; 
    }

    public int getBitdepth(){
        return bitdepth; 
    }

    public void reproducir(postaudio p){
        vista.MostrarPost(p);
    }
}