package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game {
    String name = null;
    int round = 0;
    boolean end;
    boolean newGame;
    String movePlayer;
    int playerWinsRound;
    int computerWinsRound;
    int queue;

    public void resetGame() {
        if (newGame && end) {
            this.end = false;
            this.playerWinsRound = 0;
            this.computerWinsRound = 0;
            this.queue = 0;
        }
    }

    public void introGame(Scanner scanner) {
        System.out.print("Wpisz swoje imię: ");
        name = scanner.next();

        System.out.print("Wybierz liczbę wygranych rund: ");
        round = scanner.nextInt(10);

        System.out.println();
        System.out.println("Obsługa gry:");
        System.out.println("klawisz [1] - zagranie \"kamień\",");
        System.out.println("klawisz [2] - zagranie \"papier\",");
        System.out.println("klawisz [3] - zagranie \"nożyce\",");
        System.out.println("klawisz [4] - zagranie \"jaszczurka\",");
        System.out.println("klawisz [5] - zagranie \"Spock\",");
        System.out.println("klawisz [n] - wyjście z aktualnej gry.");
    }

    public boolean gameStatus(int playerWinsRound, int computerWinsRound) {
        System.out.println(name + " " + playerWinsRound + " : komputer " + computerWinsRound);
        if (playerWinsRound == round && round != 0) {
            end = true;
        } else if (computerWinsRound == round && round != 0) {
            end = true;
        }
        return end;
    }

    public void gameResult(int queue, int playerWinsRound, int computerWinsRound) {
        System.out.println();
        System.out.println("Stan gry, kolejka: " + queue + "\n" + name + " " + playerWinsRound + " : komputer " + computerWinsRound);
        System.out.println("Gra toczy się do " + round + " wygranych rund.");

        if (playerWinsRound == round && round != 0) {
            System.out.println();
            System.out.println("Zwyciężył zawodnik: " + name);
            System.out.println();
        } else if (computerWinsRound == round && round != 0) {
            System.out.println();
            System.out.println("Zwyciężył komputer.");
            System.out.println();
        }
    }

    public boolean newGame(Scanner scanner, String movePlayer) {
        if (movePlayer.equals("n") || movePlayer.equals("N")) {
            System.out.println();
            System.out.print("Czy na pewno zakończyć aktualną grę? (T/N) ");
            String endGame = scanner.next();
            if (endGame.equals("t") || endGame.equals("T")) {
                end = true;
            }
        }
        return end;
    }

    public boolean endOrNewGame(Scanner scanner) {
        System.out.println("Wybierz klawisz [x] aby zakończyć grę, lub klawisz [n] aby zagrać nową grę !");
        System.out.print("Koniec gry [x] / Nowa gra [n] ? ");
        String game = scanner.next();
        System.out.println();
        System.out.println();
        if (game.equals("x") || game.equals("X")) {
            newGame = false;
        } else if (game.equals("n") || game.equals("N")) {
            end = true;
        }
        return end;
    }

    public void makeAMove() {
        Random random = new Random();
        int moveComputer = random.nextInt(5) + 1;

        if (movePlayer.equals("1") && moveComputer == 1) {
            System.out.println("KAMIEŃ = KAMIEŃ");
            System.out.println("runda na remis");
        } else if (movePlayer.equals("1") && moveComputer == 2) {
            System.out.println("KAMIEŃ zostaje przykryty PAPIEREM");
            addPointForComputerToWinRound();
        } else if (movePlayer.equals("1") && moveComputer == 3) {
            System.out.println("KAMIEŃ zgniata NOŻYCE");
            addPointForPlayerToWinRound();
        } else if (movePlayer.equals("1") && moveComputer == 4) {
            System.out.println("KAMIEŃ zgniata JASZCZURKĘ");
            addPointForPlayerToWinRound();
        } else if (movePlayer.equals("1") && moveComputer == 5) {
            System.out.println("KAMIEŃ jest kruszony przez SPOCK");
            addPointForComputerToWinRound();
        } else if (movePlayer.equals("2") && moveComputer == 1) {
            System.out.println("PAPIER przykrywa KAMIEŃ");
            addPointForPlayerToWinRound();
        } else if (movePlayer.equals("2") && moveComputer == 2) {
            System.out.println("PAPIER = PAPIER");
            System.out.println("runda na remis");
        } else if (movePlayer.equals("2") && moveComputer == 3) {
            System.out.println("PAPIER jest cięty przez NOŻYCE");
            addPointForComputerToWinRound();
        } else if (movePlayer.equals("2") && moveComputer == 4) {
            System.out.println("PAPIER jest zjadany przez JASZCZURKĘ");
            addPointForComputerToWinRound();
        } else if (movePlayer.equals("2") && moveComputer == 5) {
            System.out.println("PAPIER udowadnia błąd SPOCKA");
            addPointForPlayerToWinRound();
        } else if (movePlayer.equals("3") && moveComputer == 1) {
            System.out.println("NOŻYCE zgniatane są przez KAMIEŃ");
            addPointForComputerToWinRound();
        } else if (movePlayer.equals("3") && moveComputer == 2) {
            System.out.println("NOŻYCE tną PAPIER");
            addPointForPlayerToWinRound();
        } else if (movePlayer.equals("3") && moveComputer == 3) {
            System.out.println("NOŻYCE = NOŻYCE");
            System.out.println("runda na remis");
        } else if (movePlayer.equals("3") && moveComputer == 4) {
            System.out.println("NOŻYCE ranią JASZCZURKĘ");
            addPointForPlayerToWinRound();
        } else if (movePlayer.equals("3") && moveComputer == 5) {
            System.out.println("NOŻYCE są łamane przez Spocka");
            addPointForComputerToWinRound();
        } else if (movePlayer.equals("4") && moveComputer == 1) {
            System.out.println("JASZCZURKA jest zgniatana przez KAMIEŃ");
            addPointForComputerToWinRound();
        } else if (movePlayer.equals("4") && moveComputer == 2) {
            System.out.println("JASZCZURKA zjada PAPIER");
            addPointForPlayerToWinRound();
        } else if (movePlayer.equals("4") && moveComputer == 3) {
            System.out.println("JASZCZURKA jest raniona przez NOŻYCE");
            addPointForComputerToWinRound();
        } else if (movePlayer.equals("4") && moveComputer == 4) {
            System.out.println("JASZCZURKA = JASZCZURKA");
            System.out.println("runda na remis");
        } else if (movePlayer.equals("4") && moveComputer == 5) {
            System.out.println("JASZCZURKA zatruwa SPOCKA");
            addPointForPlayerToWinRound();
        } else if (movePlayer.equals("5") && moveComputer == 1) {
            System.out.println("SPOCK kruszy KAMIEŃ");
            addPointForPlayerToWinRound();
        } else if (movePlayer.equals("5") && moveComputer == 2) {
            System.out.println("SPOCKOWI udowadnia bład PAPIER");
            addPointForComputerToWinRound();
        } else if (movePlayer.equals("5") && moveComputer == 3) {
            System.out.println("SPOCK łamie NOŻYCE");
            addPointForPlayerToWinRound();
        } else if (movePlayer.equals("5") && moveComputer == 4) {
            System.out.println("SPOCK zostaje zatruty przez JASZCZURKĘ");
            addPointForComputerToWinRound();
        } else if (movePlayer.equals("5") && moveComputer == 5) {
            System.out.println("SPOCK = SPOCK");
            System.out.println("runda na remis");
        }
        queue ++;
    }

    public void addPointForPlayerToWinRound() {
        playerWinsRound += 1;
    }

    public void addPointForComputerToWinRound() {
        computerWinsRound += 1;
    }
}
