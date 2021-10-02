/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sca =new Scanner(System.in);
        Calculo cal= new Calculo();
        int numMes=0;
        String mes="";
        System.out.println("Dime mes");
        mes=sca.nextLine();
        numMes=cal.mesActual(mes);
        System.out.println("El número de mes es " +numMes);
        
        
        
    }
    
}
