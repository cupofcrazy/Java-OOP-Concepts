package com.company.oop;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Bed masterBed = new Bed(600, 300, 900, false);
        Dresser masterDresser = new Dresser(300, 600, 250, "light-blue");

        Bedroom masterBedroom = new Bedroom(1000, 1000, 2000, masterBed, masterDresser);

        System.out.println("The width of the master-bedroom is " + masterBedroom.getDresser().getWidth() + " inches");
        masterBedroom.makeBed();

        // Encapsulation
        Player player = new Player();
        player.name = "Tobi";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 20;
        player.loseHealth(damage);
        System.out.println("Remaining health: " + player.healthRemaining() + "hp");
    }
}
