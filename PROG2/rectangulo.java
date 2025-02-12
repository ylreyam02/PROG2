public class rectangulo {
    public float base;
    public float altura;
    public rectangulo(float a , float b ){
        base = a;
        altura = b;
    }
public float perimetro(){
        return 2 *(base + altura);
}
public float area(){
        return base * altura;
}

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public static void main(String[] args) {
        rectangulo r1 = new rectangulo(2,3);
        System.out.println("perimetro="+ r1.perimetro());
        System.out.println("area="+ r1.area());
    }
}
