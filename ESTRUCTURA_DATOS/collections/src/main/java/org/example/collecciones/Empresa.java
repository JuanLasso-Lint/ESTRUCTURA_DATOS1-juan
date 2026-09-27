package org.example.collecciones;

import java.util.TreeSet;

public class Empresa {

    private String nombre;
    private TreeSet<Producto> productos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.productos = new TreeSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TreeSet<Producto> getProductos() {
        return productos;
    }

    public void setProductos(TreeSet<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    // Método corregido para buscar
    public void buscarProducto(Integer codigo) {
        boolean encontrado = false;

        for (Producto producto1 : this.productos) {
            // Se usa equals u Objects.equals para comparar Objetos Integer de forma segura
            if (producto1.getCodigo() == codigo) {
                System.out.println("Producto encontrado: " + producto1.getNombre());
                encontrado = true;
                break; // Se detiene el ciclo al encontrarlo
            }
        }

        // Si terminó el ciclo y no lo encontró, muestra el mensaje una sola vez
        if (!encontrado) {
            System.out.println("No existe producto con el código: " + codigo);
        }
    }
}