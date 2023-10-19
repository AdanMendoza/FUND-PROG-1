/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_12_carreras;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_12_CARRERAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String carrera;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce las siglas de tu carrera");
        carrera = input.nextLine();
        
        switch(carrera){
            case "ISC":
                System.out.println("Ingenieria en sistemas computacionales");
                break;
            case "INF":
                System.out.println("Ingenieria en informática");
                break;
            case "IND":
                System.out.println("Ingenieria industrial");
                break;
            case "IDI":
                System.out.println("Ingenieria en diseño industrial");
                break;
            case "LA":
                System.out.println("Licenciatura en administración");
                break;
            case "IGE":
                System.out.println("Ingenieria en gestion empresarial");
                break;
            case "ARQ":
                System.out.println("Arquitectura");
                break;
            default:
                System.out.println("Siglas no válidas");
        }
    }
    
}
