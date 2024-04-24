

package com.application;

import com.application.boardgame.Position;
import com.application.chess.ChessMatch;
import com.application.chess.ChessPiece;

public class Application {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}