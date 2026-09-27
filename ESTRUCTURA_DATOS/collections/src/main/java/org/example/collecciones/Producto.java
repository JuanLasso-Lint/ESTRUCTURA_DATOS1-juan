package org.example.collecciones;



public class Producto implements Comparable<Producto> {
    private String nombre;
    private int codigo;
    private double precio;

    public Producto(String nombre, int codigo, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Permite que TreeSet ordene los productos por su código
    @Override
    public int compareTo(Producto otro) {
        return Integer.compare(this.codigo, otro.codigo);
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + " | Código: " + codigo + " | Precio: $" + precio;
    }
}
