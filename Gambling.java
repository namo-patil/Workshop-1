package com.bridgelabz;

public class Gambling {
    /* UC1- as a gambler, would start with a stake of $100
        every day and bet $1 every game
     */
    public static final int STAKE = 100;
    public static final int BETS = 1;

    int winLimit = 150;
    int loseLimit = 50;
    int winCount;
    int loseCount;

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulation Program");
        Gambling Gambler = new Gambling();
        //Gambler.winOrLose();
        //Gambler.gamblerResign();
        Gambler.calTotalAmountWonOrLostIn20Days();
    }

    /* UC2- As a Gambler make $1 bet so either win or
    loose $1
     */
    public boolean winOrLose() {
        boolean randomCheck = (Math.random() > 0.5);
        if (randomCheck)
            System.out.println("Gambler is Won");
        else
            System.out.println("Gambler Lost");
        return randomCheck;
    }

    /* UC3- As a Calculative Gambler if won or lost 50% of
    the stake, would resign for the day
    Note- winLimit and looseLimit are equal to 50% of STAKE
     */
    public int gamblerResign() {
        int stake = 100;
        while (stake < winLimit && stake > loseLimit) {
            if (winOrLose()) {
                stake = stake + 1;
                System.out.println(stake + " ");
                winCount++;
            } else {
                stake = stake - 1;
                System.out.println(stake + " ");
                loseCount++;
            }
        }
        System.out.println("Stake : " + stake + " ");
        System.out.println(" 'GAMBLER RESIGNED FOR THE DAY.' ");
        System.out.println();
        return stake;
    }

    /* UC4- After 20 days of playing every day would like to know
        the total amount won or lost.
     */
    public void calTotalAmountWonOrLostIn20Days() {
        int num_Playing_Days = 20;
        int winCount_20days = 0;
        int  loseCount_20days = 0;
        int countCheck = 0;

        for (int day = 1; day <= num_Playing_Days; day++) {
            countCheck = gamblerResign();

            if (countCheck == winLimit) {
                winCount_20days++;
            } else {
                loseCount_20days++;
            }
            System.out.println("===*****=====*****=====Day " + day + " Done=====*****=====*****===");
        }
        System.out.println();
        System.out.println("=====After 20 Days of playing every day=====");
        System.out.println("Gambler Won Days : " + winCount_20days);
        System.out.println("Gambler Lost Days : " + loseCount_20days);
        System.out.println();
        int totalAmountWon = winCount;
        int totalAmountLost = loseCount;
        System.out.println("Total amount Won: " + totalAmountWon);
        System.out.println("Total amount Lost: " + totalAmountLost);
    }
}




