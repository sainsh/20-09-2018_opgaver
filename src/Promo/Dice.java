package Promo;
import java.util.*;

public class Dice {

    Random die;
    int roll;

    public Dice(){

        die = new Random();

    }

    public int rollDice(){

        roll = 0;
        roll = die.nextInt(6) + die.nextInt(6)+2;

        return roll;
    }
}
