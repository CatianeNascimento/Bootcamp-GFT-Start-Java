/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos.Aula3;

/** Exercício aula 3 de Métodos seguindo o mesmo exemplo do exercício de aula 2, 
 * porém utilizando o return. 
 *
 * @author Catiane
 */
public class Quadrilatero {

    public static double area(double lado) {
        return lado * lado;
    }

    public static double area(double lado1, double lado2) {
        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {
        return (((baseMaior * baseMenor) * altura) / 2);
    }
}
