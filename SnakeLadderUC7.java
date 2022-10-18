package com.snakeandladder;

public class SnakeLadderUC7 extends SnakeLadderUC6 {
    int PLAYER1=1, PLAYER2=2, player=PLAYER1, player1position,player2position;

    public void Dieroll()
    {
        min=1 ; max = 6 ;
        dieRoll= (int)(Math.random()*(max-min+1)+min);

    }


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
        }
        else if (option == Snake) {
            position -= dieRoll;
        }
        else {
            position = position;
        }

        if (position < 0) {
            position = 0;
        }

        if(player==PLAYER1){
            player1position=position;
        }else if(player==PLAYER2)
        {
            player2position=position;
        }
}
    public void PlayerChange()
{
    if (player == PLAYER1) {
        if ((option == Snake) || (option == NoPlay)) {
            player = PLAYER2;
        }
    } else if (player == PLAYER2) {
        if ((option == Snake) || (option == NoPlay)) {
            player = PLAYER1;
        }
    }
}
    public void WinnerPlayer() {
        if (player1position == 100) {
            System.out.println("Player One Wins");
        } else {
            System.out.println("Player Two Wins");
        }
}


    public static void main(String[] args) {

        SnakeLadderUC7 obj = new SnakeLadderUC7();
        while((obj.player1position<100) && (obj.player2position<100)) {
           obj.Dieroll();
           obj.Option();
           obj.PlayerChange();
        }
        System.out.println("PLayer 1 Position : "+obj.player1position);
        System.out.println("PLayer 2 Position : "+obj.player2position);

        obj.WinnerPlayer();
    }
}

