/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        cat cat = new cat("Kitty");
        fish fish = new fish("Cleo");
        spider spider = new spider();

        cat.play(fish);
        fish.play();
        cat.play();
        fish.play(cat);
        System.out.println();

        spider.makan();
        cat.makan();
        fish.makan();
        System.out.println();

        System.out.print("Kata Kucing: ");
        cat.berjalan();
        System.out.print("Kata Laba-Laba: ");
        spider.berjalan();
        System.out.print("Kata Ikan: ");
        fish.berjalan();
    }
}
