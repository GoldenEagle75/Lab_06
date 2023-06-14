import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CtoFConverter.main(args);
        FuelCosts.main(args);
        RectangleInfo.main(args);
        MetricConverter.main(args);
        HighorLow.main(args);
    }
}

class CtoFConverter {
    public static void main(String[] args) {
        double CelsiusTemp = 0;
        double FahrenheitTemp = 0;
        boolean done = false;
        String trash = "";
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter the temperature you wish to convert from Celsius to Fahrenheit: ");
            if (in.hasNextDouble()){
                done = true;
                CelsiusTemp = in.nextDouble();
                FahrenheitTemp = CelsiusTemp * 1.8 + 32;
                System.out.println(CelsiusTemp + " degrees in Celsius is equal to " + FahrenheitTemp + " degrees Fahrenheit.");
            }
            else {
                trash = in.nextLine();
                System.out.println("Enter a valid temperature, not " + trash + ".");
            }
        }while (!done);
    }
}
class FuelCosts {
    public static void main(String[] args){
        double tankGallons = 0;
        double fuelEfficiency = 0;
        double gasPrice = 0;
        double costForHundred = 0;
        double maxDistance = 0;
        boolean done = false;
        String trash = "";
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("How many gallons are in the tank? ");
            if (in.hasNextDouble()){
                tankGallons = in.nextDouble();
                done = true;
                System.out.println("You said you have " + tankGallons + " gallons in the tank.");
            }
            else {
                trash = in.nextLine();
                System.out.println("Enter a valid value, not " + trash + ".");
                System.out.println("Try again.");
            }
        }while (!done);

        done = false;
        in.nextLine();

        do {
            System.out.print("What is the fuel efficiency in miles per gallon? ");
            if (in.hasNextDouble()){
                fuelEfficiency = in.nextDouble();
                done = true;
                System.out.println("You said that you have a fuel efficiency of " + fuelEfficiency + " miles per gallon.");
            }
            else {
                trash = in.nextLine();
                System.out.println("Enter a valid value, not " + trash + ".");
                System.out.println("Try again.");
            }
        }while (!done);

        done = false;
        in.nextLine();

        do {
            System.out.print("What is the price of gas per gallon? ");
            if (in.hasNextDouble()){
                gasPrice = in.nextDouble();
                done = true;
                System.out.println("You said the gas price is $" + gasPrice + " per gallon.");
            }
            else {
                trash = in.nextLine();
                System.out.println("Enter a valid value, not " + trash + ".");
                System.out.println("Try again.");
            }
        }while (!done);

        //costForHundred = 100 * gasPrice;
    }
}

class RectangleInfo {
    public static void main(String[] args){
        System.out.println("rectangle info");
    }
}

class MetricConverter {
    public static void main(String[] args){
        System.out.println("Metric Converter");
    }
}

class HighorLow {
    public static void main(String[] args){
        System.out.println("High or low");
    }
}