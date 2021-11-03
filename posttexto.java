/******************************************************************
posttexto.java
Autor: Diego Morales
Última modificación: 28/09/2021

Modelo de jugador para uso del Controlador.
******************************************************************/
public class posttexto extends post{
    private String texto; 
    public posttexto(String t){
        super(f, a, ho, c, h);
        texto=t; 
    }

    public String getTexto(){
        return texto; 
    }

    public void mostrar(posttexto p){
        vista.MostrarPostEmoji(p);
    }
}