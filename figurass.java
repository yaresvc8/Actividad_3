class Figura {
    public void calcularArea() {
        System.out.println("Calculando el área de una figura genérica...");
    }
}

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
    }
}

class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
    }
}

public class figurass {
    public static void main(String[] args) {
        
        Figura figura1 = new Circulo(5);      
        Figura figura2 = new Rectangulo(4, 6); 

        figura1.calcularArea();
        figura2.calcularArea();
    }
}

