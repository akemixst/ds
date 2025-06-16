/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package matriz;

/**
 *
 * @author jjask
 */
public class Matriz_ex22 {
 public static void main(String[] args) {
          int[] numeros = {23, 56, 12, 8, 34, 65, 89, 14, 44, 78, 33, 22, 11, 19, 90, 67, 54, 21, 39, 82, 17, 4, 26, 51, 60, 73, 88, 49, 30, 27};
        Arrays.sort(numeros);
        int meio = numeros.length / 2;
        double mediana;
        if (numeros.length % 2 == 0) {
            mediana = (numeros[meio - 1] + numeros[meio]) / 2.0;
        } else {
            mediana = numeros[meio];
        }
        System.out.println("Mediana: " + mediana);
        }
}

