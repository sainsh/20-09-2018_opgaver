package Promo;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Dice dice = new Dice();
        Board board = new Board();
        Player player1 = new Player();
        Player player2 = new Player();
        Scanner in = new Scanner(System.in);
        int tur = 1;
        int roll;



        while(true){

            System.out.println("Tur: " + tur + "; Spiller 1, du har " + player1.getMoney()+ "kroner");

            System.out.println("klar?");
            //in.next();

            roll = dice.rollDice();
            System.out.print("du rullede: " + roll + "; du lander på felt: ");

            if((roll+player1.getSpace()) >19 ){
                player1.setSpace(roll+player1.getSpace()-20);
            }else{
                player1.setSpace(roll+player1.getSpace());
            }
            System.out.println(player1.getSpace()+1);

            System.out.println("det betyder: " + board.getLocation(player1.getSpace()) + ", " + board.getOutcome(player1.getSpace()));

            player1.setMoney(board.getOutcome(player1.getSpace()));

            System.out.println("du har nu " + player1.getMoney() + "kroner");

            if(player1.getMoney() < 0){
                System.out.println("player 1 har tabt, player 2 vinder");
                break;
            }

            System.out.println();
//---------------------------------------------------------------------------------------------------------------
            System.out.println("Tur: " + tur + "; Spiller 2, du har " + player2.getMoney()+ "kroner");

            System.out.println("klar?");
            //in.next();

            roll = dice.rollDice();
            System.out.print("du rullede: " + roll + "; du lander på felt: ");

            if((roll+player2.getSpace()) >19 ){
                player2.setSpace(roll+player2.getSpace()-20);
            }else{
                player2.setSpace(roll+player2.getSpace());
            }
            System.out.println(player2.getSpace()+1);

            System.out.println("det betyder: " + board.getLocation(player2.getSpace()) + ", " + board.getOutcome(player2.getSpace()));

            player2.setMoney(board.getOutcome(player2.getSpace()));

            System.out.println("du har nu " + player2.getMoney() + "kroner");

            if(player2.getMoney() < 0){
                System.out.println("player 2 har tabt, player 1 vinder");
                break;
            }

            System.out.println();
            tur++;
        }




    }
}
