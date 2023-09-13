/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_8_area_triangulo;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_8_AREA__TRIANGULO {

   
    public static void main(String[] args) {
        // TODO code application logic here
        double altura;
        double base;
        double area;
        Scanner cap = new Scanner(System.in);
        
        System.out.println("Introduce la base del triángulo:");
        base = cap.nextDouble();
        System.out.println("Introduce la altura del triángulo:");
        altura = cap.nextDouble();
        area = (base * altura) / 2;
        System.out.println("El resultado del area:" + area);
    }
    
}
