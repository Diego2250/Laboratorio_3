/***************************************************
Controlador.java
Autor: Diego Morales
Fecha: 02/11/2021

Driver program. Instancia la vista y el modelo,
y los comunica de acuerdo con las elecciones del
usuario.
***************************************************/
import java.util.ArrayList;

public class controlador{
	public static void main(String[] args){
        vista v = new vista();
        ArrayList<posttexto> poststexto=new ArrayList<posttexto>(); 
        ArrayList<postemoji> postsemoji=new ArrayList<postemoji>(); 
        ArrayList<postaudio> postsaudio=new ArrayList<postaudio>(); 
        ArrayList<postimagen> postsimagen=new ArrayList<postimagen>(); 
        ArrayList<postvideo> postsvideo=new ArrayList<postvideo>(); 
        int opcion = 0;
        int tipo_post=0; 
        int numeropost=0; 
        String autor=""; 
        String fecha="";
        String  hora="";
        String comentario=""; 
        String[] hashtags; 
        String[] comentarios={"", "", "", "", "", "", "", "", "", ""}; 
        String url; 
        v.bienvenida();
        while (opcion != 5){
            opcion = v.menuOpciones();
			switch(opcion){
                case 1:
                for(int i=0; i<poststexto.size();i++){
                    v.MostrarPost(poststexto.get(i));
                }
                for(int i=0; i<postsemoji.size();i++){
                    v.MostrarPost(postsemoji.get(i));
                }
                for(int i=0; i<postsimagen.size();i++){
                    v.MostrarPost(postsimagen.get(i));
                }
                for(int i=0; i<postsaudio.size();i++){
                    v.MostrarPost(postsaudio.get(i));
                }
                for(int i=0; i<postsvideo.size();i++){
                    v.MostrarPost(postsvideo.get(i));
                }
                break; 
                case 2:
                tipo_post=v.pedirtipopost(); 
                switch(tipo_post){
                    case 1:
                    for(int i=0; i<poststexto.size();i++){
                        v.MostrarPost(poststexto.get(i));
                    }
                    numeropost=v.pedirNumeroPost(); 
                    comentario=v.pedirComentario();
                    poststexto.get(numeropost-1).comentar(comentario);
                    break;  
                    case 2:
                    for(int i=0; i<postsemoji.size();i++){
                        v.MostrarPost(postsemoji.get(i));
                    }
                    numeropost=v.pedirNumeroPost(); 
                    comentario=v.pedirComentario();
                    postsemoji.get(numeropost-1).comentar(comentario);
                    break; 
                    case 3:
                    for(int i=0; i<postsvideo.size();i++){
                        v.MostrarPost(postsvideo.get(i));
                    }
                    numeropost=v.pedirNumeroPost(); 
                    comentario=v.pedirComentario();
                    postsvideo.get(numeropost-1).comentar(comentario);
                    break; 
                    case 4:
                    for(int i=0; i<postsimagen.size();i++){
                        v.MostrarPost(postsimagen.get(i));
                    }
                    numeropost=v.pedirNumeroPost(); 
                    comentario=v.pedirComentario();
                    postsimagen.get(numeropost-1).comentar(comentario);
                    break; 
                    case 5:
                    for(int i=0; i<postsaudio.size();i++){
                        v.MostrarPost(postsaudio.get(i));
                    }
                    numeropost=v.pedirNumeroPost(); 
                    comentario=v.pedirComentario();
                    postsaudio.get(numeropost-1).comentar(comentario);
                    break; 
                }
                break;
                case 3:
                tipo_post=v.pedirtipopost(); 
                switch(tipo_post){
                    case 1: 
                    String[] datostexto=v.pedirdatospost(); 
                    autor=datostexto[0];
                    fecha=datostexto[1];
                    hora=datostexto[2];
                    String texto="";
                    texto=v.pedirdatostexto(); 
                    hashtags=v.pedirhashtags(); 
                    poststexto.add(new posttexto(fecha, autor, hora, comentarios, hashtags, texto));
                    v.postAnadido();
                    break; 
                    case 2: 
                    String[] datosemoji=v.pedirdatospost(); 
                    autor=datosemoji[0];
                    fecha=datosemoji[1];
                    hora=datosemoji[2];
                    String emoji=v.pedirdatosemoji(); 
                    hashtags=v.pedirhashtags(); 
                    postsemoji.add(new postemoji(fecha, autor, hora, comentarios, hashtags, emoji));
                    v.postAnadido();
                    break; 
                    case 3: 
                    String[] datosvideo=v.pedirdatospost(); 
                    autor=datosvideo[0];
                    fecha=datosvideo[1];
                    hora=datosvideo[2];
                    url=v.pedirurl(); 
                    hashtags=v.pedirhashtags(); 
                    int[] InfoVideo=v.pedirDatosVideo();
                    int tamanovideo=InfoVideo[0];
                    int framerate=InfoVideo[1]; 
                    postsvideo.add(new postvideo(fecha, autor, hora, comentarios, hashtags, url, tamanovideo, framerate));
                    v.postAnadido();
                    break; 
                    case 4: 
                    String[] datosimagen=v.pedirdatospost(); 
                    autor=datosimagen[0];
                    fecha=datosimagen[1];
                    hora=datosimagen[2];
                    url=v.pedirurl(); 
                    hashtags=v.pedirhashtags(); 
                    String formato=v.pedirDatosVideoString(); 
                    int[] InfoImagen=v.pedirDatosimagen(); 
                    int tamanoimagen=InfoImagen[0];
                    int megapx=InfoImagen[1];
                    postsimagen.add(new postimagen(fecha, autor, hora, comentarios, hashtags, url, megapx, tamanoimagen, formato));
                    v.postAnadido();
                    break; 
                    case 5: 
                    String[] datosaudio=v.pedirdatospost(); 
                    autor=datosaudio[0];
                    fecha=datosaudio[1];
                    hora=datosaudio[2];
                    url=v.pedirurl(); 
                    hashtags=v.pedirhashtags(); 
                    int[] InfoAudio=v.pedirDatosaudio();
                    int tamanoaudio=InfoAudio[0];
                    int SampleRate=InfoAudio[1];
                    int bitdepth=InfoAudio[2];
                    postsaudio.add(new postaudio(fecha, autor, hora, comentarios, hashtags, url, tamanoaudio, SampleRate, bitdepth));
                    v.postAnadido();
                    break; 
                    default:
				    v.opcionInvalida();
				break;
                }
                break;
                case 4:
                tipo_post=v.pedirtipopost(); 
                switch(tipo_post){
                    case 1:
                    for(int i=0; i<poststexto.size();i++){
                        v.MostrarPost(poststexto.get(i));
                    }
                    numeropost=v.pedirNumeroPost(); 
                    poststexto.get(numeropost-1).darLike(); 
                    break;  
                    case 2:
                    for(int i=0; i<postsemoji.size();i++){
                        v.MostrarPost(postsemoji.get(i));
                    }
                    numeropost=v.pedirNumeroPost(); 
                    postsemoji.get(numeropost-1).darLike();
                    break; 
                    case 3:
                    for(int i=0; i<postsvideo.size();i++){
                        v.MostrarPost(postsvideo.get(i));
                    }
                    numeropost=v.pedirNumeroPost(); 
                    postsvideo.get(numeropost-1).darLike();
                    break; 
                    case 4:
                    for(int i=0; i<postsimagen.size();i++){
                        v.MostrarPost(postsimagen.get(i));
                    }
                    numeropost=v.pedirNumeroPost();
                    postsimagen.get(numeropost-1).darLike();
                    break; 
                    case 5:
                    for(int i=0; i<postsaudio.size();i++){
                        v.MostrarPost(postsaudio.get(i));
                    }
                    numeropost=v.pedirNumeroPost(); 
                    postsaudio.get(numeropost-1).darLike();
                    break; 
                }
                break;
                case 5:
				v.despedida();
				break;
                default:
				v.opcionInvalida();
				break;
            }
        }
    }
}