/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

/**
 *
 * @author Sohmono Sodip Manik
 *         211401123
 */

import Interface.Controllable;
import Abstract.Character;
import Inner.Player;






public class Tugas2 {
    public static void main(String[] args) {
        // Membuat objek pemain dan musuh
        Character player = new Player("John", 100, 50){
            @Override
            public void attack() {
                System.out.println("Anda menyerang dengan senjata");
            }
            
            @Override
            public void displayInfo() {
                System.out.println("Nama Anda: " + name);
                System.out.println("Health Point: " + healthPoints);
            }
        };
        
        Character player1 = new Player("Monster", 80, 30);

        // Memanggil metode dari objek pemain dan pemain1
        player.displayInfo();
        player.attack();
        player.moveUp();

        System.out.println();
        
        player1.displayInfo();
        player1.attack();
        player1.moveDown();
        
    }
}

