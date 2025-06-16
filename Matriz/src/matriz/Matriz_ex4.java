/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package matriz;

/**
 *
 * @author jjask
 */
public class Matriz_ex4 {

    public class Ex4 {
    public static void main(String[] args) {
    int[] numeros = {4, 7, 2, 9, 1, 5, 3, 8, 6, 10};
        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
    }
}
}
}
