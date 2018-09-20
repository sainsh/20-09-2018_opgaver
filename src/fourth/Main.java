package fourth;

import java.sql.SQLOutput;

public class Main {



    public static void main(String[] args) {
        int x,z,y, h=1;
        System.out.println("a     a^2     a^3     a^4");
        for (int i = 0; i < 4; i++) {

            x=h*h;
            y=h*h*h;
            z=h*h*h*h;
            System.out.println(h + "     " + x + "       " + y + "       " + z);
            h++;
        }
    }
}
