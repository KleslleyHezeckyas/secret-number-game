package primeiro;

import java.util.Scanner;
public class EstruturaCondicional {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        int hora;
        System.out.println("Que horas são?");
        hora = sc.nextInt();

        if (hora >= 5) {
            System.out.println("Bom dia Flor Do Amanhecer!");
        }
        else {
            if(hora >= 4){
                System.out.println("Vai pra la vai");
                 }
            else{
                System.out.println("ox, vai dormir porra");

            }

        }


        sc.close();
    }
}
