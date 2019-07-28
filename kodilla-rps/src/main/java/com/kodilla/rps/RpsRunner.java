package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);

        game.newGame = true;
        game.end = false;

        while (game.newGame) {
            game.resetGame();
            game.introGame(scanner);

            while (!game.end) {
                System.out.println();
                System.out.print("Wykonaj ruch, wciśnij klawisz: ");
                game.movePlayer = scanner.next();
                game.makeAMove();
                game.gameStatus(game.playerWinsRound, game.computerWinsRound);
                game.newGame(scanner, game.movePlayer);
            }
            game.gameResult(game.queue, game.playerWinsRound, game.computerWinsRound);
            game.endOrNewGame(scanner);
        }

    }
}
