/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author ADAN MENDOZA
 */
public class EJERCICIO3 {

    public static void main(String[] args) {
    int num;
    Scanner input = new Scanner(System.in);
        System.out.println("Introduce el número deseado");
        num = input.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("La sumatoria desde 1 hasta " + num + " es: " + sum);
    }
}
