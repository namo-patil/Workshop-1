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
        //Gambler.calTotalAmountWonOrLostIn20Days();
        //Gambler.daysWonOrLostByHowMuchInMonth();
        //Gambler.luckiestOrUnluckiestDay();
        Gambler.checkForNextMonthPlayOrStop();
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
            } else {
                stake = stake - 1;
                System.out.println(stake + " ");
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
        int loseCount_20days = 0;


        for (int day = 1; day <= num_Playing_Days; day++) {
            int countCheck = gamblerResign();

            if (countCheck == winLimit) {
                winCount_20days++;
                System.out.println("Total amount won : " + countCheck);
            } else {
                loseCount_20days++;
                System.out.println("Total amount lost : " + countCheck);
            }
            System.out.println("===*****=====*****=====Day " + day + " Done=====*****=====*****===");
        }
        System.out.println();
        System.out.println("=====After 20 Days of playing every day=====");
        System.out.println("Gambler Won Days : " + winCount_20days);
        System.out.println("Gambler Lost Days : " + loseCount_20days);
        System.out.println();
    }

    /* UC-5 Each month would like to know the days won and lost
    and by how much.
     */
    public void daysWonOrLostByHowMuchInMonth() {
        int num_of_Days_In_Month = 30;
        int winCount_30days = 0;
        int loseCount_30days = 0;
        int wonBy = 0;
        int lostBy = 0;
        int stake = 100;

        for (int day = 1; day <= num_of_Days_In_Month; day++) {
            int countCheck = gamblerResign();
            if (countCheck == winLimit) {
                winCount_30days++;
                wonBy = countCheck - stake;
            } else {
                loseCount_30days++;
                lostBy = countCheck - stake;
            }
            System.out.println("===*****=====*****=====Day " + day + " Done=====*****=====*****===");
            System.out.println();
        }
        System.out.println("=====In a Month (30-days)=====");
        System.out.println("Gambler won days: " + winCount_30days);
        System.out.println("Gambler lost days: " + loseCount_30days);
        System.out.println("Gambler won by :" + wonBy);
        System.out.println("Gambler lost by: " + lostBy);
    }

    /* UC-6 Would also like to know my luckiest day and
       unluckiest day
     */
    public void luckiestOrUnluckiestDay() {
        int num_of_Days_In_Month = 30;
        int winCount_30days = 0;
        int loseCount_30days = 0;

        for (int day = 1; day <= num_of_Days_In_Month; day++) {
            int countCheck = gamblerResign();
            if (countCheck == winLimit) {
                winCount_30days++;
                int luckiestDay = day;
                System.out.println("<--------------Luckiest day : " + luckiestDay + "----------------->");
            } else {
                loseCount_30days++;
                int unluckiestDay = day;
                System.out.println("<--------------Unluckiest day : " + unluckiestDay + "----------------->");
            }
        }
        System.out.println();
        System.out.println("======IN MONTH LUCKIEST OR UNLUCKIEST DAYS======");
        System.out.println("Luckiest Days : " + winCount_30days);
        System.out.println("Unluckiest Days : " + loseCount_30days);
    }

    /* UC-7 If won would like to continue playing next month or
    stop Gambling
     */
    public void checkForNextMonthPlayOrStop() {
        int num_of_Days_In_Month = 30;
        int luckiestDay = 0;
        int unluckiestDay = 0;

        // Same from UC-6
        for (int day = 1; day <= num_of_Days_In_Month; day++) {
            int countCheck = gamblerResign();
            if (countCheck == winLimit) {
                luckiestDay = day;
                luckiestDay++;
                System.out.println("--------------Luckiest day : " + luckiestDay + "-----------------");
            } else {
                unluckiestDay++;
                unluckiestDay = day;
                System.out.println("--------------Unluckiest day : " + unluckiestDay + "-----------------");
            }
        }
        System.out.println();
        System.out.println("======IN MONTH LUCKIEST OR UNLUCKIEST DAYS======");
        System.out.println("Luckiest Days : " + luckiestDay);
        System.out.println("Unluckiest Days : " + unluckiestDay);

        if (luckiestDay > unluckiestDay)
            System.out.println("Gambler would like to play continue in next month");
        else
            System.out.println("Stop Gambling");
    }
}




