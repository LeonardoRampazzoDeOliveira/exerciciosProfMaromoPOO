/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocontas1;

/**
 *
 * @author Leonardo
 */
public class ContasCorrente {
    private int conta;
    public int agencia;
    public double saldo;
    public String nome;
    public static double CPMF;
    
    public int getConta(){
        return conta;
    }
    public void setConta(int conta){
        this.conta = conta;
    }
    
    
    public void efetuarSaque(double valor){
        this.saldo -= valor;
    }
    public void efetuarDeposito(double valor){
        this.saldo = this.saldo + valor;
    }
    
    public void imprimir() {
        System.out.println("Conta: " +conta);
        System.out.println("Agencia: " +agencia);
        System.out.println("saldo: " +saldo);
        System.out.println("Nome: " +nome);
        System.out.println("CPMF" +CPMF);
    }
    
}
