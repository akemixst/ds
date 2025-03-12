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
public class Exe6 {
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a distância da viagem (em km): ");
        int distancia = scanner.nextInt();

        System.out.print("Digite o consumo médio do carro (em km/l): ");
        int consumoMedio = scanner.nextInt();

        System.out.print("Digite o preço do combustível (em R$/litro): ");
        int precoCombustivel = scanner.nextInt();

    
        int custoTotal = (distancia / consumoMedio) * precoCombustivel;


        System.out.println("O custo estimado com combustível é: R$ " + custoTotal);

        scanner.close();
    }
}

