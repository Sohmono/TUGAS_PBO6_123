/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author Mono
 */

import Interface.Controllable;

// Kelas abstract yang merepresentasikan karakter dalam game
public abstract class Character implements Controllable {
    protected String name;
    protected int healthPoints;
    
    
    public Character(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public abstract void attack();

    
    public void displayInfo() {
        System.out.println("Nama karakter: " + name);
        System.out.println("Health Points: " + healthPoints);
    }
    
}
