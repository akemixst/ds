/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package matriz;

/**
 *
 * @author jjask
 */
public class Matriz_ex16 {
public static void main(String[] args) {
           int[] numeros = {23, 56, 12, 8, 34, 65, 89, 14, 44, 78, 33, 22, 11, 19, 90, 67, 54, 21, 39, 82};
        int chave = 44;
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == chave) {
                System.out.println("Elemento " + chave + " encontrado na posição " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Elemento " + chave + " não encontrado.");
        }
        }
}
