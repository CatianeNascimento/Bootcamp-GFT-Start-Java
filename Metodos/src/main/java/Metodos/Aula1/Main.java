/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos.Aula1;

/** Classe principal dos exercícios da Aula 1 de Métodos.
 *
 * @author Catiane
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Calculadora 
        System.out.println("** Exercício Calculadora ** ");
        Calculadora.soma(7, 8); 
        Calculadora.subtracao(9, 3);
        Calculadora.multuplicacao(8, 7);
        Calculadora.divisao(10, 2);   
        
        //Mensagem
        System.out.println("**Exercício Mensagem **");
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(24);
        
        //Empréstimo
        System.out.println("** Exercício Emprestimo **");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
       
}
