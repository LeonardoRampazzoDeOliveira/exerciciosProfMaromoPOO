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
public class PrjApolice {

    
    public static void main(String[] args) {
        Apolice apolice = new Apolice();
        apolice.setNomeSegurado("Onofre");
        apolice.setIdade(80);
        apolice.setValorPremio(4000);
        apolice.imprimir();
    }
    
}
