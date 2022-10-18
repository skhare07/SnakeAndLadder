package com.snakeandladder;

//Using inheritence Extending SnakeLadderUC2

public class SnakeLadderUC3 extends SnakeLadderUC2 {
    int position = 0;
    int option;
    int Ladder = 1;
    int Snake = 2;
    int NoPlay = 0;

    // Checking option Ladder , Snake or Noplay
    public void Option() {

        //checking random
        min = 0;
        max = 2;
        option = (int) (Math.random() * (max - min + 1) + min);


            //checking conditions(option)
            if (option == Ladder) {
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
    //Creating object of SnakeLadderUC3
    SnakeLadderUC3 obj = new SnakeLadderUC3();

    //Printing Result
    obj.Dieroll();
    obj.Option();

    }
}
