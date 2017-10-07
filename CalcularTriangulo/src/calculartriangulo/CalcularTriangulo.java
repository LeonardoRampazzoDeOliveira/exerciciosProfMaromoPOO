/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculartriangulo;

/**
 *
 * @author Leonardo
 */
public class CalcularTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo T1 = new Triangulo();
        T1.base = 24;
        T1.altura = 32;
        T1.calcularArea();
        T1.imprimir();
        
        Triangulo  T2 = new Triangulo();
        T2.base = 5;
        T2.altura = 10;
        T2.calcularArea();
        T2.imprimir();
        
        Triangulo TheBest = new Triangulo();
        TheBest.base = 24;
        TheBest.altura = 24;
        TheBest.calcularArea();
        TheBest.imprimir();
    }
    
}
