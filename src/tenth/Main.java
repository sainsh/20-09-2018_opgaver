package tenth;

public class Main {

    public static void main(String[] args) {
        double distance=15;
        double time= 50.5;
        double distancceInMiles = distance/1.6;
        double speed = distancceInMiles / (time/60);

        System.out.println(speed+ " miles/h");
    }
}
