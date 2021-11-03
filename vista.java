/***************************************************
Vista.java
Autor: Diego Morales
Fecha: 14/10/2021

Vista. Responsable de toda interaccion con el usuario.
***************************************************/
import java.util.Scanner;
public class vista{
	private Scanner scan;

	public vista(){
		scan = new Scanner(System.in);
	}
  /*Metodo para elegír una opción
  @return número de opción
  */
	public int menuOpciones(){
		int op=0;
				try{
			String s = "¿Que deseas hacer?\n" +
					"1. Dar like a un post\n" +
					"2. Comentar un post\n" +
					"3. Publicar un post\n" +
                    "4. Ver todos los post\n" +
					"5. Salir\n";

		System.out.println(s);
		op = scan.nextInt();
	}catch (Exception e){
				error();
				scan.next();
		}
		return op;
	}
	
    /*Metodo para mostrar post de emoji
	*/
	public void MostrarPostEmoji(postemoji p){
        int likes=p.getLikes(); 
        String autor=p.getAutor(); 
        String fecha=p.getFecha(); 
        String hora=p.getHora(); 
        String emoji=p.getEmoji(); 
        String[] comentarios=p.getComentarios(); 
        String[] hashtags=p.gethashtags(); 
		System.out.println(autor+""+fecha+""+hora+" Likes: "+likes);
        for(int i=0; i<hashtags.length; i++){
            if(hashtags[i]!=""){
                System.out.println(hashtags[i]); 
            }
        }
        System.out.println("(emoji) "+emoji); 
        System.out.println("---> comentarios: ");
        for(int i=0; i<comentarios.length; i++){
            if(comentarios[i]!=""){
                System.out.println(comentarios[i]); 
            }
        } 
	}

     /*Metodo para mostrar post de emoji
	*/
	public void MostrarPostTexto(posttexto p){
        int likes=p.getLikes(); 
        String autor=p.getAutor(); 
        String fecha=p.getFecha(); 
        String hora=p.getHora(); 
        String texto=p.getTexto(); 
        String[] comentarios=p.getComentarios(); 
        String[] hashtags=p.gethashtags(); 
		System.out.println(autor+""+fecha+""+hora+" Likes: "+likes);
        for(int i=0; i<hashtags.length; i++){
            if(hashtags[i]!=""){
                System.out.println(hashtags[i]); 
            }
        }
        System.out.println("(Texto) "+texto); 
        System.out.println("---> comentarios: ");
        for(int i=0; i<comentarios.length; i++){
            if(comentarios[i]!=""){
                System.out.println(comentarios[i]); 
            }
        } 
	}

	 /*Metodo para mostrar post de emoji
	*/
	public void ReproducirVideo(postvideo p){
        int likes=p.getLikes(); 
        String autor=p.getAutor(); 
        String fecha=p.getFecha(); 
        String hora=p.getHora(); 
        String url=p.getUrl(); 
		int resolucion=p.getResolucion(); 
		int tamano=p.getTamano();
		int framerate=p.getFramerate();  
        String[] comentarios=p.getComentarios(); 
        String[] hashtags=p.gethashtags(); 
		System.out.println(autor+""+fecha+""+hora+" Likes: "+likes);
        for(int i=0; i<hashtags.length; i++){
            if(hashtags[i]!=""){
                System.out.println(hashtags[i]); 
            }
        }
        System.out.println("(Texto) "+texto); 
        System.out.println("---> comentarios: ");
        for(int i=0; i<comentarios.length; i++){
            if(comentarios[i]!=""){
                System.out.println(comentarios[i]); 
            }
        } 
	}

	/*Metodo para mostrar mensaje de despedida al usuario
	*/
	public void despedida(){
		System.out.println("Gracias por usar este programa, adios");
	}
	/*Metodo para mostrar mensaje de bienvenida al usuario
	*/
	public void bienvenida(){
		System.out.println("¡Bienvendio(a) comabtiente!");
	}

	/*Metodo para mostrar mensaje
	*/
	public void opcionInvalida(){
		System.out.println("Has elegido una opción inválida.");
	}

    /*Metodo para mostrar mensaje
	*/
	public void ComentarioAnadido(){
		System.out.println("Se ha añadido el comentario");
	}

	/*Metodo para mostrar mensaje
	*/
  public void error(){
    System.out.println("Ha ocurrido un error");
  }
}
