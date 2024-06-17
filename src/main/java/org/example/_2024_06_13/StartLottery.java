package org.example._2024_06_13;

public class StartLottery {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        int[] winNum = Utils.getLuckyNumbers();
        int[][] humNum = new int[Constant.COUNT_USERS][Constant.COUNT_SET_SIZE];
        for (int i = 0; i < Constant.COUNT_USERS; i++) {
            humNum [i] = Utils.getUserNumbers();
        }
        for (int i = 0; i < Constant.COUNT_USERS; i++) {
            lottery.runLottery(winNum, humNum[i]);
        }
    }
}
