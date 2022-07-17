package org.example;

import java.util.Scanner;

public class Player {

    private Scanner scanner = new Scanner(System.in);

    protected char p1Symbol;
    protected char compSymbol;
    protected char p2Symbol;

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
        p1Symbol = scanner.next().toLowerCase().charAt(0);
        compSymbol = (p1Symbol == 'x') ? 'o' : 'x';
        System.out.println("You have " + p1Symbol + " symbol and Computer have " + compSymbol);
    }

    public void askPlayersForSymbols(){
        System.out.println("Which symbol first player want to use: x or o?");
        scanner = new Scanner(System.in);
        p1Symbol = scanner.next().toLowerCase().charAt(0);
        p2Symbol = (p1Symbol == 'x') ? 'o' : 'x';
        System.out.println("Player one have " + p1Symbol + " symbol and " + p2Symbol);
    }
}
