package com.snakeandladder;
//The Player rolls the die
//to get a number between 1 to 6

public class SnakeLadderUC2 {
    public int min , max  ;
    public int dieRoll;

    // Rolling Dice to get a random score between 1 to 6
    public void Dieroll()
    {
         min=1 ; max = 6 ;
        dieRoll= (int)(Math.random()*(max-min+1)+min);
        System.out.println("Player got : "+dieRoll);
    }


    public static void main(String[] args) {
        SnakeLadderUC2 obj = new SnakeLadderUC2();

        //Printing result
        obj.Dieroll();

    }
}
