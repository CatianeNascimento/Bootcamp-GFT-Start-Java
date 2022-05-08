/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos.Aula2;

/** Exercício aula 2 de Métodos utilizando a sobrecarga. 
 *
 * @author Catiane
 */
public class Quadrilatero {

    public static void area(double lado) {
        System.out.println("Área do quadrado " + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("Área do retângulo " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Área do Trapézio " + ((baseMaior * baseMenor) * altura) / 2);
    }
}
