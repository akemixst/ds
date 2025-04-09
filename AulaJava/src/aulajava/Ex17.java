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
public class Ex17 {
     public static void main(String[] args) {
         try (Scanner scanner = new Scanner(System.in)) {
             System.out.print("Digite o custo de fábrica do carro: ");
             double custoFabrica = scanner.nextDouble();
             
             double custoDistribuidor = custoFabrica * 28 / 100;
             double custoImpostos = custoFabrica * 45 / 100;
             
             double custoFinal = custoFabrica + custoDistribuidor + custoImpostos;
             
             System.out.printf("O custo final ao consumidor é: R$ %.2f%n", custoFinal);
         }
    }
}
