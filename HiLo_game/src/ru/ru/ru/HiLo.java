package ru.ru.ru;

import java.util.Scanner;

public class HiLo {


    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String playAgain = new String();
    String name;
    int countTryInput = 0;

        System.out.println("Input name: ");
        name = scan.nextLine();


    do{
        int theNumber = (int) (Math.random()* 200 - 100);
        int guess = 0;
        while (guess != theNumber) {



            System.out.println(name + " int the number -100 and 100");
            guess = scan.nextInt();
            countTryInput++;

            System.out.println("You entered " +guess + ".");
            if (guess < theNumber)
                System.out.println(guess + " is to low. Try again");
            else if (guess > theNumber)
                System.out.println(guess + " is to high. Try again");
            else
                System.out.println(guess + " is correct. You WIN!!!");

        }

        System.out.println(countTryInput + " Your count of try");
        System.out.println("Would you like to play again (y/n)");

        playAgain = scan.next();

        } while (playAgain.equalsIgnoreCase("y"));
    }
}