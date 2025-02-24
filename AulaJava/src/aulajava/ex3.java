/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulajava;

/**
 *
 * @author CAMARGO
 */
 /**
     * @param args the command line arguments
     */
   
        // TODO code application logic here

public class ex3 {
    public static void main(String[] args) {
        
    String nomedovendedor = "JOãozinfuralata";
    float salariofixo = 2000;
    float vendas = 5000;
    float porcentagem_comissao = 0.15f;
    float comissao = vendas + porcentagem_comissao;
    float salariofinal = comissao + salariofixo;
    System.out.println(nomedovendedor + " recebe como salario fixo " + salariofixo + " e no final do mes recebe " + salariofinal);
}
    
}
