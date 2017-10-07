/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplovetor;

/**
 *
 * @author Leonardo
 */
public class ExemploVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] idade;
        idade = new int[5];
        idade [0] = 21;
        idade [1] = 18;
        idade [2] = 30;
        idade [3] = 41;
        idade [4] = 22;
        for (int i = 0; i < idade.length; i++) {
            System.out.printf("Elemento %d - idade %d \n", i, idade[i]);
            
        }

    }
    
}
