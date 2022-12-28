/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author user
 */
public class fish extends Pet{

    public fish(String name) {
        super(0, name, "ikan");
    }
    public fish(){
        this("");
    }
    //---------------------------------------------
    @Override
    public void makan() {
        System.out.println("Ikan makan");
    }

    @Override
    public void play() {
        System.out.println(name+ " bermain dengan anemon laut");
    }
    
    void play(Pet pet) {
        System.out.println();
 
    }
    @Override
    public void berjalan() {
        System.out.println("Ikan tidak bisa berjalan");
    }
}
