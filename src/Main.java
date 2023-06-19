import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //CtoFConverter.main(args);
        //FuelCosts.main(args);
        //RectangleInfo.main(args);
        MetricConverter.main(args);
        HighOrLow.main(args);
    }
}

class CtoFConverter {
    public static void main(String[] args) {
        double CelsiusTemp;
        double FahrenheitTemp;
        boolean done = false;
        String trash;
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
        double costForHundred;
        double maxDistance;
        boolean done = false;
        String trash;
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

        costForHundred = (100/fuelEfficiency) * gasPrice;
        System.out.printf("To go 100 miles would cost you $%.2f.%n", costForHundred);
        maxDistance = tankGallons*fuelEfficiency;
        System.out.printf("With " + tankGallons + " gallons in the tank you are able to travel %.2f miles.%n", maxDistance);
    }
}

class RectangleInfo {
    public static void main(String[] args){

        double rectangleHeight = 0;
        double rectangleWidth = 0;
        String trash;
        double rectangleArea;
        double rectanglePerimeter;
        double rectangleDiagonal;
        boolean done = false;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Enter the width: ");
            if (in.hasNextDouble()){
                rectangleWidth = in.nextDouble();
                done = true;
                System.out.println("You said the width was " + rectangleWidth + ".");
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
            System.out.print("Enter the height: ");
            if (in.hasNextDouble()){
                rectangleHeight = in.nextDouble();
                done = true;
                System.out.println("You said the height was " + rectangleHeight + ".");
            }
            else {
                trash = in.nextLine();
                System.out.println("Enter a valid value, not " + trash + ".");
                System.out.println("Try again.");
            }
        }while (!done);

        rectanglePerimeter = (rectangleWidth*2) + (rectangleHeight*2);
        rectangleArea = rectangleWidth*rectangleHeight;
        rectangleDiagonal = Math.sqrt((Math.pow(rectangleWidth, 2) + Math.pow(rectangleHeight, 2)));

        System.out.println("The perimeter is " + rectanglePerimeter + ".");
        System.out.println("The area is " + rectangleArea + ".");
        System.out.printf("The length of the diagonal is %.2f.%n", rectangleDiagonal);
    }
}

class MetricConverter {
    public static void main(String[] args){
        double metricMeasurement = 0;
        double inchesMeasurement = 0;
        double feetMeasurement = 0;
        double milesMeasurement = 0;
        boolean done = false;
        String trash = "";

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("What is the measurement, in meters? ");
            if (in.hasNextDouble()){
                metricMeasurement = in.nextDouble();
                done = true;
                inchesMeasurement = metricMeasurement * 39.3701;
                feetMeasurement = metricMeasurement * 3.28084;
                milesMeasurement = metricMeasurement * 0.000621371;
                System.out.printf(metricMeasurement + " meters is equal to %.2f inches, %.2f feet, and %.2f miles.%n", inchesMeasurement, feetMeasurement, milesMeasurement);
            }
            else {
                trash = in.nextLine();
                System.out.println("Enter a valid value, not " + trash + ".");
            }
        }while (!done);
    }
}

class HighOrLow {
    public static void main(String[] args){
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        String trash = "";
        int randomNumber = random.nextInt(1, 10);
        int userGuess = 0;
        boolean done = false;
        System.out.println("I have chosen a random number between 1 and 10, inclusive.");
        do {
            System.out.print("What is my secret number? ");
            if (in.hasNextInt()){
                userGuess = in.nextInt();

                if (0 < userGuess && userGuess <= 10){
                    System.out.println("You guessed " + userGuess + ".");
                    done = true;

                    System.out.println("The number was " + randomNumber + ".");
                    if (userGuess > randomNumber) {System.out.println("Your guess was greater than the number I was thinking of.");}
                    else if (userGuess < randomNumber) {System.out.println("Your guess was less than the number I was thinking of.");}
                    else {System.out.println("You guessed my number!");}
                }
                else {
                    System.out.println("Enter a valid number between 1 and 10, not " + userGuess + ".");
                    System.out.println("Try again.");
                }
            }
            else {
                in.nextLine();
                trash = in.nextLine();
                System.out.println("Enter a valid number between 1 and 10, not " + trash + ".");
                System.out.println("Try again.");
            }
        } while (!done);

    }
}