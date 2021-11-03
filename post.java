/******************************************************************
post.java
Autor: Diego Morales
Última modificación: 02/11/2021

Modelo de post para uso del Controlador.
******************************************************************/
public class post{
    protected int likes=0; 
    protected String fecha, autor, hora; 
    protected String[] comentarios={"", "", "", "", "", "", "", "", "", ""}; 
    protected String[] hashtags={"", "","", ""}; 
    vista vista = new vista();
    
    /*Costructor de clase*/
    public post(String f, String a, String ho, String[] c, String[] h){
        fecha=f; 
        autor=a; 
        comentarios=c; 
        hashtags=h; 
        hora=ho; 
    }

     /*Metodo para devolver el valor de likes
      @return valor de likes
      */
    public int getLikes(){
        return likes; 
    }

     /*Metodo para devolver el valor de comentarios
      @return valor de comentarios
      */
    public String[] getComentarios(){
        return comentarios; 
    }

     /*Metodo para devolver el valor de fecha
      @return valor de fecha
      */
    public String getFecha(){
        return fecha; 
    }

     /*Metodo para devolver el valor de autor
      @return valor de autor
      */
    public String getAutor(){
        return autor; 
    }

     /*Metodo para devolver el valor de hora
      @return valor de hora
      */
    public String getHora(){
        return hora; 
    }

     /*Metodo para devolver el valor de hashtags
      @return valor de hashtags
      */
    public String[] gethashtags(){
        return hashtags; 
    }

    /*Metodo para cambiar el valor de likes
    */
    public void darLike(){
        likes=likes+1; 
    }

    /*Metodo para comentar el post
    @param comentario 
    */
    public void comentar(String comentario){
        for (int i=0; i<comentarios.length; i++){
            if(comentarios[i]==""){
                comentarios[i]=comentario; 
                vista.ComentarioAnadido();
                System.out.println(comentarios[i]);
                break;
            }else{
                System.out.println("que pedo");
            }
        }
    }
    
}