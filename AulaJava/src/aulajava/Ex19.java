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
public class Ex19 {
    public static void main(String[] args) {
   
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();
            
            System.out.print("Digite a altura (em metros): ");
            double altura = scanner.nextDouble();
            
            System.out.print("Digite o sexo (M para masculino, F para feminino): ");
            char sexo = scanner.next().charAt(0);
            
            double pesoIdeal;
            
            switch (sexo) {
                case 'M', 'm' -> pesoIdeal = (72.7 * altura) - 58;
                case 'F', 'f' -> pesoIdeal = (62.1 * altura) - 44.7;
                default -> {
                    // Caso o sexo informado não seja válido
                    System.out.println("Sexo inválido! Por favor, insira 'M' para masculino ou 'F' para feminino.");
                    scanner.close();
                    return;
                }
            }
            
            System.out.printf("%s, seu peso ideal é: %.2f kg\n", nome, pesoIdeal);
        }
    }
}
