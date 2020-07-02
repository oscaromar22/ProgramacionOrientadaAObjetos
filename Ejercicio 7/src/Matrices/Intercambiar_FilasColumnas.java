/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrices;

/**
 *
 * @author Olivera Gutierrez Oscar Omar
 */
public class Intercambiar_FilasColumnas {

    static int[][] ArrayAleatorio(int filas, int columnas) {
        int[][] array = new int[filas][columnas];
        int i, j;

        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10 + 1);
            }
        }
        return array;
    }

    static void MostrarArray(int[][] array) {
        int i, j;

        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
    }

    static int[][] MatrizTranspuesta(int[][] array) {
        int[][] mostrar = new int[array[0].length][array.length];
        int filas, columnas;

        for (columnas = 0; columnas < array[0].length; columnas++) {
            for (filas = 0; filas < array.length; filas++) {
                mostrar[columnas][filas] = array[filas][columnas];
            }
        }
        return mostrar;
    }

    public static void main(String[] args) {
        int[][] array;

        array = ArrayAleatorio(9, 5);
        System.out.println("Array Original:\n");
        MostrarArray(array);
        System.out.println();
        System.out.println("Array Transpuesta:\n");
        array = MatrizTranspuesta(array);
        MostrarArray(array);
    }
}
