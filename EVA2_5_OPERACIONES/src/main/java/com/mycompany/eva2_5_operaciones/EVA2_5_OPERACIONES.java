/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_5_operaciones;

/**
 *
 * @author ADAN MENDOZA
 */
public class EVA2_5_OPERACIONES {

    public static void main(String[] args) {
     int var1, var2, resu;
     
     var1 = 100;
     var2 = 200;
     
     //operador + 
     //suma
     //concatenar --> unir cadenas de texto
     
     resu = var1 + var2;
     System.out.println(); //salto de linea
     System.out.println("SUMA");
     System.out.println("var1 = " + var1);
     System.out.println("var2 = " + var2);
     System.out.println("var1 + var2 = " + resu);
     
     //resta
     resu = var1 - var2;
     System.out.println(); //salto de linea
     System.out.println("RESTA: ");
     System.out.println("var1 = " + var1);
     System.err.println("var2 = " + var2);
     System.out.println("var1 - var2 = " + resu);
     
     //multipicación
     resu = var1 * var2;
     System.out.println();
     System.out.println("MULTIPLICACIÓN");
     System.out.println("var1 = " + var1);
     System.out.println("var2 = " + var2);
     System.out.println("var1 * var2 = " + resu);
     
     //división
     var1 = 15;
     var2 = 7;
     resu = var1 / var2;
     System.out.println();
     System.out.println("DIVISIÓN");
     System.out.println("var1 = " + var1);
     System.out.println("var2 = " + var2);
     System.out.println("var1 / var2 = " + resu);
     
     
    //división flotante
    double resuExacto;
    resuExacto = var1 / var2;
    System.out.println();
    System.out.println("var1 = " + var1);
    System.out.println("var2 = " + var2);
    System.out.println("var1 / var2 = " + resuExacto);
    
    double var2F = 7;
    resuExacto = var1 / var2F;
    System.out.println();
    System.out.println("DIVISIÓN EXACTA (¿SERÁ?: ");
    System.out.println("var1 = " + var1);
    System.out.println("var2 = " + var2);
    System.out.println("var1 / var2 = " + resuExacto);
    
    int cifra = 7;
    double cifraDouble = 7.0;
    
    int division = 100 / 10; //se toma el divisor como entero
    //double division = 100 / 10.0 //se toma como divisior flotante
    
    //procedencia de operaciones:
    int a = 5, b = 3, c = 2;
    int resultado = (a * b) + (a - c) * (b -a);//(15)+(3)*(-2)// 15-6
    System.out.println("RESULTADO PRECEDENCIA: " + resultado);
    
    //potencias y raices:
    double potencia;
    potencia = Math.pow(100, 2);
    System.out.println("POTENCIA = " + potencia);
     


    }
}
