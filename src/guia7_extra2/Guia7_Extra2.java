package guia7_extra2;

import Entidades.Puntos;
import Servicios.ServicioPuntos;

public class Guia7_Extra2 {
    
    public static void main(String[] args) {
    ServicioPuntos sP = new ServicioPuntos();
        Puntos nPunto = sP.crearPuntos();
        sP.mostrar(nPunto);
        
    }
    
}
