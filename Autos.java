class Vehiculo {
    public void mover() {
        System.out.println("El vehículo se está moviendo.");
    }
}

class Coche extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("El coche se está desplazando por la carretera ");
    }
}

class Bicicleta extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("La bicicleta avanza pedaleando ");
    }
}

public class Autos{
    public static void main(String[] args) {
        
        Vehiculo miVehiculo;

        miVehiculo = new Coche();
        miVehiculo.mover();  

        miVehiculo = new Bicicleta();
        miVehiculo.mover();  
    }
}
