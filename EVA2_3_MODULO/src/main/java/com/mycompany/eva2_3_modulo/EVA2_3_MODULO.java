/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_modulo;

import java.util.Scanner;

/**
 *
 * @author ADRIANA ROMERO
 */
public class EVA2_3_MODULO {

    public static void main(String[] args) {
    int Valor, residuo;
    Scanner input = new Scanner(System.in);
    System.out.println("Introduce el valor");
    Valor = input.nextInt();
    
    residuo = Valor % 2;
    if(residuo == 0)//el valor es par
        System.out.println("El valor es par");
    else
        System.out.println("El valor es impar");
    }
}
