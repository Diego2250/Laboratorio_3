/******************************************************************
posttexto.java
Autor: Diego Morales
Última modificación: 02/11/2021

Modelo de posttexto para uso del Controlador.
******************************************************************/
public class posttexto extends post{
    private String texto; 
    /*Costructor de clase*/
    public posttexto(String f, String a, String ho, String[] c, String[] h, String t){
        super(f, a, ho, c, h);
        texto=t; 
    }

    /*Metodo para devolver el valor de texto
      @return valor de texto
      */
    public String getTexto(){
        return texto; 
    }

        /*Metodo para mostrar el post
    @param post
    */
    public void mostrar(posttexto p){
        vista.MostrarPost(p);
    }
}