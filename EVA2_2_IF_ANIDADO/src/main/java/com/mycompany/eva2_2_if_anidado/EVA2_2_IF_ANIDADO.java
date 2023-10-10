/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_2_if_anidado;

import java.util.Scanner;

/**
 *
 * @author ADRIANA ROMERO
 */
public class EVA2_2_IF_ANIDADO {

    public static void main(String[] args) {
    int Valor1, Valor2;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Valor 1: ");
    Valor1 = input.nextInt();
    System.out.println("Valor 2: ");
    Valor2 = input.nextInt();
    
    if(Valor1>Valor2)//VERDAD
        System.out.println("El valor más grande es: "+Valor1); //concatenar
    else{//falso, el valor no es más grande que el valor 1
        //if anidado: un if dentro de otro if
        //en java: =es asignación, ==es comparación
        if(Valor1 == Valor2)//VERDAD
            System.out.println("Ambos valores son iguales");
        else
            System.out.println("El valor más pequeño es: "+Valor1);
    
    }
    
    }
}
