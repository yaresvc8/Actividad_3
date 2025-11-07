class Persona {
    public void presentarse() {
        System.out.println("Hola, soy una persona.");
    }
}

class Estudiante extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un estudiante. Estoy aprendiendo mucho.");
    }
}

class Profesor extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un profesor. Me gusta enseñar y guiar a mis estudiantes.");
    }
}

public class Colegio {
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        Persona estudiante = new Estudiante();
        Persona profesor = new Profesor();

        
        persona.presentarse();
        estudiante.presentarse();
        profesor.presentarse();
    }
}

