package com.company.oop;

import com.polymorphism.Car;

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
        player.hitPoints = 20;
        player.weapon = "Sword";

        int damage = 20;
        player.loseHealth(damage);
        System.out.println("Remaining health: " + player.healthRemaining() + "hp");

        // Printer class created with duplex set to true
        Printer printer = new Printer(45, 10, true);
        // Initial pages printed
        System.out.println("Initial number pages printed: " + printer.getPagesPrinted());
        //Update pages to be printed
        printer.printPages(60);
        System.out.println("Final number of pages printed: " + printer.getPagesPrinted());
    }


}


