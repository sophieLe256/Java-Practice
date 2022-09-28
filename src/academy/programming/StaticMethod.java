package academy.programming;

public class StaticMethod {
    public static void main (String [] args){
        boolean gameOver = true;
        int score = 5;
        int levelCompleted = 8;
        int bonus = 100;
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println();
        score = 10000;
        levelCompleted = 10;
        bonus = 200;
        calculateScore(gameOver, score, levelCompleted, bonus);

        System.out.println();
        int newScore = calScore("Tim", 500);
        System.out.println("New score is " + newScore);
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was: " + finalScore);
            return finalScore;
        } else {
            return -1;
        }

    }

    public static int calScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score);
        return score * 1000;
    }


}
