/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales

        double[][] dato1 = {{1, 2, 3}, {6, 8, 9}}; //
        double[][] dato2 = new double[2][3];

        /*
            1   4   3
            36  64  9
         */
        double suma;
        double valor;
        String cadena = "";

        for (int fila = 0;
                fila < dato1.length; fila++) {
            for (int col = 0; col < dato1[fila].length; col++) {
                valor = dato1[fila][col];
                dato2[fila][col] = valor;
                if (valor % 2 == 0) {
                    suma = valor * valor;
                    dato2[fila][col] = suma;
                }

            }
        }

        for (var dato21 : dato2) {
            cadena = String.format("%s\n", cadena);
            for (int col = 0; col < dato21.length; col++) {
                cadena = String.format("%s%.0f\t", cadena, dato21[col]);
            }
        }

        System.out.printf("%s\n", cadena);      //Santiago Chavez
    }

}
