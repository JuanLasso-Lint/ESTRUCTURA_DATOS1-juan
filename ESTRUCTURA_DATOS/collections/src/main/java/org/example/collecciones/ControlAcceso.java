package org.example.collecciones;

import java.util.HashSet;

public class ControlAcceso{
    public static void main(String[] args) {


        HashSet<String> empleados = new HashSet<>();


        empleados.add("EMP001");
        empleados.add("EMP002");
        empleados.add("EMP003");
        empleados.add("EMP001");


        String idAProbar = "EMP002";
        if (empleados.contains(idAProbar)) {
            System.out.println("Acceso permitido para el ID: " + idAProbar);
        } else {
            System.out.println("Acceso denegado.");
        }
    }
}