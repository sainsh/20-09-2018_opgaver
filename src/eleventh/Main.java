package eleventh;

public class Main {

    public static void main(String[] args) {

        double population = 312032486;
        double birthrate = 1.0/7.0;
        double deathrate = 1.0/13.0;
        double imigrationrate= 1.0/45.0;

        double secondsInAYear = 365.0*24*60*60;

        double growthrate = (birthrate-deathrate+imigrationrate)*secondsInAYear;

        System.out.println(population + " " + birthrate + " " + deathrate + " " + imigrationrate + " " + secondsInAYear + " " + growthrate);

        for(int i = 0; i<5; i++){

            population = population+growthrate;
            System.out.println(((int) population));


        }

    }

}
