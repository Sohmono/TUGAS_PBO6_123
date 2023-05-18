/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inner;

/**
 *
 * @author Mono
 */

import Abstract.Character;

// Kelas inner yang merepresentasikan karakter pemain dalam game
public class Player extends Character {
    private int experiencePoints;

    public Player(String name, int healthPoints, int experiencePoints) {
        super(name, healthPoints);
        this.experiencePoints = experiencePoints;
    }

    @Override
    public void attack() {
        System.out.println(name + " menyerang dengan senjata");
    }

    @Override
    public void moveUp() {
        System.out.println(name + " bergerak ke atas");
    }

    @Override
    public void moveDown() {
        System.out.println(name + " bergerak ke bawah");
    }

    @Override
    public void moveLeft() {
        System.out.println(name + " bergerak ke kiri");
    }

    @Override
    public void moveRight() {
        System.out.println(name + " bergerak ke kanan");
    }
}