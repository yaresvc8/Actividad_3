class Vehiculo {
    public void encender() {
        System.out.println("El vehículo se ha encendido.");
    }
}

class Carro extends Vehiculo {
    @Override
    public void encender() {
        // Mala práctica: no cambia nada, repite el mismo comportamiento
        System.out.println("El vehículo se ha encendido.");
    }
}

//Correcion 
@Override
public void encender() {
    System.out.println("El carro ha encendido su motor a gasolina.");
}

public class Vehiculos {
    public static void main(String[] args) {
        Vehiculo v = new Carro();
        v.encender();
    }
}
