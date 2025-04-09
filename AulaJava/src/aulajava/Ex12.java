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
public class Ex12 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a idade em anos: ");
            int anos = scanner.nextInt();
            
            System.out.print("Digite a idade em meses: ");
            int meses = scanner.nextInt();
            
            System.out.print("Digite a idade em dias: ");
            int dias = scanner.nextInt();
            
            System.out.println("Idade: " + anos + " anos, " + meses + " meses e " + dias + " dias.");
        }
    }
}
