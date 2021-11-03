/******************************************************************
postemoji.java
Autor: Diego Morales
Última modificación: 02/11/2021

Modelo de postemoji para uso del Controlador.
******************************************************************/
public class postemoji extends post{
    private String emoji; 
    /*Costructor de clase*/
    public postemoji(String f, String a, String ho, String[] c, String[] h, String e){
        super(f, a, ho, c, h);
        emoji=e; 
    }

    /*Metodo para devolver el valor de Emoji
      @return valor de Emoji
      */
    public String getEmoji(){
        return emoji; 
    }

    /*Metodo para mostrar el post
    @param post
    */
    public void mostrar(postemoji p){
        vista.MostrarPost(p);
    }
}