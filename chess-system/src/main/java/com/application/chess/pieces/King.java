package com.application.chess.pieces;

import com.application.boardgame.Board;
import com.application.chess.ChessPiece;
import com.application.chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
