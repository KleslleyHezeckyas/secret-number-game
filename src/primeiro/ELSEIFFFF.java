package primeiro;

import java.util.Scanner;

public class ELSEIFFFF {

    public static void main (String []args ) {

        Scanner sc = new Scanner (System.in);


        int idade;
        idade = sc.nextInt();

        if (idade >= 18){

            System.out.println("Pode entrar na festa!");

        }
        else { if ( idade >= 17){
            System.out.println("Não pode entrar na festa!");
        }
        else{
            System.out.println("De forma alguma deve entrar na festa!");
        }

        }
        sc.close();

    }

}