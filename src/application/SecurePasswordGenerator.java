package application;

import java.util.Random;
import java.util.Scanner;

public class SecurePasswordGenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        Random random = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*()_-+=?";

        System.out.println("Quantos caracteres você quer na sua senha ? ");
        int tamanho = sc.nextInt();

        String senha = "";
        for (int i = 0; i<tamanho; i++){
            int index = random.nextInt(caracteres.length());
            senha += caracteres.charAt(index);
        }
        System.out.println("\n Sua senha gerada: " + senha);
        System.out.println("Guarde-a em um local seguro!");

        sc.close();
    }
}
