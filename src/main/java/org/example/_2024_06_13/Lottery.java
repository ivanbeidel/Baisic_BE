package org.example._2024_06_13;

import java.util.Arrays;

public class Lottery {
    public void runLottery() {
        int[] winNum = Utils.getLuckyNumbers();
        int[] humNum = Utils.getUserNumbers();
        int[] matchingCount = Utils.compOfNumbers(winNum, humNum);
        System.out.println("Выигрышные номера: " + Arrays.toString(winNum));
        System.out.println("Вы ввели номера: " + Arrays.toString(humNum));
        System.out.println("Количество совпадений: " + Arrays.toString(matchingCount));
    }

}
