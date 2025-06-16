/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package matriz;

/**
 *
 * @author jjask
 */
public class Matriz_ex20 {
 public static void main(String[] args) {
                       int[] numeros = {23, 56, 12, 8, 34, 65, 89, 14, 44, 78, 33, 22, 11, 19, 90, 67, 54, 21, 39, 82};
        
        int[] pares = new int[20];
        int[] impares = new int[20];
        
        int contadorPares = 0;
        int contadorImpares = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares[contadorPares++] = numeros[i];
            } else {
                impares[contadorImpares++] = numeros[i];
            }
        }

        System.out.println("Elementos pares:");
        for (int i = 0; i < contadorPares; i++) {
            System.out.println(pares[i]);
        }

        System.out.println("Elementos ímpares:");
        for (int i = 0; i < contadorImpares; i++) {
            System.out.println(impares[i]);
        }

        }
}