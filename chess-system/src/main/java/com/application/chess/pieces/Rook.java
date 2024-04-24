package com.application.chess.pieces;

import com.application.boardgame.Board;
import com.application.chess.ChessPiece;
import com.application.chess.Color;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
