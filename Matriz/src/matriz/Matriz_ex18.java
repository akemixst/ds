/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package matriz;

/**
 *
 * @author jjask
 */
public class Matriz_ex18 {
 public static void main(String[] args) {
         int[] numeros = {8, 11, 12, 14, 19, 21, 22, 23, 33, 34, 39, 44, 54, 56, 65, 67, 78, 82, 89, 90};
        int chave = 44;  
        
        int inicio = 0;
        int fim = numeros.length - 1;
        int meio;
        boolean encontrado = false;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;

            if (numeros[meio] == chave) {
                System.out.println("Elemento " + chave + " encontrado na posição " + meio);
                encontrado = true;
                break;
            } else if (numeros[meio] < chave) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        if (!encontrado) {
            System.out.println("Elemento " + chave + " não encontrado.");
        }
        }
}
