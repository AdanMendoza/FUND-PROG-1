/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_10_califas_eua;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_10_CALIFAS_EUA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la calificación");
        califa = input.nextInt();
        
        if((califa > 89) && (califa < 101))
            System.out.println("A");
        else if((califa > 79) && (califa < 91))
            System.out.println("B");
        else if((califa > 69) && (califa < 81))
            System.out.println("C");
        else if((califa > 59) && (califa < 71))
            System.out.println("D");
        else if((califa >= 0) && (califa < 61))
            System.out.println("F");
        
            
            
            
        
    }
    
}
