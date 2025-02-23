public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(2, 3);
        Punto p2 = new Punto(7, 8);
        Linea linea = new Linea(p1, p2);
        System.out.println(linea);
        linea.dibujaLinea();

        Punto centro = new Punto(5, 5);
        Circulo circulo = new Circulo(centro, 3);
        System.out.println(circulo);
        circulo.dibujaCirculo();
    }
}
