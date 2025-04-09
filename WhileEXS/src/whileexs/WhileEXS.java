/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whileexs;

/**
 *
 * @author jjask
 */
import java.util.Scanner;

public class WhileEXS {

   public static void main(String[] args) {
        int numero = 1; 
        
        System.out.println("Números ímpares de 1 a 100:");
        
        while (numero <= 100) {
           
            if (numero % 2 != 0) {
                System.out.print(numero + " ");
            }
            numero++;
        }
    }
}