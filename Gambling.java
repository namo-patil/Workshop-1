package com.bridgelabz;

public class Gambling {
    public static final int STAKE = 100;
    public static final int BETS = 1;

    public boolean winOrLoose() {
        boolean randomCheck = (Math.random() < 0.5);
        if (randomCheck)
            System.out.println("Gambler is Won");
        else
            System.out.println("Gambler Lost");
        return randomCheck;
    }

    public int playGame(int winLimit, int loseLimit) {
        //winLimit and looseLimit are 50% of STAKE
        int stake = 100;
        while (stake < winLimit && stake > loseLimit) {
            if (winOrLoose()) {
                stake = stake + 1;
                System.out.println(stake + " ");
            } else  {
                stake = stake - 1;
                System.out.println(stake + " ");
            }
        }
        System.out.println("Gambler will resign for the day");
        return stake;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulation Program");
        Gambling Gambler = new Gambling();
        Gambler.playGame(150,50);
    }
}

