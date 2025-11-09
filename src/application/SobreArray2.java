package application;

import java.util.Scanner;
import java.util.Locale;
import entities.ProductArray;

public class SobreArray2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        ProductArray[] vect = new ProductArray[n];

        for (int i=0; i< vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            Double price = sc.nextDouble();
            vect[i] = new ProductArray(name , price);

        }
        double sum = 0.0;
        for (int i=0; i< vect.length; i++){
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;
        System.out.printf("AVERAGE PRICE = %.2f%n", avg);
    }

}
