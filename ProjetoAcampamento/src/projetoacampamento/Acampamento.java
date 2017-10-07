/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoacampamento;

/**
 *
 * @author Leonardo
 */
public class Acampamento {
    String nome; 
    char equipe;
    int idade;
    
    public void imprimir(){
        System.out.println("Nome:" +nome);
        System.out.println("Equipe:" +equipe);
        System.out.println("Idade: " +idade);
    }
    public void separarGrupo(){
        if (idade >=6 && idade <= 10) 
        {
            equipe = 'A';
        }
        if (idade >= 11 && idade <= 20) {
            equipe = 'B';
            }
        if (idade >= 21) {
            equipe = 'C';
            
        }
        if (idade <6) {
            System.out.println("Idade Inválida");
        }
    
}
}