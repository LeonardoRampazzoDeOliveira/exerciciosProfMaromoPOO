/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao.exercicio1;

/**
 *
 * @author Leonardo
 */
public class RevisaoExercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario func = new Funcionario();
        func.nomeFunc = "Gary";
        func.dataContratacao = "22 de Janeiro de 1996";
        func.departamento = "RH";
        func.documento = "656574xhkl";
        func.salario = 5000;
        func.idFunc = 234;
        func.ativo = true;
        func.atualizaSalario(20000);
        func.imprimir();
        
    }
    
}
