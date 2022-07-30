package org.example.domain;

import java.util.InputMismatchException;
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

    public void askPlayerForSymbol() {
        System.out.println("Which symbol you want to use: X or O?");
        char askedSymbol = 0;
        while (!(askedSymbol == 'X' || askedSymbol == 'O')) {
            scanner = new Scanner(System.in);
            try {
                askedSymbol = scanner.next().toUpperCase().charAt(0);
                switch (askedSymbol) {
                    case 'X':
                        symbol = 'X';
                        break;
                    case 'O':
                        symbol = 'O';
                        break;
                    default:
                        System.out.println("Please enter x or o!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter x or o!");
            }
        }
        char opponentSymbol = (symbol == 'X') ? 'O' : 'X';
        System.out.println("You have " + symbol + " symbol and your opponent have " + opponentSymbol);
    }


    public char getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }
}
