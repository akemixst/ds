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
public class Ex8 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a distância da viagem (em km): ");
            double distancia = scanner.nextDouble();
            
            System.out.print("Digite o consumo do carro (em km/l): ");
            double consumo = scanner.nextDouble();
            
            System.out.print("Digite o preço do combustível (em R$/litro): ");
            double precoCombustivel = scanner.nextDouble();
            
            
            double litrosNecessarios = distancia / consumo;
            
            
            double custoTotal = litrosNecessarios * precoCombustivel;
            
            
            System.out.printf("Serão necessários %.2f litros de combustível.%n", litrosNecessarios);
            System.out.printf("O custo estimado com combustível é: R$ %.2f%n", custoTotal);
        }
    }
}
