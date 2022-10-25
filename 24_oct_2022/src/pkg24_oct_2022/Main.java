/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg24_oct_2022;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
              Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese año: ");
        int año = entrada.nextInt();
        
        switch (año) {
            case 1904:
            case 1908:
            case 1912:
            case 1916:
            case 1920:
            case 1924:
            case 1928:
            case 1932:
            case 1936:
            case 1940:
            case 1944:
            case 1948:
            case 1952:
            case 1956:
            case 1960:
            case 1964:
            case 1968:
            case 1972:
            case 1976:
            case 1980:
            case 1984:
            case 1988:
            case 1992:
            case 1996:
            case 2000:
            case 2004:
            case 2008:
            case 2012:
            case 2016:
            case 2020:
            case 2024:
                System.out.println("Ingrese mes: ");
                 int bisiesto = entrada.nextInt();
                 
                switch (bisiesto) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 9:
                    case 11:
                     System.out.println ("Tiene 31 dias");
                    case 4:
                    case 6:
                    case 8:
                    case 10:
                    case 12:
                        System.out.println ("Tiene 30 dias");
                     default: 
                         System.out.println ("Tiene 29 dias");
                }
            default:
                System.out.println("Ingrese mes: ");
                int mes = entrada.nextInt();
                switch (mes) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 9:
                    case 11:
                     System.out.println ("Tiene 31 dias");
                    case 4:
                    case 6:
                    case 8:
                    case 10:
                    case 12:
                        System.out.println ("Tiene 30 dias");
                     default: 
                         System.out.println ("Tiene 28 dias");
                }
            
    }
    
}
}
