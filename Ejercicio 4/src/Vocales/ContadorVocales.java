/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vocales;

import java.util.Scanner;

/**
 *
 * @author Olivera Gutierrez Oscar Omar
 */
public class ContadorVocales {

    public static void main(String[] arg) {
        int consonante, vocal, dife;
        String frase;
        Scanner ingreso = new Scanner(System.in);

        vocal = 0;
        consonante = 0;
        dife = 0;

        System.out.println("Ingresa la palabra:");
        frase = ingreso.nextLine().toLowerCase();

        for (int cont = 0; cont < frase.length(); cont++) {
            if (frase.charAt(cont) < 'a' || frase.charAt(cont) > 'z') {
                dife++;
            } else if ((frase.charAt(cont) == 'a') || (frase.charAt(cont) == 'e') || (frase.charAt(cont) == 'i') || (frase.charAt(cont) == 'o') || (frase.charAt(cont) == 'u')) {
                vocal++;
            } else {
                consonante++;
            }

        }
        System.out.println("\nLa palabra/frase tiene: " + vocal + " Vocales y " + consonante + " Consonantes");

    }

}
