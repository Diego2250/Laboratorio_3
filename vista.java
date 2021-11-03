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
					"1. Ver todos los post\n" +
					"2. Comentar un post\n" +
					"3. Publicar un post\n" +
                    "4. Dar like a un post\n" +
					"5. Salir\n";

		System.out.println(s);
		op = scan.nextInt();
	}catch (Exception e){
				error();
				scan.next();
		}
		return op;
	}
	
    /*Metodo para pedir datos del post
	@return Datos del post
	*/
	public String[] pedirdatospost(){
		String[] resultado={"","",""};
		try{
		System.out.println("Por favor ingrese el autor del post (Primer Nombre): ");
		resultado[0] = scan.next();
		System.out.println("Por favor ingrese la fecha de publicacion del post (DIA/MES/AÑO): ");
		resultado[1] = scan.next();
		System.out.println("Por favor ingrese la hora de publicacion del post  (HORA/MINUTOS): ");
		resultado[2]= scan.next();
	}
	catch (Exception e){
		e.printStackTrace();
	}
	return resultado;
	}

     /*Metodo para pedir datos del post
	@return Datos del post
	*/
	public String[] pedirhashtags(){
        String[] resultado={"","","",""};
		try{
        int hashtags;    
        String s = "¿Cuantos hashtags desea agregar al post?\n" +
        "1\n" +
        "2\n" +
        "3\n" +
        "4\n";
		System.out.println(s);
		hashtags = scan.nextInt();
        switch(hashtags){
            case 1:
            System.out.println("Por favor ingrese primer hashtag del post (No olvide el simbolo numeral #): ");
		    resultado[0] = scan.next();
            break; 
            case 2:
            System.out.println("Por favor ingrese primer hashtag del post (No olvide el simbolo numeral #): ");
		    resultado[0] = scan.next();
            System.out.println("Por favor ingrese segundo hashtag del post (No olvide el simbolo numeral #): ");
		    resultado[1] = scan.next();
            break; 
            case 3:
            System.out.println("Por favor ingrese primer hashtag del post (No olvide el simbolo numeral #): ");
		    resultado[0] = scan.next();
            System.out.println("Por favor ingrese segundo hashtag del post (No olvide el simbolo numeral #): ");
		    resultado[1] = scan.next();
            System.out.println("Por favor ingrese tercer hashtag del post (No olvide el simbolo numeral #): ");
		    resultado[2] = scan.next();
            break; 
            case 4:
            System.out.println("Por favor ingrese primer hashtag del post (No olvide el simbolo numeral #): ");
		    resultado[0] = scan.next();
            System.out.println("Por favor ingrese segundo hashtag del post (No olvide el simbolo numeral #): ");
		    resultado[1] = scan.next();
            System.out.println("Por favor ingrese tercer hashtag del post (No olvide el simbolo numeral #): ");
		    resultado[2] = scan.next();
            System.out.println("Por favor ingrese cuarto hashtag del post (No olvide el simbolo numeral #): ");
		    resultado[3] = scan.next();
            break;
            default:
            System.out.println("Has elegido una opción inválida.");
            break;
        }    
	}
	catch (Exception e){
		e.printStackTrace();
	}
	return resultado;
	}

     /*Metodo para pedir datos del post
	@return Datos del post
	*/
	public int pedirtipopost(){
		int tipo=0;
				try{
			String s = "Elija el tipo de post\n" +
					"1. Post de texto\n" +
					"2. Post de emoji\n" +
					"3. Post de video\n" +
                    "4. Post de imagen\n" +
					"5. Post de audio\n";

		System.out.println(s);
		tipo = scan.nextInt();
	}
	catch (Exception e){
		e.printStackTrace();
	}
	return tipo;
	}


        /*Metodo para pedir el texto
	@return texto
	*/
	public String pedirdatostexto(){
		String resultado="";
		try{
		System.out.println("Por favor ingrese el texto que quiere publicar: ");
		resultado = scan.next();
	}
	catch (Exception e){
		e.printStackTrace();
	}
	return resultado;
	}

            /*Metodo para pedir el emoji
	@return emoji
	*/
	public String pedirdatosemoji(){
		String resultado="";
		try{
		System.out.println("Por favor ingrese el emoji que quiere publicar: ");
		resultado = scan.next();
	}
	catch (Exception e){
		e.printStackTrace();
	}
	return resultado;
	}

            /*Metodo para pedir el texto
	@return texto
	*/
	public String pedirurl(){
		String resultado="";
		try{
		System.out.println("Por favor ingrese el url del archivo multimedia: ");
		resultado = scan.next();
	}
	catch (Exception e){
		e.printStackTrace();
	}
	return resultado;
	}

            /*Metodo para pedir el texto
	@return texto
	*/
	public int[] pedirDatosVideo(){
		int[] resultado={0, 0};
		try{
		System.out.println("Por favor ingrese el tamaño en KB del archivo multimedia: ");
		resultado[0] = scan.nextInt();
        System.out.println("Por favor ingrese el FrameRate en FPS del archivo multimedia: ");
		resultado[1] = scan.nextInt();
	}
	catch (Exception e){
		e.printStackTrace();
	}
	return resultado;
	}

            /*Metodo para pedir el datos de la imagen
	@return datos de imagen
	*/
	public int[] pedirDatosimagen(){
		int[] resultado={0, 0};
		try{
		System.out.println("Por favor ingrese el tamaño en KB del archivo multimedia: ");
		resultado[0] = scan.nextInt();
        System.out.println("Por favor ingrese los megapixeles del archivo multimedia: ");
		resultado[1] = scan.nextInt();
	}
	catch (Exception e){
		e.printStackTrace();
	}
	return resultado;
	}

    /*Metodo para pedir el datos de la imagen
	@return datos de imagen
	*/
	public int[] pedirDatosaudio(){
		int[] resultado={0, 0, 0};
		try{
		System.out.println("Por favor ingrese el tamaño en KB del archivo multimedia: ");
		resultado[0] = scan.nextInt();
        System.out.println("Por favor ingrese el SampleRate del archivo multimedia: ");
		resultado[1] = scan.nextInt();
        System.out.println("Por favor ingrese el BitDepth del archivo multimedia: ");
		resultado[2] = scan.nextInt();
	}
	catch (Exception e){
		e.printStackTrace();
	}
	return resultado;
	}

    /*Metodo para pedir el texto
	@return texto
	*/
	public String pedirDatosVideoString(){
		String resultado="";
		try{
		System.out.println("Por favor ingrese formato del archivo multimedia: ");
		resultado = scan.next();
	}
	catch (Exception e){
		e.printStackTrace();
	}
	return resultado;
	}

               /*Metodo para pedir el texto
	@return texto
	*/
	public String[] pedircomentario(){
		String[] resultado={""};
		try{
		System.out.println("Por favor ingrese su comentario: ");
		resultado[0] = scan.next();
	}
	catch (Exception e){
		e.printStackTrace();
	}
	return resultado;
	}

    /*Metodo para mostrar post de emoji
	*/
	public void MostrarPost(postemoji p){
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
	public void MostrarPost(posttexto p){
        int likes=p.getLikes(); 
        String autor=p.getAutor(); 
        String fecha=p.getFecha(); 
        String hora=p.getHora(); 
        String texto=p.getTexto(); 
        String[] comentarios=p.getComentarios(); 
        String[] hashtags=p.gethashtags(); 
		System.out.println(autor+" "+fecha+" "+hora+" Likes: "+likes);
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
	public void MostrarPost(postvideo p){
        int likes=p.getLikes(); 
        String autor=p.getAutor(); 
        String fecha=p.getFecha(); 
        String hora=p.getHora(); 
        String url=p.getUrl(); 
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
        System.out.println("(Video) "+url); 
        System.out.println(tamano+" KB, "+"FrameRate: "+framerate+" fps"); 
        System.out.println("---> comentarios: ");
        for(int i=0; i<comentarios.length; i++){
            if(comentarios[i]!=""){
                System.out.println(comentarios[i]); 
            }
        }
	}

    	 /*Metodo para mostrar post de emoji
	*/
	public void MostrarPost(postaudio p){
        int likes=p.getLikes(); 
        String autor=p.getAutor(); 
        String fecha=p.getFecha(); 
        String hora=p.getHora(); 
        String url=p.getUrl(); 
		int tamano=p.getTamano();
		int samplerate=p.getsamplerate();  
        int bitdepth=p.getBitdepth(); 
        String[] comentarios=p.getComentarios(); 
        String[] hashtags=p.gethashtags(); 
		System.out.println(autor+""+fecha+""+hora+" Likes: "+likes);
        for(int i=0; i<hashtags.length; i++){
            if(hashtags[i]!=""){
                System.out.println(hashtags[i]); 
            }
        }
        System.out.println("(Audio) "+url); 
        System.out.println(tamano+" KB, "+"SampleRate: "+samplerate+" kHz, "+"BitDepth: "+bitdepth); 
        System.out.println("---> comentarios: ");
        for(int i=0; i<comentarios.length; i++){
            if(comentarios[i]!=""){
                System.out.println(comentarios[i]); 
            }
        }
	}

        	 /*Metodo para mostrar post de emoji
	*/
	public void MostrarPost(postimagen p){
        int likes=p.getLikes(); 
        String autor=p.getAutor(); 
        String fecha=p.getFecha(); 
        String hora=p.getHora(); 
        String url=p.getUrl(); 
		int tamano=p.getTamano();
        String formato=p.getFormato(); 
        int resolucion=p.getResolucion(); 
        String[] comentarios=p.getComentarios(); 
        String[] hashtags=p.gethashtags(); 
		System.out.println(autor+""+fecha+""+hora+" Likes: "+likes);
        for(int i=0; i<hashtags.length; i++){
            if(hashtags[i]!=""){
                System.out.println(hashtags[i]); 
            }
        }
        System.out.println("(Imagen) "+url); 
        System.out.println(tamano+" KB, "+"Fotmato: "+formato+" Resolucion: "+resolucion); 
        System.out.println("---> comentarios: ");
        for(int i=0; i<comentarios.length; i++){
            if(comentarios[i]!=""){
                System.out.println(comentarios[i]); 
            }
        }
	}

    /*Metodo para mostrar mensaje
	*/
	public String pedirComentario(){
		System.out.println("Ingrese el comentario que desea añadir al post");
        scan.nextLine(); 
        String comentario=scan.nextLine(); 
        return comentario; 
	}

    /*Metodo para mostrar mensaje
	*/
	public int pedirNumeroPost(){
        int n=0; 
        try {
            System.out.println("Ingrese el numero del post");
            n=scan.nextInt(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return n; 
	}


	/*Metodo para mostrar mensaje de despedida al usuario
	*/
	public void despedida(){
		System.out.println("Gracias por usar este programa, adios");
	}
	/*Metodo para mostrar mensaje de bienvenida al usuario
	*/
	public void bienvenida(){
		System.out.println("¡Bienvendio(a) a QueOndaMano!");
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
	public void postAnadido(){
		System.out.println("Se ha publicado el post");
	}

	/*Metodo para mostrar mensaje
	*/
  public void error(){
    System.out.println("Ha ocurrido un error");
  }
}
