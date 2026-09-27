package org.example.genéricos;

public class CalculadoraAvanzada<T extends Number & Comparable<T>> {

    public double sumar(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public double restar(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }

    public T maximo(T a, T b) {
        return (a.compareTo(b) >= 0) ? a : b;
    }

    public T minimo(T a, T b) {
        return (a.compareTo(b) <= 0) ? a : b;
    }


}