/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.lnarvaezr.a03.p2;
import java.util.Scanner;
/**
 *
 * @author Vianey_Narváez
 */
public class SPP2LNarvaezRA03P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Calcula la hipotenusa de los catetos");
        double co, ca, hip;
        
    System.out.println("Introduce cateto opuesto");
    co = teclado.nextDouble();
    System.out.println("Introduce cateto adyacente");
    ca = teclado.nextDouble();
    
    hip = Math.sqrt(Math.pow(ca, 2)+ Math.pow(co,2));
    
    System.out.println("La hipotenusa es "+hip);
    
    }
    
}
