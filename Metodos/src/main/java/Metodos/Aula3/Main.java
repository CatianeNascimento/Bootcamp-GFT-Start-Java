/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos.Aula3;

/** Classe principal do exercício da aula 3 de métodos. 
 *
 * @author Catiane
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("** Exercícios de Quadriláteros **");
        
        double areaQuadrado = Quadrilatero.area(5);
        System.out.println("Área quadrado: " + areaQuadrado);
        
        double areaRetangulo = Quadrilatero.area(2, 3);
        System.out.println("Área retângulo: " + areaRetangulo);
        
        double areaTrapezio = Quadrilatero.area(8, 2, 6);
        System.out.println("Área trapézio: " + areaTrapezio);
    }
    
}
