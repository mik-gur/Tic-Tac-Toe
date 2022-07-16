package org.example;

import java.util.Scanner;

public class Player {

    private Scanner scanner = new Scanner(System.in);

    public void askPlayerForName(){
        System.out.println("What is your name?");
        String p1Name = scanner.nextLine();
        System.out.println("Welcome " + p1Name);
    }

    public void askTwoPlayersForNames(){
        System.out.println("What is first player name?");
        String p1Name = scanner.nextLine();
        scanner = new Scanner(System.in);
        System.out.println("What is second player name?");
        String p2Name = scanner.nextLine();
        System.out.println("Welcome " + p1Name + " and " + p2Name);
    }
}
