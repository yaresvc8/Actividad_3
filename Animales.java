class animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

class Perro extends animal {
    public void ladrar() {
        System.out.println("El perro ladra: ¡Guau guau!");
    }
}

public class Animales {
    public static void main(String[] args) {
        animal miAnimal = new Perro(); 
        miAnimal.hacerSonido();        

    }
}

