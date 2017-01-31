/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.rreyesct01.p02;
import java.util.Scanner;
/**
 *
 * @author roxana
 */
public class SPP2RreyesCT01P02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner (System.in);
        double base;
        double altu;
        double per;
        double sup;
        
        
       
        System.out.println("Ingresa los datos");
        System.out.println("Base del rectangulo");
        base=keyboard.nextDouble();
        System.out.println("Altura del rectangulo");
        altu= keyboard.nextDouble();  
        
        System.out.println("");
        per= 2*base + 2*altu;
        System.out.println("Perimetro del rectangulo= "+ per);
        sup= base*altu;
        System.out.println("Superficie del rectangulo="+ sup);
    
    
    }
    
    
}
