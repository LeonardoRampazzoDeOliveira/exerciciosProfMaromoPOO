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
public class Funcionario {
     int idFunc;
     String nomeFunc;
     String departamento;
     String dataContratacao;
     double salario;
     String documento;
     boolean ativo;
     
     public double atualizaSalario (double salario) {
         this.salario += salario;
         return 0;
     }
     
     public void demiteFuncionario() {
         ativo = false;
         System.out.println("O funcionario foi demitido");
     }
     
     public void imprimir() {
         System.out.println("Id: " +idFunc);
         System.out.println("Nome: " +nomeFunc);
         System.out.println("Departamento: " +departamento);
         System.out.println("Data de Admissão: " +dataContratacao);
         System.out.println("Salário: " +salario);
         System.out.println("Documento: " +documento);
         System.out.println(ativo);
                 
     }
     
}
