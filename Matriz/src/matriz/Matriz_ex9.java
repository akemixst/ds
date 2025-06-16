/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package matriz;

/**
 *
 * @author jjask
 */
public class Matriz_ex9 {
public static void main(String[] args) {
     int[] numeros = {4, 7, 2, 9, 1, 5, 3, 8, 6, 10};
        int valorEspecifico = 5;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > valorEspecifico) {
                System.out.println(numeros[i]);
            }
    }
}
}
