package Promo;

public class Space {

    String text;
    int outcome;

    public Space(String text, int outcome){
        this.text = text;
        this.outcome = outcome;
    }

    public String getText(){
        return text;
    }
    public int getOutcome(){
        return outcome;
    }

}
