package com.mycompany.proxectoparidade;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author koski
 */

import java.util.Scanner;
public class ParMain {
 
    
    
    public static void main (String [] args) {
    Scanner entrada= new Scanner (System.in);
    System.out.println("Introduce un número: ");
    int numeroProba=lerNumero (entrada);
        System.out.println(comprobarParidade(numeroProba));
        
    }
        
    static String comprobarParidade(int numeroProba) {
        String resultado;
        if (verificaPar(numeroProba)){
            resultado=O_NUMERO_E_PAR;
            
        }else{
            resultado=O_NUMERO_E_IMPAR;
        }
        return resultado;
        
    }

    static boolean verificaPar(int numeroProba) {
        return numeroProba%2==0;
    }
    private static final String O_NUMERO_E_IMPAR = "O número é impar";
    private static final String O_NUMERO_E_PAR = "O número é par";

    private static int lerNumero(Scanner in) {
        int numeroProba=in.nextInt ();
        return numeroProba;
    }
    
}
