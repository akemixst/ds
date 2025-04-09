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
public class Ex14 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número total de eleitores: ");
            int totalEleitores = scanner.nextInt();
            
            System.out.print("Digite o número de votos brancos: ");
            int votosBrancos = scanner.nextInt();
            
            System.out.print("Digite o número de votos nulos: ");
            int votosNulos = scanner.nextInt();
            
            System.out.print("Digite o número de votos válidos: ");
            int votosValidos = scanner.nextInt();
            
            double percentualBrancos = (double) votosBrancos / totalEleitores * 100;
            double percentualNulos = (double) votosNulos / totalEleitores * 100;
            double percentualValidos = (double) votosValidos / totalEleitores * 100;
            
            System.out.printf("Percentual de votos brancos: %.2f%%\n", percentualBrancos);
            System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualNulos);
            System.out.printf("Percentual de votos válidos: %.2f%%\n", percentualValidos);
        }
    }
}
