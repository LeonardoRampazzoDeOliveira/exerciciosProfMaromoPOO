/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularesfera;

/**
 *
 * @author Leonardo
 */
public class Esfera {
    //Atributos
    double raio;
    double area;
    //Métodos
    public void calcularArea(){
        System.out.println("Calculando a área da esfera... ");
        area = 3.1416 * (raio * raio);
    }
    public void imprimir(){
        System.out.println("A área da esfera é: " +area);
    }
}
