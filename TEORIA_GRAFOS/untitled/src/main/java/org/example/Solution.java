package org.example;

// Importamos las clases necesarias para trabajar con listas y colas
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {

    // Método principal que recibe el número total de cursos y la matriz de prerrequisitos
    public boolean canFinish(int nCursos, int[][] prerequisites) {

        // 1. Declaramos la lista de adyacencia (el grafo) para representar las conexiones
        List<List<Integer>> grafo = new ArrayList<>();

        // Creamos una lista vacía para cada uno de los cursos (nodos del 0 al nCursos - 1)
        for (int i = 0; i < nCursos; i++) {
            grafo.add(new ArrayList<>());
        }

        // Arreglo para llevar el conteo de aristas ENTRANTES (prerrequisitos pendientes) de cada curso
        int[] aristas = new int[nCursos];

        // 2. Recorremos la matriz de prerrequisitos elemento por elemento
        for (int[] prereq : prerequisites) {
            int curso = prereq[0];          // Curso que queremos tomar (destino)
            int prerrequisito = prereq[1];  // Curso necesario previamente (origen)

            // Agregamos el 'curso' a la lista del 'prerrequisito' (creamos la flecha: prerrequisito -> curso)
            grafo.get(prerrequisito).add(curso);

            // Incrementamos en 1 la cantidad de aristas entrantes que tiene el 'curso'
            aristas[curso]++;
        }

        // 3. Declaramos una cola (Queue) para procesar los cursos mediante BFS (Búsqueda en Amplitud)
        Queue<Integer> cola = new LinkedList<>();

        // Buscamos todos los cursos que no tengan aristas entrantes (aristas == 0) y los metemos a la cola
        for (int i = 0; i < nCursos; i++) {
            if (aristas[i] == 0) {
                cola.offer(i); // 'offer' agrega el elemento al final de la cola
            }
        }

        // Contador para llevar el registro de cuántos cursos hemos podido completar
        int cursosCompletados = 0;

        // 4. Mientras la cola no esté vacía, seguimos procesando cursos disponibles
        while (!cola.isEmpty()) {
            // Extraemos y removemos el primer curso disponible de la cola
            int cursoActual = cola.poll();

            // Sumamos 1 al total de cursos completados con éxito
            cursosCompletados++;

            // Recorremos todos los cursos que dependen del 'cursoActual'
            for (int vecino : grafo.get(cursoActual)) {
                // Como ya completamos el 'cursoActual', le restamos 1 a las aristas del curso 'vecino'
                aristas[vecino]--;

                // Si el 'vecino' ya no tiene más aristas entrantes pendientes, se puede tomar
                if (aristas[vecino] == 0) {
                    cola.offer(vecino); // Lo agregamos a la cola para procesarlo después
                }
            }
        }

        // 5. Si pudimos tomar la misma cantidad de cursos que el total exigido, retornamos true; si no, false
        return cursosCompletados == nCursos;
    }
}



