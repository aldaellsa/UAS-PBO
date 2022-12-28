/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animal;

/**
 *
 * @author user
 */
public abstract class Animal {
    protected int kaki;

    protected Animal(int kaki) {
        this.kaki = kaki;
    }

    public abstract void makan();

    public void berjalan(){
        System.out.println("Hewan bisa berjalan");
    }
}