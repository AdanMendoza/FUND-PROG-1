/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_examen;

/**
 *
 * @author ADRIANA ROMERO
 */
public class EVA1_EXAMEN {
private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    double Fahrenheit;
    double Centígrados;
    double Kelvin;
    
    double M3agua;
    double Flujoagua;
    double Cantdeflujo;
    
    double Res1;
    double Res2;
    double Res3;
    double Res4;
    double Res5;
    double Volt;
    double Intens;
    double IntensRes;
    
    double Distancia;
    double Velocidad;
    double Angulo;
    double Gravedad;
    double Altura;
    
    double Velinicial;
    double Velangularf;
    double Tiempor;
    double Radiorueda;
    double Distangular;
    double Distm;
    double Velangularp;
    double Velms;
    double Acangularp;
    double Acms;
    double Frecgiro;
    
    double Pendiente;
    double Área;
    double Valorx1;
    double Valorx2;
    double Valory1;
    double Valory2;
    double Ax1;
    double Ax2;
    
    double centrofoco;
    double vértice1;
    double vértice2;
    double Centrox;
    double Centroy;
    double Div1;
    double Div2;
     
          
    
    System.out.println("Equipo: TACL Dynamics");
    System.out.println("Proyecto: Tic Tae Toe");
    System.out.println("Integrantes: Adan Efraín Mendoza Romero, David Antonio Ramos Mata, Ezequiel Leonardo Aguilar LLanes, Carlos Sebastián Castillo Nuñez");
    System.out.println("Hola usuario, calcularemos la temperatura en grados centígrados y grados Kelvin");
    System.out.println("Introduzca la temperatura en grados Fahrenheit");
    Fahrenheit = input.nextdouble();
    
    System.out.println("La temperatura en centígrados es:");
    Centígrados = (Fahrenheit - 32)* 5/9;
    System.out.println(Centígrados);
    
    System.out.println("La temperatura en grados Kelvin es:");
    Kelvin = (double)5/9 * (Fahrenheit - 32) + 273.15;
    System.out.println(Kelvin);
    
    System.out.println("Ahora calcuraremos el flujo en m3 de agua que pasa por una tubería");
    System.out.println("Introudzca el radio de la tuberia");
    M3agua = input.nextdouble();
    System.out.println("Introduzca la velocidad del flujo del agua en m/s");
    Flujoagua = input.nextdouble();
    Cantdeflujo = (M3agua*2)*Flujoagua;
    System.out.println("La cantidad en m3 de agua que fluye es:");
    System.out.println(Cantdeflujo);
    
    System.out.println("Ahora calcularemos los datos de un circuito eléctrico en paralelo tomando en cuenta 5 resistencias ");
    System.out.println("Introduzca el valor de la resistencia 1");
    Res1 = input.nextdouble();
    System.out.println("Introduzca el valor de la resistencia 2");
    Res2 = input.nextdouble();
    System.out.println("Introduzca el valor de la resistencia 3");
    Res3 = input.nextdouble();
    System.out.println("Introduzca el valor de la resistencia 4");
    Res4 = input.nextdouble();
    System.out.println("Introduzca el valor de la resistencia 5");
    Res5 = input.nextdouble();
    
