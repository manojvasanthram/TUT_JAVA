package com.mvr;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int in_main;
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        in_main = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("in main " + in_main);

        gameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        in_main = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("in main " + in_main);

        int pos;

        pos = calculateHighScorePosition(1500);
        displayHighScorePosition("A",pos);
        pos = calculateHighScorePosition(900);
        displayHighScorePosition("B",pos);
        pos = calculateHighScorePosition(400);
        displayHighScorePosition("C",pos);
        pos = calculateHighScorePosition(50);
        displayHighScorePosition("D",pos);

    }

    public static int calculateScore(
            boolean gameOver,
            int score,
            int levelCompleted,
            int bonus
    ) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        else
            return -1;

    }

    public static int calculateHighScorePosition(
            int finalScore
    ){
        if (finalScore > 1000)
            return 1;
        else if ((finalScore > 500 ) && (finalScore < 1000))
            return 2;
        else if (finalScore > 100)
            return 3;
        else return 4;
    }

    public static void displayHighScorePosition(
            String playername,
            int position
    ){
        System.out.println("Player name - " + playername + " position - " + position);
    }
}
