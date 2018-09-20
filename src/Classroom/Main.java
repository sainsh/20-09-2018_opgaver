package Classroom;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("input radius of circle");
        double radius = in.nextInt();
        System.out.println("radius: " + radius);

        System.out.println("calculating area...");

        double area = radius * radius * Math.PI;

        System.out.println("The area of the circle of radius: " +radius + " is " + area);

        

    }

}

class Studernede {

            public String navn;
            public int alder;


        }