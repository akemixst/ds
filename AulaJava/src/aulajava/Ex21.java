/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package aulajava;

import java.util.Scanner;

/**
 *
 * @author jjask
 */
public class Ex21 {

    public static void main(String[] args) {
      
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o tipo de combustível (A para Álcool, G para Gasolina): ");
            char tipoCombustivel = scanner.next().charAt(0);
            
            System.out.print("Digite o número de litros vendidos: ");
            double litros = scanner.nextDouble();
            
            double precoPorLitro = 0.0;
            
            switch (tipoCombustivel) {
                case 'A', 'a' -> precoPorLitro = 2.90; // Preço do litro do álcool
                case 'G', 'g' -> precoPorLitro = 3.30; // Preço do litro da gasolina
                default -> {
                    System.out.println("Tipo de combustível inválido!");
                    scanner.close();
                    return;
                }
            }
            
            double valorTotal = litros * precoPorLitro;
            
            System.out.printf("Valor a ser pago: R$ %.2f\n", valorTotal);
        }
    }
}
