package com.snakeandladder;

// Repeat till the Player
//reaches the winning
//position 100.
//using inheritence extending class SnakeLadderUC3

public class SnakeLadderUC4 extends SnakeLadderUC3{

   // Getting final position
    public void FinalPosition()
  {
    while(position<100)
    {
            Dieroll();
            Option();
       }
    }


    public static void main(String[] args) {


  SnakeLadderUC4 obj = new SnakeLadderUC4();
  obj.Dieroll();
  obj.Option();
  obj.FinalPosition();

}
}

