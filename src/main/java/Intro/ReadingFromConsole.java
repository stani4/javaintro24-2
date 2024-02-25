package Intro;

import java.util.Scanner;

public class ReadingFromConsole {
    public static void main(String[] args) {
        // scanner class is used when we want to read user input from console:
        Scanner scanner = new Scanner(System.in);
        //Giving info to the user that we expect some input
        System.out.println("Please enter your name:");
        //Reading the input using the scanner variable
        String name = scanner.nextLine();
        //Final line of our program - greeting the user
        System.out.println("Nice to meet you, " + name + "!");
    }
}
