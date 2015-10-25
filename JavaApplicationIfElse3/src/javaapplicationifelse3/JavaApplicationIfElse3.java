/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationifelse3;

/**
 *
 * @author domiciosilva
 */
public class JavaApplicationIfElse3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* int idade = 25;

      if (idade < 20) {
         System.out.println("idade é menor que 20");
         } else if (idade >= 70) {
         System.out.println("idade é maior que 70");
         } else if (idade >= 30 && idade < 70) {
         System.out.println("idade é maio e ou igual a 30 e menor 70");
         } else if (idade >= 20 && idade < 30) {
         System.out.println("idade é maior ou igual a 20 e menor que 30");
        int idade = 23;*/
        int idade = 23;
        
        if (idade < 20 || idade >= 41){ 
            System.out.println("idade é menor que 20 ou e maoir ou igual a 41");
        } else {
            System.out.println("idade é maior ou igual a 20 e menor que 41");
        }

    }

}