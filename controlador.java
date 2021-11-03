/***************************************************
Controlador.java
Autor: Diego Morales
Fecha: 28/09/2021

Driver program. Instancia la vista y el modelo,
y los comunica de acuerdo con las elecciones del
usuario.
***************************************************/
import java.util.Random;
import java.util.ArrayList;
public class Controlador{
	public static void main(String[] args){
        vista v = new vista();
        int opcion = 0;
        v.bienvenida();
        while (opcion != 5){
            opcion = v.menuOpciones();
			switch(opcion){
                case 1:
                break; 
                case 2:
                break;
                case 3:
                break;
                case 4:
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