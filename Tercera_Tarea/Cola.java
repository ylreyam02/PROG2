package Tercera_Tarea;
class Cola {
    private long[] arreglo;
    private int inicio;
    private int fin;
    private int n;
    private int cantidad;

    public Cola(int n) {
        this.n = n;
        this.arreglo = new long[n];
        this.inicio = 0;
        this.fin = -1;
        this.cantidad = 0;
    }

    public void insert(long e) {
        if (isFull()) {
            System.out.println("Error: La cola está llena");
            return;
        }
        fin = (fin + 1) % n;
        arreglo[fin] = e;
        cantidad++;
    }

    public long remove() {
        if (isEmpty()) {
            System.out.println("Error: La cola está vacía");
            return -1;
        }
        long elemento = arreglo[inicio];
        inicio = (inicio + 1) % n;
        cantidad--;
        return elemento;
    }

    public long peek() {
        if (isEmpty()) {
            System.out.println("Error: La cola está vacía");
            return -1;
        }
        return arreglo[inicio];
    }

    public boolean isEmpty() {
        return cantidad == 0;
    }

    public boolean isFull() {
        return cantidad == n;
    }

    public int size() {
        return cantidad;
    }

    public static void main(String[] args) {
        Cola cola = new Cola(5);
        cola.insert(100);
        cola.insert(200);
        cola.insert(300);
        System.out.println("Primer elemento en la cola: " + cola.peek()); // Debe imprimir 100
        System.out.println("Sacando elemento: " + cola.remove()); // Debe imprimir 100
        System.out.println("Está vacía? " + cola.isEmpty()); // Debe imprimir false
        System.out.println("Tamaño de la cola: " + cola.size()); // Debe imprimir 2
    }
}
