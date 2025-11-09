package util;

public class Calculator {

    public static final double IOF = 0.06;

    public static double dollarToReal(double dollarPrice, double amount) {
        double total = dollarPrice * amount;
        return total + total * IOF;
    }
}
