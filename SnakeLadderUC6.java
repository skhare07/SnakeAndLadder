package com.snakeandladder;

public class SnakeLadderUC6 extends SnakeLadderUC5 {
public int counter=0;
    @Override
    public void Dieroll() {
        super.Dieroll();
        counter++;
        //System.out.println("Total Dice Roll "+counter);

    }

    public static void main(String[] args) {

        SnakeLadderUC6 obj = new SnakeLadderUC6();
        obj.Dieroll();
        obj.Option();
        obj.FinalPosition();

        System.out.println("Total Dice Roll "+obj.counter);
    }
}

