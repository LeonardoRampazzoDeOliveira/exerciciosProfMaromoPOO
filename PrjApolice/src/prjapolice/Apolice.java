/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjapolice;

/**
 *
 * @author Leonardo
 */
public class Apolice {
    private String nomeSegurado;
    private int idade;
    private float valorPremio;

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(float valorPremio) {
        this.valorPremio = valorPremio;
    }
    public void imprimir(){
        System.out.println("Nome: " +nomeSegurado);
        System.out.println("Idade: " +idade);
        System.out.println("Valor do Prêmio: " +valorPremio);
    }
    
}
