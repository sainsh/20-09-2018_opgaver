package Promo;

public class Player {

    int space;



    int money;

    public Player(){
        space = 0;
        money = 1000;

    }

    public void setSpace(int space) {
        this.space = space;
    }

    public void setMoney(int money) {
        this.money += money;
    }

    public int getSpace() {
        return space;
    }

    public int getMoney() {
        return money;
    }

}
