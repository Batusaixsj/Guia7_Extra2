
package Servicios;

import Entidades.Puntos;
import java.util.Scanner;


public class ServicioPuntos {
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
   
   public Puntos crearPuntos(){
   Puntos nPuntos = new Puntos();
       System.out.println("Ingrese coordenadas del Primer punto");
       System.out.print("X: ");
       nPuntos.setX1(leer.nextInt());
       System.out.print("Y: ");
       nPuntos.setY1(leer.nextInt());
       System.out.println("Ingrese coordenadas del Segundo punto");
       System.out.print("X: ");
       nPuntos.setX2(leer.nextInt());
       System.out.print("Y: ");
       nPuntos.setY2(leer.nextInt());
       
   return nPuntos;
   }
    
   private double calcular (Puntos punto){
       double resultado;
       resultado = Math.sqrt(Math.pow((punto.getX2()-punto.getX1()), 2)+Math.pow((punto.getY2()-punto.getY1()), 2));
        return resultado;
   }
   
   public void mostrar(Puntos punto){
       System.out.println("La distancia entre los dos puntos es: "+calcular(punto));
   
   }
    
    
}
