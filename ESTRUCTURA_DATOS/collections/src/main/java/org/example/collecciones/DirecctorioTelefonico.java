package org.example.collecciones;

import java.util.HashMap;

public class DirecctorioTelefonico {
    public static void main(String[] args) {
        HashMap<String, String> directorio = new HashMap<>();

        // Agregar contactos (Nombre, Teléfono)
        directorio.put("Carlos Pérez", "555-0192");
        directorio.put("María López", "555-8371");
        directorio.put("Juan Gómez", "555-4720");

        // Buscar un número de teléfono
        String nombreBuscar = "María López";
        if (directorio.containsKey(nombreBuscar)) {
            System.out.println("El teléfono de " + nombreBuscar + " es: " + directorio.get(nombreBuscar));
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }
}