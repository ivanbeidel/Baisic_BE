package org.example._2024_06_13;

import java.util.Arrays;

public class Lottery {
    public void runLottery() {
        int[] winNum = Utils.getLuckyNumbers();
        int[] humNum = Utils.getUserNumbers();
        System.out.println("Выигрышные номера: " + Arrays.toString(winNum));
        System.out.println("Вы ввели номера: " + Arrays.toString(humNum));
    }

}
