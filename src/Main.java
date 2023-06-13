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
        System.out.println("Fuel Costs");
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