package org.example.genéricos;

import java.util.List;

public class ServicioNumerico<T extends Number & Comparable<T>> implements Servicio<T> {

    @Override
    public T minimo(List<T> lista) {
        if (lista == null || lista.isEmpty()) return null;
        T min = lista.get(0);
        for (T elemento : lista) {
            if (elemento.compareTo(min) < 0) {
                min = elemento;
            }
        }
        return min;
    }

    @Override
    public T maximo(List<T> lista) {
        if (lista == null || lista.isEmpty()) return null;
        T max = lista.get(0);
        for (T elemento : lista) {
            if (elemento.compareTo(max) > 0) {
                max = elemento;
            }
        }
        return max;
    }
}
