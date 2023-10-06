package org.example;

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

//        double price  = 0.0;
//        double quantity  = 0.0;
//        double miles = 0.0;
        double total;
        //price * quantity + miles;


        System.out.println("Product");
        System.out.println("----");
        String product = scanner.nextLine();
        System.out.println("===========");
        System.out.println(" Qty");
        System.out.println("----");
        String quantity = scanner.nextLine();
        System.out.println(" Price");
        System.out.println("----");


        String price = scanner.nextLine();
        System.out.println(" Miles");
        System.out.println("----");
        String miles = scanner.nextLine();
        System.out.println(" Total");
        System.out.println("----");



        System.out.println(price + quantity + fee);


       // String product = scanner.nextLine();


      //  String product = scanner.nextLine();
        System.out.println(" ");
    }
}
