package org.example._2024_06_13;

public class StartLottery {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        int countUser = Utils.getCountUsers();
        int[] winNum = Utils.getLuckyNumbers();
        int[][] humNum = new int[countUser][Constant.COUNT_SET_SIZE];
        for (int i = 0; i < countUser; i++) {
            humNum [i] = Utils.getUserNumbers();
        }
        for (int i = 0; i < countUser; i++) {
            lottery.runLottery(winNum, humNum[i]);
        }
    }
}
