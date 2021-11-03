/******************************************************************
postimagen.java
Autor: Diego Morales
Última modificación: 02/11/2021

Modelo de postimagen para uso del Controlador.
******************************************************************/
public class postimagen extends postmultimedia{
    private int resolucion;
    private String formato; 
    /*Costructor de clase*/
    public postimagen(String f, String a, String ho, String[] c, String[] h, String u, int r, int t, String form){
        super(f, a, ho, c, h, u, t); 
        resolucion=r; 
        formato=form; 

    }

    /*Metodo para devolver el valor de resolucion
      @return valor de resolucion
      */
    public int getResolucion(){
        return resolucion; 
    }

    /*Metodo para devolver el valor de formato
      @return valor de formato
      */
    public String getFormato(){
        return formato; 
    }

    /*Metodo para mostrar el post
    @param post
    */
    public void reproducir(postaudio p){
        vista.MostrarPost(p);
    }
}