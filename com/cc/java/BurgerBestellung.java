package com.cc.java;

import java.util.Scanner;

public class BurgerBestellung {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variablen deklarieren
        String food = "noch kein Burger gewählt";
        String drink = "";
        String itemNumStr;
        String flag;

        // -------------------------------
        // Bestelldialog 1 : Burgerauswahl
        System.out.println("-------------------------------");
        System.out.println("Herzlich Willkommen bei MD, Ihre Bestellung bitte!");
        System.out.println("Hamburger(1), Cheeseburger(2) oder Chilliburger(3)?");

        System.out.print("Ihre Wahl: ");
        itemNumStr = scanner.nextLine();

        // Zuordnung Zahl --> Burger
        switch (itemNumStr) {
            case "1":
                food = "Hamburger";
                break;
            case "2":
                food = "Cheeseburger";
                break;
            case "3":
                food = "Chilliburger";
                break;
            default:
                System.out.println("Ungültige Eingabe!");
        }

        // -------------------------------
        // Entscheidung Getränk?
        System.out.println("-------------------------------");
        System.out.print("Möchten Sie ein Getränk dazu bestellen? (j/n): ");
        flag = scanner.nextLine();

        if (flag.equalsIgnoreCase("j")) {

            System.out.println("Cola(1), Fanta(2), Sprite(3)?");
            System.out.print("Ihre Wahl: ");
            itemNumStr = scanner.nextLine();

            switch (itemNumStr) {
                case "1":
                    drink = "Cola";
                    break;
                case "2":
                    drink = "Fanta";
                    break;
                case "3":
                    drink = "Sprite";
                    break;
                default:
                    System.out.println("Ungültige Eingabe!");
            }

            System.out.println("-------------------------------");
            System.out.println("Hier ist Ihre Bestellung: " + food + " und " + drink);

        } else {

            System.out.println("-------------------------------");
            System.out.println("Hier ist Ihre Bestellung: " + food);
        }

        System.out.println("Vielen Dank und auf Wiedersehen!");
        scanner.close();
    }
}