/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author user
 */
public class cat extends Pet{

    public cat(String name) {
        super(4, name, "kucing");
    }

    public cat() {
        this("");
    }

    @Override
    public void makan() {
        System.out.println("Kucing makan");
    }
    
    @Override
    public void play() {
        System.out.println( name + " bermain bola ");
    }
    
    @Override
    public void play(Pet pet) {
    }
 
     @Override
    public void berjalan() {
        System.out.println("Kucing bisa berjalan");
    }
}