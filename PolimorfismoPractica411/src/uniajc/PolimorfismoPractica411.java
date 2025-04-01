/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uniajc;

/**
 *
 * @author g.perezmoreno
 */
public class PolimorfismoPractica411 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Animal myAnimal = new Animal();
        Perro myPerro = new Perro();
        Gato myGato = new Gato();

        myAnimal.hacerSonido();
        myPerro.hacerSonido();
        myGato.hacerSonido();
        
        Calculadora operacion = new Calculadora();
        
        operacion.suma(1, 2, 3);
    }

}
