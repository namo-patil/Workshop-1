package com.bridgelabz;

public class Gambling {
    /* UC1- as a gambler, would start with a stake of $100
        every day and bet $1 every game
     */
    public static final int STAKE = 100;
    public static final int BETS = 1;

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulation Program");
        Gambling Gambler = new Gambling();
        Gambler.winOrLoose();
        Gambler.gamblerResign();
        Gambler.calTotalAmountWonOrLost();
    }

    /* UC2- As a Gambler make $1 bet so either win or
    loose $1
     */
    public boolean winOrLoose() {
        boolean randomCheck = (Math.random() < 0.5);
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
        int winLimit = 150;
        int looseLimit = 50;
        while (stake < winLimit && stake > looseLimit) {
            if (winOrLoose()) {
                stake = stake + 1;
                System.out.println(stake + " ");
            } else {
                stake = stake - 1;
                System.out.println(stake + " ");
            }
        }
        System.out.println("Gambler has resigned for the day.");
        return stake;
    }

    /* UC4- After 20 days of playing every day would like to know
        the total amount won or lost.
     */
    public void calTotalAmountWonOrLost() {
        int num_Playing_Days = 20;
        int winLimit = 150;
        int looseLimit = 50;
        int winCount = 0;
        int loseCount = 0;
        for (int day = 0; day < num_Playing_Days; day++) {
            int count = gamblerResign();
            if (count == winLimit) {
                winCount++;
            } else {
                loseCount++;
            }
        }
        int totalAmountWon = +winCount;
        int totalAmountLost = +loseCount;
        System.out.println("=====After 20 Days of playing every day=====");
        System.out.println("Gambler Won Total Amount: $" + totalAmountWon);
        System.out.println("Gambler Lost Total Amount: $" + totalAmountLost);
    }
}

