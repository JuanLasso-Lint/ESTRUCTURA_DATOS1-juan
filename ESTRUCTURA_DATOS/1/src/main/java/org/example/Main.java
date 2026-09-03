package org.example;

public class Main {

    public static void main(String[] args) {
        String[] matrioshkas = {"Muñeca Grande", "Muñeca Mediana", "Muñeca Pequeña", "Bebé Macizo"}; //4

        // Iniciamos el proceso desde la primera muñeca (índice 0)
        abrirMatrioshka(matrioshkas, 0);
    }

    // Único método recursivo para recorrer el arreglo
    public static void abrirMatrioshka(String[] arreglo, int indice) {
        // CASO BASE: Llegamos al final del arreglo
        if (indice == arreglo.length) {
            return;
        }

        // ACCIÓN: Abrir/mostrar la muñeca actual
        System.out.println("Abriendo la " + arreglo[indice] + " Sacando la " + arreglo[Math.min(indice + 1, 3)]);
        // RECURSIÓN: Abrir la siguiente muñeca (avanzar en el arreglo)
        abrirMatrioshka(arreglo, indice + 1);
        System.out.println("Cerrando la " + arreglo[indice] + " Metiendo la " + arreglo[Math.min(indice + 1, 3)]);

    }

}