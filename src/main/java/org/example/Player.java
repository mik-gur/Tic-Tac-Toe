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

    public void askPlayerForSymbol(){
        System.out.println("Which symbol you want to use: x or o?");
        scanner = new Scanner(System.in);
        char p1Symbol = scanner.next().toLowerCase().charAt(0);
        char compSymbol = (p1Symbol == 'x') ? 'o' : 'x';
        System.out.println("Symbol " + p1Symbol + " is using and Computer " + compSymbol);
    }

    public void askPlayersForSymbols(){
        System.out.println("Which symbol first player want to use: x or o?");
        scanner = new Scanner(System.in);
        char p1Symbol = scanner.next().toLowerCase().charAt(0);
        char p2Symbol = (p1Symbol == 'x') ? 'o' : 'x';
        System.out.println("Player one have " + p1Symbol + " symbol and " + p2Symbol);
    }
}
