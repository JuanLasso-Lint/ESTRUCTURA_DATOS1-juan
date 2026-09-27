package org.example.collecciones;

import java.util.Stack;

public class NavegacionWeb {
    public static void main(String[] args) {
        Stack<String> historial = new Stack<>();

        // Visitar páginas web
        historial.push("https://google.com");
        historial.push("https://github.com");
        historial.push("https://stackoverflow.com");

        System.out.println("Página actual: " + historial.peek());

        // Volver a la página anterior (retroceder)
        String paginaEliminada = historial.pop();
        System.out.println("Retrocediendo desde: " + paginaEliminada);
        System.out.println("Ahora estás en: " + historial.peek());
    }
}