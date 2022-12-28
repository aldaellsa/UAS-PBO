/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author user
 */
public abstract class Pet extends Animal {
    protected String name;
    private final String tipe;

    //---------------COSTRUTTORE-------------------
    public Pet(int legs, String name, String tipe) {
        super(legs);
        this.name = name;
        this.tipe = tipe;
    }

    //----------------------------------------------
    public String getName(){
        return name;
    }

    public String getTipe() {
        return tipe;
    }

    public void setName(String name){
        this.name = name;
    }
    abstract void play();

    abstract void play(Pet pet);
}