    System.out.println("Introduzca el voltaje");
    Volt = input.nextdouble();
    System.out.println("La resistencia equivalente es:");
    Volt = Res1+Res2+Res3+Res4+Res5;
    System.out.println(Volt);
    System.out.println("La intensidad de la corriente es:");
    Intens = Res1+Res2+Res3+Res4+Res5;
    System.out.println(Intens);
    System.out.println("La intensidad de corriente en cada resistencia es:");
    IntensRes = Intens/5;
    System.out.println(IntensRes);
    
    
    System.out.println("Ahora calcularemos a qué distencia caeráun objeto disparado por un cañon, el cual tiene un angulo de 45°");
    System.out.println("Introduzca la velocidad a la que se disparó el objeto en m/s");
    Velocidad = input.nextdouble();
    Angulo = 45;
    Gravedad = 9.8;
    Distancia = Math.pow(Velocidad,(double) 2) * Math.sin(2 * Angulo)/ Gravedad;
    Altura = Math.pow(Velocidad, (double) 2) * Math.pow(Math.sin(Angulo), (double)2) / 2 * Gravedad;
    System.out.println("La altura máxima es:");
    System.out.println(Altura);
    System.out.println("La distancia máxima es:");
    System.out.println(Distancia);
    
    
    System.out.println("Ahora lo que haremos será trabajar con el movimiento angular de una rueda");
    System.out.println("Introduzca el valor de la velocidad inicial angular(radianes/s)");
    Velinicial = input.nextdouble();
    System.out.println("Introduzca el valor de la velocidad angular final (radianes/s)");
    Velangularf = input.nextdouble();
    System.out.println("Introduzca el valor del tiempo de rotación(en segundos)");
    Tiempor = input.nextdouble();
    System.out.println("Introduzca el valor del radio de la rueda(en metros)");
    Radiorueda = input.nextdouble();
    
    Distangular = (Velinicial + Velangularf)/ Radiorueda;
    Distm = (Velinicial + Velangularf)* Tiempor;
    Velangularp = (Velangularf - Velinicial)/2;
    Velms = (Velangularf - Velinicial)/2;
    Acangularp = (Velangularf - Velinicial)/ Tiempor;
    Acms = (Velangularf - Velinicial)/ Tiempor;
    Frecgiro = Velinicial / (2*3.14);
    
    System.out.println("La distancia angular recorrida es:");
    System.out.println(Distangular);
    System.out.println("La distancia en metros recorrida es:");
    System.out.println(Distm);
    System.out.println("La velocidad promedio recorrida es:");
    System.out.println(Velangularp);
    System.out.println("La velocidad en m/s promedio recorrida es:");
    System.out.println(Velms);
    System.out.println("La acelración angular es:");
    System.out.println(Acangularp);
    System.out.println("La aceleración en m/s2 es:");
    System.out.println(Acms);
    System.out.println("La frecuencia de giro (en Hertz)es:");
    System.out.println(Frecgiro);
    
    
    System.out.println("Ahora se trabajará en conocer la pendiente en cualquier valor de x y el área entre dos valores de x");
    System.out.println("Dada la fórmula y=x2, se quiere conocer la pendiente en cualquier valor de x");
    System.out.println("Introduzca el primer valor de x");
    Valorx1 = input.nextdouble();
    System.out.println("Introduzca el primer valor de y");
    Valory1 = input.nextdouble();
    System.out.println("Introduzca el segundo valor de x");
    Valorx2 = input.nextdouble();
    System.out.println("Introduzca el segundo valor de y");
    Valory2 = input.nextdouble();
    
    System.out.println("Ahora para calcular el área entre dos valores de x, introduzca el primer valor");
    Ax1 = input.nextdouble();
    System.out.println("Introduzca el segundo valor de x");
    Ax2 = input.nextdouble();
    
    Pendiente = (Valory2 - Valory1)/(Valorx2 - Valorx1);
    Área = (Ax1*Ax1)- (Ax2*Ax2);
    System.out.println("La pendiente es:");
    System.out.println(Pendiente);
    System.out.println("El área entre los valores es:");
    System.out.println(Área);
    
    
    System.out.println("Ahora vamos a utilizar una ecuación canónica de la hiperbole para conocer la distancia del centro al foco y las coordenadas de los focos y los vértices");
    System.out.println("Introduzca la coordenada de x en el centro");
    Centrox = input.nextdouble();
    System.out.println("Introduzca la coordenada de y en el centro");
    Centroy = input.nextdouble();
    System.out.println("Introduzca el primer divisor");
    Div1 = input.nextdouble();
    System.out.println("Introduzca el valor del segundo divisor");
    Div2 = input.nextdouble();
    
    
    
    
    
            
    
    
    
    
    
    
    
            
            
            
        
    }
}
