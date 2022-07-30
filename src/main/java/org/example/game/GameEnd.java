package org.example.game;

import org.example.domain.Player;

public class GameEnd {
    public void whoWins(Player player) {
        if (player.getName().equals("Computer")) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("Player " + player.getName() + " wins!");
        }
    }

    public boolean isGameEnd(char[][] board, Player player) {
        //Horizontally wins
        if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
            whoWins(player);
            return true;
        }
        if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') {
            whoWins(player);
            return true;
        }
        if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') {
            whoWins(player);
            return true;
        }
        if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') {
            whoWins(player);
            return true;
        }
        if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') {
            whoWins(player);
            return true;
        }
        if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') {
            whoWins(player);
            return true;
        }
        //Diagonally wins
        if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
            whoWins(player);
            return true;
        }
        if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
            whoWins(player);
            return true;
        }
        if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
            whoWins(player);
            return true;
        }
        if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
            whoWins(player);
            return true;
        }
        //Vertically wins
        if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') {
            whoWins(player);
            return true;
        }
        if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') {
            whoWins(player);
            return true;
        }
        if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
            whoWins(player);
            return true;
        }
        if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') {
            whoWins(player);
            return true;
        }
        if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
            whoWins(player);
            return true;
        }
        if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
            whoWins(player);
            return true;
        }
        if (board[0][0] != ' ' && board[0][1] != ' ' && board[0][2] != ' ' && board[1][0] != ' ' &&
                board[1][1] != ' ' && board[1][2] != ' ' && board[2][0] != ' ' && board[2][1] != ' ' && board[2][2] != ' ') {
            System.out.println("Its a tie");
            return true;
        }
        return false;
    }
}
