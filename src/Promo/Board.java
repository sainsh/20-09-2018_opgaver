package Promo;


public class Board {

    Space[] board = new Space[20];

    public Board(){


        board[0]= new Space("Start",100);
        board[1]= new Space("mindre uheld", -20);
        board[2]= new Space("findeløn", 20);
        board[3]= new Space("betal til skat",-40);
        board[4]= new Space("tilbage betaling fra skat",40);
        board[5]= new Space("bil ulykke",-80);
        board[6]= new Space("jule gratiale", 80);
        board[7]= new Space("fri parkering", 0);
        board[8]= new Space("ferie dag", 0);
        board[9]= new Space("resturant besøg", -20);
        board[10]= new Space("lønnings dag", 50);
        board[11]= new Space("månedens medarbejder", 30);
        board[12]= new Space("degradering", -30);
        board[13]= new Space("ny hund", -10);
        board[14]= new Space("nyt køkken", -40);
        board[15]= new Space("lotto gevinst", 80);
        board[16]= new Space("sort arbejde", 60);
        board[17]= new Space("sort arbejde blev opdaget", -120);
        board[18]= new Space("fundraiser", -100);
        board[19]= new Space("arbejdsmarkedsbidrag", -20);

    }

    public String getLocation(int space){

        return board[space].getText();
    }

    public int getOutcome(int space){
        return board[space].getOutcome();
    }
}
