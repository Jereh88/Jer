/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act3jereh;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Act3jereh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
       
       double celsius;
       double fahrenheit;
       
       System.out.print("Enter Celsius: ");
       celsius = scn.nextInt();
       
       fahrenheit = (celsius * 9/5) + 32;
       System.out.println("Celsius: " +celsius+"\n"+"Celsius to Fahrenheit: "+fahrenheit);

    }
    
}
