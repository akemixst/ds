/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulajava;

/**
 *
 * @author jjask
 */
import java.util.Scanner;
public class Ex11 {
     public static void main(String[] args) {
         try (Scanner scanner = new Scanner(System.in)) {
             System.out.print("Digite um valor: ");
             int valor = scanner.nextInt();
             
             int antecessor = valor - 1;
             
             System.out.println("O antecessor de " + valor + " é: " + antecessor);
         }
    }
}
