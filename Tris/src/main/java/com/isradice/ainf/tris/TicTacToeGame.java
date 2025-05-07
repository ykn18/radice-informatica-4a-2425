/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isradice.ainf.tris;

public class TicTacToeGame {
    public enum Cell { EMPTY, X, O }

    private final Cell[][] board = new Cell[3][3];
    private boolean xTurn = true;
    private boolean gameOver = false;

    public TicTacToeGame() {
        reset();
    }

    public boolean makeMove(int row, int col) {
        if (board[row][col] != Cell.EMPTY || gameOver) return false;

        board[row][col] = xTurn ? Cell.X : Cell.O;
        if (checkWin(row, col) || isBoardFull()) {
            gameOver = true;
        } else {
            xTurn = !xTurn;
        }
        return true;
    }

    public Cell getCell(int row, int col) {
        return board[row][col];
    }

    public boolean isXTurn() {
        return xTurn;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public boolean isDraw() {
        return isBoardFull() && !checkAnyWin();
    }

    public Cell getWinner() {
        if (!gameOver) return Cell.EMPTY;
        return checkAnyWin() ? (xTurn ? Cell.X : Cell.O) : Cell.EMPTY;
    }

    public void reset() {
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = Cell.EMPTY;
        xTurn = true;
        gameOver = false;
    }

    private boolean isBoardFull() {
        for (Cell[] row : board)
            for (Cell cell : row)
                if (cell == Cell.EMPTY)
                    return false;
        return true;
    }

    private boolean checkAnyWin() {
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                if (board[r][c] != Cell.EMPTY && checkWin(r, c))
                    return true;
        return false;
    }

    private boolean checkWin(int row, int col) {
        Cell cell = board[row][col];
        return (board[row][0] == cell && board[row][1] == cell && board[row][2] == cell) ||
               (board[0][col] == cell && board[1][col] == cell && board[2][col] == cell) ||
               (row == col && board[0][0] == cell && board[1][1] == cell && board[2][2] == cell) ||
               (row + col == 2 && board[0][2] == cell && board[1][1] == cell && board[2][0] == cell);
    }
}
