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
public class Triangulo {
   float base;
   float altura;
   float area;
   //métodos
   public void calcularArea() {
       area = (base * altura) /2;
       
   }
   public void imprimir() {
       System.out.println("Base do Triângulo: " +base);
       System.out.println("Altura do Triângulo: " +altura);
       System.out.println("Area do Triângulo: " +area);
   }
}
