package com.example.whichnumberisbigger;

public class BiggerNumberGame {
    private int nu1;
    private int nu2;
    private int score;
    private int lowerLimit;
    private int upperLimit;

    public BiggerNumberGame(int lowerLimit, int upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    public void generateRandomNumbers() {
        nu1 = (int)((Math.random() * upperLimit+1) + lowerLimit);
        nu2 = (int)((Math.random() * upperLimit+1) + lowerLimit);
        if(nu2 == nu1){
            nu1 += (int)((Math.random() * upperLimit+1) + lowerLimit);
            nu2 -= (int)((Math.random() * upperLimit+1) + lowerLimit);

        }
        setNu1(nu1);
        setNu2(nu2);
    }

    public String checkAnswer(int answer) {
    int correctAnswer = Math.max(nu1,nu2);
    if (answer == correctAnswer){
        score++;
        setScore(score);
        return "You can do basic maf YAY, your score is " + score;}

    else {
        score--;
        setScore(score);
        return "You IDIOT HOW DO YOU GET THIS QUESTION WRONG, your score is " + score;
        }


    }
    public int getNu1() {
        return nu1;
    }

    public void setNu1(int nu1) {
        this.nu1 = nu1;
    }

    public int getNu2() {
        return nu2;
    }

    public void setNu2(int nu2) {
        this.nu2 = nu2;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(int lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }
}
