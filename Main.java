package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String distance;
        double fee = 0.0;


      //  if ()

        switch ((int) fee) {
            case 2:
                distance = "0 < 5 miles";
                fee = 2;
                System.out.println("You can go as far as " + distance);
                break;

            case 5:
                distance = "6 < 15 miles";
                System.out.println("You can go as far as " + distance);
                break;

            case 10:
                distance = "16 < 25 miles";
                System.out.println("You can go as far as " + distance );
                break;

            case 15:
                distance = "26 < 50 miles";
                System.out.println("You can go as far as " + distance);
                break;

            default:
                fee = 20;
                System.out.println("More than 50 miles of travel for a fee of $" + fee);
                break;

        }

        double total;
        //price * quantity + miles;


        System.out.println("Product");
        System.out.println("----");
        String product = scanner.nextLine();
        System.out.println("===========");
        System.out.println(" Qty");
        System.out.println("----");
        double quantity = scanner.nextDouble();
        System.out.println("===========");
        System.out.println(" Price");
        System.out.println("----");

        double pricce = scanner.nextDouble();
        System.out.println("===========");
        System.out.println(" Price");
        System.out.println("----");

        double miles = scanner.nextDouble();
        System.out.println("===========");
        System.out.println(" Miles");
        System.out.println("----");
        total = quantity * pricce;

        System.out.println(total + fee);
       // System.out.println("%-12s%-7s%-10s%-10s%-10s\n", product);
    }

}
