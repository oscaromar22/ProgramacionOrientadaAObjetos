/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progooog006;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class ProgOOOG006 {

    static int[] arreglo = new int[10];
    
    static Scanner SC = new Scanner(System.in);
    

    public static void main(String[] args) {
        insertarDatosArray();
        OrdenArray();

    }

    private static void insertarDatosArray() { 

        Scanner lector = new Scanner(System.in);
        int limite, i, j, aux;
        System.out.println("Ingrese le limite de la lista: ");
        limite = lector.nextInt();

        for (i = 0; i < limite; i++) {
            System.out.print("\n[" + (i + 1) + "]= ");
            arreglo[i] = lector.nextInt();
        }

        for (i = 0; i < limite; i++) {
            for (j = i + 1; j < limite; j++) {
                if (arreglo[i] > arreglo[j]) {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        } 
    }

    private static void OrdenArray() {
        System.out.print("\nOrden:  {");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + ",");
        }
        System.out.println("} ");
        

    }
}
