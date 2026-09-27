package org.example.collecciones;

import java.util.LinkedHashSet;

public class CancionesFavoritas {
    public static void main(String[] args) {
        LinkedHashSet<String> favoritas = new LinkedHashSet<>();

        // Agregar canciones
        favoritas.add("Bohemian Rhapsody");
        favoritas.add("Hotel California");
        favoritas.add("Imagine");
        favoritas.add("Hotel California");

        // Imprimir lista (se mantiene en orden de inserción)
        System.out.println("Lista de canciones favoritas:");
        for (String cancion : favoritas) {
            System.out.println("- " + cancion);
        }
    }
}