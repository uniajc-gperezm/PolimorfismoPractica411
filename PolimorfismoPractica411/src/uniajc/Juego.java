package uniajc;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author g.perezmoreno
 */

// Clase base
class Personaje {
    void mostrarHabilidad() {
        System.out.println("El personaje muestra su habilidad.");
    }
}

// Clase derivada Guerrero
class Guerrero extends Personaje {
    void atacarConEspada() {
        System.out.println("¡El guerrero ataca con su espada!");
    }
}

// Clase derivada Mago
class Mago extends Personaje {
    void lanzarHechizo() {
        System.out.println("¡El mago lanza un hechizo!");
    }
}

public class Juego {
    public static void main(String[] args) {
        
        // Instanciacion por defecto
        Guerrero guerrero1 = new Guerrero();
        
        // Crear personajes
        Personaje personaje1 = new Guerrero(); // Upcasting implícito
        Personaje personaje2 = new Mago();    // Upcasting implícito

        // Intentamos acceder a las habilidades especiales
        usarHabilidadEspecial(personaje1);
        usarHabilidadEspecial(personaje2);
    }

    static void usarHabilidadEspecial(Personaje personaje) {
        // Verificar el tipo de personaje y realizar downcasting
        if (personaje instanceof Guerrero) {
            Guerrero guerrero = (Guerrero) personaje; // Downcasting explícito
            guerrero.atacarConEspada();
        } else if (personaje instanceof Mago) {
            Mago mago = (Mago) personaje; // Downcasting explícito
            mago.lanzarHechizo();
        } else {
            System.out.println("El personaje no tiene una habilidad especial conocida.");
        }
    }
}
