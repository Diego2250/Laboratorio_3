/******************************************************************
postemoji.java
Autor: Diego Morales
Última modificación: 28/09/2021

Modelo de jugador para uso del Controlador.
******************************************************************/
public class postemoji extends post{
    private String emoji; 
    public postemoji(String e){
        super(f, a, ho, c, h);
        emoji=e; 
    }

    public String getEmoji(){
        return emoji; 
    }

    public void mostrar(postemoji p){
        vista.MostrarPostEmoji(p);
    }
}