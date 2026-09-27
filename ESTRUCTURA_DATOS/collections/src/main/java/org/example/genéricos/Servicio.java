package org.example.genéricos;


import java.util.List;

interface Servicio<T extends Number & Comparable<T>> {
    T minimo(List<T> lista);
    T maximo(List<T> lista);
}
