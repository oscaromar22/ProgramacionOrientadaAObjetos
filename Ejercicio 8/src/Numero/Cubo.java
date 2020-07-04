/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numero;

import java.util.Scanner;

/** 
 *
 * @author Olivera Gutierrez Oscar Omar
 */
public class Cubo {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int cubo, numero;

        System.out.println("Ingresa tu número: ");
        cubo = entrada.nextInt();

        numero = (int) Math.pow(cubo,(double)1.0 /3.0);

        if (numero * numero * numero == cubo) {
            System.out.print("El número SI es un cubo\n");
        } else {
            System.out.print("El número NO es un cubo\n");
        }
    }  
}
