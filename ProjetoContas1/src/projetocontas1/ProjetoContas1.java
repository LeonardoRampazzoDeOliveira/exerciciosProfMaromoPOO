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
public class ProjetoContas1 {


    public static void main(String[] args) {
        ContasCorrente conta1 = new ContasCorrente();
        conta1.agencia = 33;
        conta1.nome = "Charles";
        conta1.saldo = 5000;
        conta1.setConta(41);
        ContasCorrente.CPMF = 0.040;
        
        conta1.efetuarDeposito(1000000);
        conta1.imprimir();
      
    }
    
}
