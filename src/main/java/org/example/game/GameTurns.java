package org.example.game;

import java.util.Scanner;


public class GameTurns {

    private Scanner scanner = new Scanner(System.in);
    private char firstTurn;
    private int turn;

    public void askForFirstTurn() {
        System.out.println("Do you want to start (y/n) ?");
        firstTurn = scanner.next().toLowerCase().charAt(0);

        if (firstTurn == 'y') {
            turn = 0;
        } else {
            turn = 1;
        }
    }

    public boolean playerStarts() {
        return getTurn() == 0;
    }

    public int getTurn() {
        return turn;
    }
}
