/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Scanner;

/**
 *
 * @author: Olivera Gutierrez Oscar Omar
 */
public class Dog {

    String name;
    double weight;
    String colour;

    void LlenarDatosPerro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIngresa el nombre del perro");
        name = sc.nextLine();

        System.out.println("\nIngresa el color del perro");
        colour = sc.nextLine();

        System.out.println("\nIngresa el peso del perro");
        weight = sc.nextDouble();

    }

    void VerSalida() {
        System.out.println("********************************************");
        System.out.println("**Los datos del perro son: ");
        System.out.println("**Nombre del perro: " + name);
        System.out.println("**color del perro: " + colour);
        System.out.println("**peso: " + weight); 

    }
}
