package com.bridgelabz;

public class Gambling {
    public static final int STAKE = 100;
    public static final int BETS = 1;

    public void winOrLoose() {
        boolean randomCheck = (Math.random() < 0.5);
        if (randomCheck)
            System.out.println("Gambler is Won");
        else
            System.out.println("Gambler Lost");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulation Program");
        Gambling Gambler = new Gambling();
        Gambler.winOrLoose();
    }
}

