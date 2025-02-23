import javax.swing.*;
import java.awt.*;

class Punto {
    int x, y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class Linea extends JPanel {
    Punto p1, p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public String toString() {
        return "Línea de " + p1 + " a " + p2;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(p1.x * 50, p1.y * 50, p2.x * 50, p2.y * 50);
    }

    public void dibujaLinea() {
        JFrame frame = new JFrame("Dibujar Línea");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}

class Circulo extends JPanel {
    Punto centro;
    int radio;

    public Circulo(Punto centro, int radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public String toString() {
        return "Círculo con centro en " + centro + " y radio " + radio;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval((centro.x * 50) - radio * 50, (centro.y * 50) - radio * 50, radio * 100, radio * 100);
    }

    public void dibujaCirculo() {
        JFrame frame = new JFrame("Dibujar Círculo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
