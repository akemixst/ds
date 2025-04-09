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
public class Ex18 {
    public static void main(String[] args) {
   
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número de carros vendidos: ");
            int numCarrosVendidos = scanner.nextInt();
            
            System.out.print("Digite o valor total das vendas: R$ ");
            double valorTotalVendas = scanner.nextDouble();
            
            System.out.print("Digite o salário fixo do vendedor: R$ ");
            double salarioFixo = scanner.nextDouble();
            
            System.out.print("Digite o valor da comissão por carro vendido: R$ ");
            double comissaoPorCarro = scanner.nextDouble();
            
            double comissaoTotal = numCarrosVendidos * comissaoPorCarro;
            double comissaoPorVendas = 0.05 * valorTotalVendas; // 5% do valor total das vendas
            double salarioFinal = salarioFixo + comissaoTotal + comissaoPorVendas;
            
            System.out.printf("O salário final do vendedor é: R$ %.2f\n", salarioFinal);
        }
    }
}
