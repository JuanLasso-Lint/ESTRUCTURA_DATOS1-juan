package org.example;

import java.io.IO;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        ArregloRecursivo(numeros, 0);
    }

    public static void ArregloRecursivo(int[] arreglo, int indice) {
        // Caso base: si el índice llega al tamaño del arreglo termina
        if (indice == arreglo.length) {
            return;
        }

        System.out.println("Elemento en índice " + indice + ": " + arreglo[indice]);


        // Llamada recursiva con el siguiente índice
        ArregloRecursivo(arreglo, indice + 1);

        System.out.printf("Hola perro");

        IO.println("Hola perros");

    }
    }

