package PrimeraTarea;
public class Punto {
    public float x;
    public float y;
    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public String coord_cartesianas() {
        return "(" + x + ", " + y + ")";
    }
    //raíz cuadrada método de Newton
    private static double sqrt(double number) {
        double t;
        double sqrt = number / 2;
        do {
            t = sqrt;
            sqrt = (t + (number / t)) / 2;
        } while ((t - sqrt) != 0);
        return sqrt;
    }
    //arctan y taylor
    private static double atan(double z) {
        double sum = z;
        double term = z;
        int n = 1;
        for (int i = 3; i < 15; i += 2) {  // Más términos = mayor precisión
            term *= -z * z;
            sum += term / i;
            n++;
        }
        return sum;
    }
    public String coord_polares() {
        double r = sqrt(x * x + y * y);
        double theta = atan(y / x);
        return "(r: " + r + ", θ: " + theta + ")";
    }
    public String toString() {
        return "Punto: " + coord_cartesianas();
    }
    public static void main(String[] args) {
        Punto p = new Punto(3, 4);
        System.out.println(p);
        System.out.println("Coordenadas polares: " + p.coord_polares());
    }
}
