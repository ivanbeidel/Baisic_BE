package org.example._2024_06_18;

public class NewTicTacToe {
    private static char[][] gameTable = new char[Constant.TABLE_SIZE][Constant.TABLE_SIZE];

    public void play() {
        Utils.initTable(gameTable);
        Utils.printTable(gameTable);
        while (true) {
            Utils.turnHuman(gameTable);
            if (Utils.checkWin(gameTable,Constant.SIGN_X)) {
                System.out.println("YOU WIN!");
                break;
            }
            if (Utils.isTableFull(gameTable)) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            Utils.ternAI(gameTable);
            Utils.printTable(gameTable);
            if (Utils.checkWin(gameTable ,Constant.SIGN_O)) {
                System.out.println("AI WIN!");
                break;
            }
            if (Utils.isTableFull(gameTable)) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER.");
        Utils.printTable(gameTable);
    }
}
