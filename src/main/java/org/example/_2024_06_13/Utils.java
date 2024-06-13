package org.example._2024_06_13;

import java.util.Random;
import java.util.Scanner;

public class Utils {
    public static int[] getLuckyNumbers(){
        int[] luckyNumbers = new int[Constant.COUNT_SET_SIZE];
        Random random = new Random();
        int currentRandomValue = 0;
        int i = 0;
        while (i < luckyNumbers.length) {
            currentRandomValue = random.nextInt(1, 51);
            if (!checkDuplicates(luckyNumbers, currentRandomValue)){
                luckyNumbers[i] = currentRandomValue;
                i++;
            }
        }
        return luckyNumbers;
    }
    public static int[] getUserNumbers(){
        Scanner scanner = new Scanner(System.in);
        int[] humanNums = new int[Constant.COUNT_SET_SIZE];
        System.out.println("Введите 5 чисел от 1 до 50");
        int i = 1;
        while (i <= humanNums.length) {
            System.out.print("Введите число #" + i + ": ");
            int humanNumPre = scanner.nextInt();
            if (humanNumPre >= 1 && humanNumPre <= 50 && !checkDuplicates(humanNums, humanNumPre)) {
                    humanNums[i - 1] = humanNumPre;
                    i++;
                }
             else {
                System.out.println("Число вне диапазона 1-50 или такое число уже было введено");
            }
        }
        return humanNums;
    }
    private static boolean checkDuplicates (int[] luckyNumbers, int currentNum){
        for (int i = 0; i < luckyNumbers.length; i++) {
            if (luckyNumbers[i] == currentNum) {
                return true;
            }
        }
        return false;
    }
}
