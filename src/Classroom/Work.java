package Classroom;

import java.util.Scanner;

public class Work {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.print("Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double average = (number1 + number2 + number3) / 3;

        System.out.println("The average of: " + number1 + " " + number2 + " " + number3 + " is " + average);


        //2.2

        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();

        // 5a gives inputMismatchException

        double radius = input.nextDouble();

        //2.3

        //yes import java.util.Scanner is a much smaller package to import
        // than java.util.* since the latter is everything in java.util
    }
}
