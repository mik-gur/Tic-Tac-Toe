package org.example;

import java.util.Scanner;

public class Player {

    private Scanner scanner = new Scanner(System.in);

    private char symbol;
    private String name;

    public Player() {
        askPlayerForName();
        askPlayerForSymbol();
    }

    public Player(Player player) {
        this.symbol = (player.symbol == 'X') ? 'O' : 'X';
        this.name = "Computer";
    }

    public Player(char symbol) {
        askPlayerForName();
        this.symbol = (symbol == 'X') ? 'O' : 'X';
        System.out.println("Your symbol is " + getSymbol());
    }

    public void askPlayerForName() {
        System.out.println("What is your name?");
        name = scanner.nextLine();
        System.out.println("Welcome " + name);
    }
//
//    public void askTwoPlayersForNames(){
//        System.out.println("What is first player name?");
//        String p1Name = scanner.nextLine();
//        scanner = new Scanner(System.in);
//        System.out.println("What is second player name?");
//        p2Name = scanner.nextLine();
//        System.out.println("Welcome " + p1Name + " and " + p2Name);
//    }

    public void askPlayerForSymbol() {
        System.out.println("Which symbol you want to use: X or O?");
        scanner = new Scanner(System.in);
        symbol = scanner.next().toUpperCase().charAt(0);
        char opponentSymbol = (symbol == 'X') ? 'O' : 'X';
        System.out.println("You have " + symbol + " symbol and your opponent have " + opponentSymbol);
    }
//
//    public void askPlayersForSymbols(){
//        System.out.println("Which symbol first player want to use: X or O?");
//        scanner = new Scanner(System.in);
//        p1Symbol = scanner.next().toUpperCase().charAt(0);
//        p2Symbol = (p1Symbol == 'X') ? 'O' : 'X';
//        System.out.println("Player one have " + p1Symbol + " symbol and " + p2Symbol);
//    }


    public char getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }
}
