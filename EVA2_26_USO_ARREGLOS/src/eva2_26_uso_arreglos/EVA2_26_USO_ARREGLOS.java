/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_26_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_26_USO_ARREGLOS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      String[] platillos = new String[10];
      platillos[0] = "Tacos";
      platillos[1] = "Tortas de lomo";
      platillos[2] = "Hamburguesa";
      platillos[3] = "Tamales";
      platillos[4] = "Tripitas";
      platillos[5] = "Tacos de carne asada";
      platillos[6] = "Sopa de mariscos";
      platillos[7] = "Sopes";
      platillos[8] = "Chilaquiles";
      platillos[9] = "T-bone";
      double[] precio = {20, 50, 60, 20, 80, 100, 250, 90, 200, 500};
      
      System.out.println("--------MENÚ--------");
      for (int i = 0; i < platillos.length; i++) {
         System.out.println("-" + platillos[i] + ": $" + precio[i]);
      }
      int opc, cant;
      Scanner input = new Scanner(System.in);
      System.out.println("¿Qué quieres ordenar?");
      opc = input.nextInt();
      System.out.println("¿Cuántas órdenes quieres?");
      cant = input.nextInt();
      System.out.println("El costo de tu pedido es: $" + (cant * precio[opc]));
   }
   
}
