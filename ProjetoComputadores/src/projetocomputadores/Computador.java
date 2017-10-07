/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocomputadores;

/**
 *
 * @author Leonardo
 */
public class Computador {
    public String marca;
    public String cor;
    public String modelo;
    public long numeroSerie;
    public double preco;
    
    public void imprimir() {
        System.out.println("Marca: " +marca);
        System.out.println("Cor: " +cor);
        System.out.println("Modelo: " +modelo);
        System.out.println("Número de Série: " +numeroSerie);
        System.out.println("Preço: " +preco);
    }
    public void calcularValor() {
        if ("HP".equals(marca)) {
            preco += preco * 0.30;
            System.out.println("Novo preço: " +preco);
            
            }
        if ("IBM".equals(marca)) {
            preco += preco * 0.50;
        }
        
    }
    public int alterarValor(double valor) {
        if (valor > 0) {
        this.preco = valor;
        return 1;
        }else{
            return 0;
        }
        
        
        
    }
    
}
