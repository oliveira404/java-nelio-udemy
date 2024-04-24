package com.application.boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; //se n deixar nada o java poem null tmb por padrao.
    }

    protected Board getBoard() {
        return board;
    }
}
