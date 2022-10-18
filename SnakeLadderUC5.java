package com.snakeandladder;

public class SnakeLadderUC5 extends SnakeLadderUC4 {

    public void Option() {

        int option;

        //checking random
        int Ladder = 1;
        int Snake = 2;
        int NoPlay = 0;

        min = 0;
        max = 2;
        option = (int) (Math.random() * (max - min + 1) + min);


        //checking conditions(option)
        if ((option == Ladder) && (dieRoll+position <= 100)) {
            position += dieRoll;
            System.out.println("Ladder");

        }
        else if (option == Snake) {
            position -= dieRoll;
            System.out.println("Snake");
        }
        else {
            position = position;
            System.out.println("No PLay");

        }

        if (position < 0) {
            position = 0;
        }

        System.out.println("Player is at Position : " +position);

    }

    public static void main(String[] args) {


        SnakeLadderUC5 obj = new SnakeLadderUC5();
        obj.Dieroll();
        obj.Option();
        obj.FinalPosition();

    }
}

