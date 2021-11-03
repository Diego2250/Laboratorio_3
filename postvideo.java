/******************************************************************
postvideo.java
Autor: Diego Morales
Última modificación: 02/11/2021

Modelo de postvideo para uso del Controlador.
******************************************************************/
public class postvideo extends postmultimedia{
    private int framerate;
    /*Costructor de clase*/
    public postvideo(String f, String a, String ho, String[] c, String[] h, String u, int t, int fr){
        super(f, a, ho, c, h, u, t); 
        framerate=fr; 
    }

    /*Metodo para devolver el valor de Framerate
      @return valor de Framerate
      */
    public int getFramerate(){
        return framerate; 
    }

    /*Metodo para mostrar el post
    @param post
    */
    public void reproducir(postvideo p){
        vista.MostrarPost(p);
    }
}