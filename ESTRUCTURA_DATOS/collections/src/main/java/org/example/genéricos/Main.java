package org.example.genéricos;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Prueba Caja
        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.guardar("Hola Java Generics");
        System.out.println("Contenido de la caja: " + cajaTexto.obtener());








        //Prueba Par
        Par<Integer> par1 = new Par<>(10, 10);
        Par<String> par2 = new Par<>("Hola", "Mundo");
        System.out.println("¿Par (10, 10) son iguales?: " + par1.sonIguales());
        System.out.println("¿Par ('Hola', 'Mundo') son iguales?: " + par2.sonIguales());














        //Prueba CajaNumerica
        CajaNumerica<Integer> cajaInt = new CajaNumerica<>(15);
        CajaNumerica<Double> cajaDouble = new CajaNumerica<>(4.5);
        System.out.println("Doble de 15: " + cajaInt.doble());
        System.out.println("Doble de 4.5: " + cajaDouble.doble());







        //Prueba Comparador
        Comparador<String> compTexto = new Comparador<>();
        Comparador<Integer> compInt = new Comparador<>();
        System.out.println("Mayor entre 'Manzana' y 'Pera': " + compTexto.mayor("Manzana", "Pera"));
        System.out.println("Mayor entre 45 y 12: " + compInt.mayor(45, 12));



        //Prueba ServicioNumerico
        ServicioNumerico<Double> servicio = new ServicioNumerico<>();
        List<Double> notas = List.of(3.5, 4.8, 2.1, 4.0);
        System.out.println("Lista de notas: " + notas);
        System.out.println("Nota mínima: " + servicio.minimo(notas));
        System.out.println("Nota máxima: " + servicio.maximo(notas));




        //CalculadoraAvanzada
        CalculadoraAvanzada<Integer> calcInt = new CalculadoraAvanzada<>();
        System.out.println("Suma (20 + 30): " + calcInt.sumar(20, 30));
        System.out.println("Resta (50 - 15): " + calcInt.restar(50, 15));
        System.out.println("Máximo entre 100 y 250: " + calcInt.maximo(100, 250));
        System.out.println("Mínimo entre 100 y 250: " + calcInt.minimo(100, 250));
    }
}
