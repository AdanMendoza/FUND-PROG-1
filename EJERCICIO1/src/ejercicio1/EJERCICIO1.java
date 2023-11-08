/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EJERCICIO1 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      int nume1, nume2;
      Scanner input = new Scanner(System.in);
      System.out.println("Introduce el primer número");
      nume1 = input.nextInt();
      System.out.println("Introduce el segundo número");
      nume2 = input.nextInt();
      
     for (int i = nume1; i <= nume2; i++) {
        System.out.println(i);
        System.out.println("-");
      }
      
   }
   
}
