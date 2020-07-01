/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysSeparar;
import java.util.Arrays;

/**
 *
 * @author Olivera Gutierrez Oscar Omar
 */
public class Separar_Pares_e_Impares {

    static int[] SepararPeI(int[] array) {
        
        int[] separar = new int[array.length];
        int i, pares = 0, impares = array.length - 1;

        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                separar[pares] = array[i];
                pares++;
            } else {
                separar[impares] = array[i];
                impares--;
            }
        }
        return separar;
    } 

    public static void main(String[] args) {
        int[] numeros = new int[10];
        int i;
        
        for (i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println("Array de numeros aleatorios: " + Arrays.toString(numeros));

        numeros = SepararPeI(numeros);
        System.out.println("\nArray Ordenado: " + Arrays.toString(numeros));

    }
}
