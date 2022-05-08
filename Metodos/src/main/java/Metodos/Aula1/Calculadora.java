/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos.Aula1;

/** Exercício da aula 1 de Métodos: Calcule as 4 operações básicas: soma, subtração,
 * multiplicação e divisão. Sempre 2 valores tem que ser passados.
 *
 * @author Catiane
 */
public class Calculadora {
    
    public static void soma(double numero1, double numero2) {
        
        double resultado = numero1 + numero2;
        
        System.out.println("A soma de " + numero1 + " mais " + numero2 + " é "
        + resultado);
    }
    
    public static void subtracao(double numero1, double numero2) {
        
        double resultado = numero1 - numero2; 
        
        System.out.println("A subtração de " + numero1 + " menos " + numero2 
        + " é " + resultado);
    }
    
    public static void multuplicacao(double numero1,double numero2) {
        
        double resultado = numero1 * numero2;
        
        System.out.println("A multiplicação de " + numero1 + " vezes " + numero2
        + " é " + resultado);
    }
    
    public static void divisao(double numero1, double numero2) {
        
        double resultado = numero1 / numero2;
        
        System.out.println("A divisão de " + numero1 + " divido por " + numero2
       + " é " +  resultado);
    }
}
