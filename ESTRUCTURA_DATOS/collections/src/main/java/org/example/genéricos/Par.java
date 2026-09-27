package org.example.genéricos;


public class Par<T> {
    private T primero;
    private T segundo;

    public Par(T primero, T segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    public boolean sonIguales() {
        if (primero == null) {
            return segundo == null;
        }
        return primero.equals(segundo);
    }

}
