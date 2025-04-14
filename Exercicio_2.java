/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ExercicioAulaJava_5;

import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class Exercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner Read = new Scanner(System.in);
        String[] Name = new String[4]; // Declarando o array de Strings com 4 elementos
        
        // Lê 4 nomes do usuário
        for(int i = 0; i < Name.length; i++) {
            System.out.print("Digite o nome " + (i+1) + ": ");
            Name[i] = Read.nextLine(); 
        }
        
        // Exibe os nomes armazenados no array
        System.out.println("\nNomes armazenados:");
        for(int i = 0; i < Name.length; i++) {
            System.out.println(Name[i]);
        }
        
        Read.close(); // Fecha o Scanner
    }
}
