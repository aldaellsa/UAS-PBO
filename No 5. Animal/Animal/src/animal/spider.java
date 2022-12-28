/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author user
 */
public class spider extends Animal{
    public spider() {
        super(8);
    }

    @Override
    public void makan() {
        System.out.println("Laba-Laba makan");
    }
     @Override
    public void berjalan() {
        System.out.println("Laba-Laba bisa berjalan");
    }

}
