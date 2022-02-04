package com.nix;

import java.util.Scanner;

public class Main {

    public static double x;

    public static double fahrenheitToCel() {
        return ((x - 32) * 5.0 / 9.0);
    }

    public static double fahrenheitToKelvin() {
        double i = (((x - 32) * 5.0 / 9.0) + 273.15);
        return i;
    }

    public static double celsiusToFahrenheit() {
        return (x * (9.0 / 5.0) + 32);
    }

    public static double celsiusToKelvin() {
        return (x + 273.15);
    }

    public static double kelvinToFahrenheit() {
        return (((x - 273.15) * 9.0 / 5.0 + 32));
    }

    public static double kelvinToCelsius() {
        return (x - 273.15);
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

    System.out.print("Enter Value to Convert: ");
    x = sc.nextInt();

    System.out.println("Select What Operation Type");
    System.out.println("Press [1] for Fahrenheit");
    System.out.println("Press [2] for Celsius");
    System.out.println("Press [3] for Kelvin");

    String resp = sc.next();

    System.out.println("Select What Conversion");
    System.out.println("Press [1] for Fahrenheit");
    System.out.println("Press [2] for Celsius");
    System.out.println("Press [3] for Kelvin");

    String resp1 = sc.next();

    if(resp.equals("1") && (resp1.equals("1"))) {
        double v = 5.0 / 9.0;
        System.out.print(x + " Fahrenheit converted to Fahrenheit is: " + x);
        } else if (resp.equals("1") && (resp1.equals("2"))) {
        System.out.print(x + " Fahrenheit converted to Celsius is: " + fahrenheitToCel());
        } else if (resp.equals("1") && (resp1.equals("3"))) {
            System.out.print(x + " Fahrenheit converted to Kelvin is: " + fahrenheitToKelvin());
        } else if (resp.equals("2") && resp1.equals("1")) {
        System.out.print(x + " Celsius converted to Fahrenheit is: " + celsiusToFahrenheit());
        } else if (resp.equals("2") && resp1.equals("2")) {
        System.out.print(x + " Celsius converted to Celsius is: " + x);
        } else if (resp.equals("2") && resp1.equals("3")) {
        System.out.print(x + " Celsius converted to Kelvin is: " + celsiusToKelvin());
        } else if (resp.equals("3") && resp1.equals("1")) {
        System.out.print(x + " Kelvin converted to Fahrenheit is: " + kelvinToFahrenheit());
        } else if (resp.equals("3") && resp1.equals("2")) {
        System.out.print(x + "Kelvin converted to Celsius is: " + kelvinToCelsius());
        } else if (resp.equals("3") && resp1.equals("3")) {
        System.out.print(x + "Kelvin converted to Kelvin is: " + x);
        }
    }
}