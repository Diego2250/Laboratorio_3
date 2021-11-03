/******************************************************************
post.java
Autor: Diego Morales
Última modificación: 28/09/2021

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

    public int getLikes(){
        return likes; 
    }

    public String[] getComentarios(){
        return comentarios; 
    }

    public String getFecha(){
        return fecha; 
    }

    public String getAutor(){
        return autor; 
    }

    public String getHora(){
        return hora; 
    }

    public String[] gethashtags(){
        return hashtags; 
    }

    public void darLike(){
        likes=likes+1; 
    }

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