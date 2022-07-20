package org.example;

import java.util.Scanner;

public class Game {

    private Scanner scanner = new Scanner(System.in);
    private BoardGame boardGame = new BoardGame();
    private Player players = new Player();
    char character;

    public void updateBoard(int position, int player, char[][] board){

        if(player==0){
            character = players.p1Symbol;
        } else {
            character = players.compSymbol;
        }

        switch (position){

            case 1:
                board[0][0] = character;
                boardGame.drawBoard(board);
                break;
            case 2:
                board[0][1] = character;
                boardGame.drawBoard(board);
                break;
            case 3:
                board[0][2] = character;
                boardGame.drawBoard(board);
                break;
            case 4:
                board[1][0] = character;
                boardGame.drawBoard(board);
                break;
            case 5:
                board[1][1] = character;
                boardGame.drawBoard(board);
                break;
            case 6:
                board[1][2] = character;
                boardGame.drawBoard(board);
                break;
            case 7:
                board[2][0] = character;
                boardGame.drawBoard(board);
                break;
            case 8:
                board[2][1] = character;
                boardGame.drawBoard(board);
                break;
            case 9:
                board[2][2] = character;
                boardGame.drawBoard(board);
                break;
            default:
                break;

        }
    }

public void playerMove(char[][] board){

    System.out.println("Please make a move: 1-9");

    int move = scanner.nextInt();

    boolean result = isValidMove(move, board);

    while(!result){
        System.out.println("Sorry, valid move");
        move = scanner.nextInt();
        result = isValidMove(move, board);
    }
        updateBoard(move, 0 ,board);
}

    public boolean isValidMove(int move, char[][] board){
        switch (move){
            case 1:
                if(board[0][0] == ' '){
                    return true;
                } else{
                    return false;
                }
            case 2:
                if(board[0][1] == ' '){
                    return true;
                } else{
                    return false;
                }
            case 3:
                if(board[0][2] == ' '){
                    return true;
                } else{
                    return false;
                }

            case 4:
                if(board[1][0] == ' '){
                    return true;
                } else{
                    return false;
                }
            case 5:
                if(board[1][1] == ' '){
                    return true;
                } else{
                    return false;
                }
            case 6:
                if(board[1][2] == ' '){
                    return true;
                } else{
                    return false;
                }
            case 7:
                if(board[2][0] == ' '){
                    return true;
                } else{
                    return false;
                }
            case 8:
                if(board[2][1] == ' '){
                    return true;
                } else{
                    return false;
                }
            case 9:
                if(board[2][2] == ' '){
                    return true;
                } else{
                    return false;
                }

            default:
                return false;
        }
    }

    public void firstPlayerPlay(char[][] board, char firstPlayerSymbol){
        System.out.println("Enter the row and column: ");
        int rowIndex = scanner.nextInt();
        int colIndex = scanner.nextInt();

        if(board[rowIndex][colIndex] != ' '){
            System.out.println("This cell is already taken. Please try other row and column! ");
            rowIndex = scanner.nextInt();
            colIndex = scanner.nextInt();
        } else {
            board[rowIndex][colIndex] = firstPlayerSymbol;
            boardGame.drawBoard(boardGame.board);
        }
    }

    public char secondPlayerPlay(char[][] board, char secondPlayerSymbol){
        System.out.println("Enter the row and column: ");
        int rowIndex = scanner.nextInt();
        int colIndex = scanner.nextInt();

        while(board[rowIndex][colIndex] != ' '){
            System.out.println("This cell is already taken. Please try other row and column! ");
            rowIndex = scanner.nextInt();
            colIndex = scanner.nextInt();
        }
        return board[rowIndex][colIndex] = secondPlayerSymbol;
    }

    public void ComputerPlay(char[][] board, char computerSymbol){
        for(int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                if(board[i][j] == ' '){
                    board[i][j] = computerSymbol;
                }
            }
        }
    }
}
