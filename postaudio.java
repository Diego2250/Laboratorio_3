/******************************************************************
postaudio.java
Autor: Diego Morales
Última modificación: 02/11/2021

Modelo de postaudio para uso del Controlador.
******************************************************************/
public class postaudio extends postmultimedia{
    private int samplerate;
    private int bitdepth; 
    /*Costructor de clase*/
    public postaudio(String f, String a, String ho, String[] c, String[] h, String u, int t, int sr, int bd){
        super(f, a, ho, c, h, u, t); 
        samplerate=sr; 
        bitdepth=bd; 
    }

    /*Metodo para devolver el valor de samplerate
      @return valor de samplerate
      */
    public int getsamplerate(){
        return samplerate; 
    }

    /*Metodo para devolver el valor de Bitdepth
      @return valor de Bitdepth
      */
    public int getBitdepth(){
        return bitdepth; 
    }

    /*Metodo para mostrar el post
    @param post
    */
    public void reproducir(postaudio p){
        vista.MostrarPost(p);
    }
}