/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package matriz;

/**
 *
 * @author jjask
 */
public class Matriz_ex8 {
  public static void main(String[] args) {
      int[] numeros = {4, 7, 2, 9, 1, 5, 3, 8, 6, 10};
        int constante = 2;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] *= constante;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
