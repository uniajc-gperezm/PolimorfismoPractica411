/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uniajc;

/**
 *
 * @author g.perezmoreno
 */
class Animal {

    public void hacerSonido() {
        System.out.println("EI animal hace un sonido.");
    }
}

class Perro extends Animal {

    @Override
    public void hacerSonido() {
        System.out.println("EI perro ladra");
    }
}

class Gato extends Animal {

    @Override
    public void hacerSonido() {
        System.out.println("EI gato maulla");
    }
}
