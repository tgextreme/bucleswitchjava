/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author usuario
 */
public class Calculo {

    public int mesActual(String mes) {
        mes=mes.toLowerCase();
        int numero = 0;

        switch (mes) {
            case "enero":
                numero = 1;
                break;
            
            case "febrero":
                numero = 2;
                break;
            case "marzo":
                numero = 3;
                break;
            case "abril":
                numero = 4;
                break;
            case "mayo":
                numero = 5;
                break;
            case "junio":
                numero = 6;
                break;
            case "julio":
                numero = 7;
                break;
            case "agosto":
                numero = 8;
                break;
            case "septiembre":
                numero = 9;
                break;
            case "octubre":
                numero = 10;
            case "noviembre":

                numero = 11;
                break;
            case "diciembre":

                numero = 12;
                break;
        }
        return numero;

    }
}
