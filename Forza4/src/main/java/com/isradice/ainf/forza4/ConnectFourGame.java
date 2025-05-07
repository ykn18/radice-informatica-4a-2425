/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isradice.ainf.forza4;

public class ConnectFourGame {
    public static final int ROWS = 6;
    public static final int COLS = 7;

    public enum CellColor { EMPTY, RED, YELLOW }

    private final CellColor[][] board = new CellColor[ROWS][COLS];
    private boolean redTurn = true;
    private boolean gameOver = false;

    public ConnectFourGame() {
        reset();
    }

    public CellColor getCell(int row, int col) {
        return board[row][col];
    }

    public boolean isRedTurn() {
        return redTurn;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public boolean dropDisc(int col) {
        if (gameOver) return false;

        for (int row = ROWS - 1; row >= 0; row--) {
            if (board[row][col] == CellColor.EMPTY) {
                board[row][col] = redTurn ? CellColor.RED : CellColor.YELLOW;
                if (checkWin(row, col)) {
                    gameOver = true;
                } else if (isBoardFull()) {
                    gameOver = true;
                } else {
                    redTurn = !redTurn;
                }
                return true;
            }
        }
        return false; // Column full
    }

    public boolean isDraw() {
        return isBoardFull() && !checkAnyWin();
    }

    public CellColor getWinner() {
        if (!gameOver) return CellColor.EMPTY;
        return redTurn ? CellColor.RED : CellColor.YELLOW;
    }

    public void reset() {
        for (int r = 0; r < ROWS; r++)
            for (int c = 0; c < COLS; c++)
                board[r][c] = CellColor.EMPTY;
        redTurn = true;
        gameOver = false;
    }

    private boolean isBoardFull() {
        for (int c = 0; c < COLS; c++) {
            if (board[0][c] == CellColor.EMPTY) return false;
        }
        return true;
    }

    private boolean checkAnyWin() {
        for (int r = 0; r < ROWS; r++)
            for (int c = 0; c < COLS; c++)
                if (board[r][c] != CellColor.EMPTY && checkWin(r, c))
                    return true;
        return false;
    }

    private boolean checkWin(int row, int col) {
        CellColor color = board[row][col];
        return count(row, col, 1, 0, color) + count(row, col, -1, 0, color) > 2 ||
               count(row, col, 0, 1, color) + count(row, col, 0, -1, color) > 2 ||
               count(row, col, 1, 1, color) + count(row, col, -1, -1, color) > 2 ||
               count(row, col, 1, -1, color) + count(row, col, -1, 1, color) > 2;
    }

    private int count(int row, int col, int dr, int dc, CellColor color) {
        int r = row + dr, c = col + dc, count = 0;
        while (r >= 0 && r < ROWS && c >= 0 && c < COLS && board[r][c] == color) {
            count++;
            r += dr;
            c += dc;
        }
        return count;
    }
}
