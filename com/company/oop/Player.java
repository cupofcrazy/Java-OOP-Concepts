package com.company.oop;

public class Player {
    public String name;
    public int hitPoints;
    public String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;
        this.weapon = weapon;

        if (health > 0 && health <= 100) {
            this.hitPoints = health;
            //
        }
    }

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints <= 0) {
            System.out.println("Player knocked out!");
        }
    }
    public int healthRemaining() {
        return hitPoints;
    }
}
