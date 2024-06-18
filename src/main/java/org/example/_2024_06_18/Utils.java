package org.example._2024_06_18;

import java.util.Random;
import java.util.Scanner;

public class Utils {
    //Пишем крестики нолики

    //Инициализируем доску
    public static void initTable(char[][] gameTable){
        for (int row = 0; row < Constant.TABLE_SIZE; row++) {
            for (int col = 0; col < Constant.TABLE_SIZE; col++) {
                gameTable[row][col] = Constant.SIGN_EMPTY;
            }
        }
    }

    //Печатаем доску
    public static void printTable(char[][] gameTable){
        for (int row = 0; row < Constant.TABLE_SIZE; row++) {
            for (int col = 0; col < Constant.TABLE_SIZE; col++) {
                System.out.print(gameTable[row][col] + " ");
            }
            System.out.println();
        }
    }
    public static void turnHuman(char[][] gameTable){
        Scanner scanner = new Scanner(System.in);
        int xNum = -1;
        int yNum = -1;
        do{
            System.out.println("Введите X от 1 до 3: ");
            xNum = scanner.nextInt()-1;
            System.out.println("Введите Y от 1 до 3: ");
            yNum = scanner.nextInt()-1;
        } while (!isValidCell(gameTable, xNum, yNum));
        gameTable[xNum][yNum] = Constant.SIGN_X;
    }
    public static void ternAI(char[][] gameTable){
        int xNum = -1;
        int yNum = -1;
        Random random = new Random();
        do{

            xNum = random.nextInt(3);
            yNum = random.nextInt(3);
        } while (!isValidCell(gameTable, xNum, yNum));
        gameTable[xNum][yNum] = Constant.SIGN_O;
    }
    private static boolean isValidCell(char[][] gameTable,int xNum, int yNum) {
        if (xNum >= 0 && xNum <= 2 && yNum >= 0 && yNum <= 2) {
            return gameTable[xNum][yNum] == Constant.SIGN_EMPTY;
        }
        return false;
    }
    public static boolean isTableFull(char[][] gameTable){
        for (int row = 0; row < Constant.TABLE_SIZE; row++) {
            for (int col = 0; col < Constant.TABLE_SIZE; col++) {
                if (gameTable[row][col] == Constant.SIGN_EMPTY){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean checkWin(char[][] gameTable, char dot){
        for (int i = 0; i < 3; i++)
            if ((gameTable[i][0] == dot && gameTable[i][1] == dot &&
                    gameTable[i][2] == dot) ||
                    (gameTable[0][i] == dot && gameTable[1][i] == dot &&
                            gameTable[2][i] == dot))
                return true;
        if ((gameTable[0][0] == dot && gameTable[1][1] == dot &&
                gameTable[2][2] == dot) ||
                (gameTable[2][0] == dot && gameTable[1][1] == dot &&
                        gameTable[0][2] == dot))
            return true;
        return false;
    }

}
