/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4;
import java.util.Scanner;
/**
 *
 * @author labcca
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double Dolar = 17.16;
        double Euro = 18.30;
       
        Scanner practica = new Scanner (System.in);
        System.out.println("Ingresa cantidad ");
        int pesos = practica.nextInt();
        
        double dolares = ( pesos / 17.16);
       
        
        double euros = (pesos / 18.30);
       
       practica.close();
       
        System.out.println("pesos a dolares: " + dolares);
        System.out.println("pesos a euros: " + euros);
       
        
        
        
        
    }
    
}
