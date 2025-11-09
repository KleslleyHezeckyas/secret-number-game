package course;

import java.util.Scanner;

public class festinhaMassa{

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual sua idade?: ");
        int idade;
        idade = sc.nextInt();
        sc.nextLine();

        if (idade >= 18){
            System.out.println("Pode entrar na festa " );
        }else{
            System.out.println("Você tem autorização para entrar na festa? Sim/Não");
            String autorizacao = sc.nextLine();

            if(autorizacao.equalsIgnoreCase("Sim") || autorizacao.equalsIgnoreCase("S")){
                System.out.println("Pode entrar na festa, acabei de verificar sua autorização! ");
            }else{
                System.out.println("Não pode entrar por quê você não tem autorização.");
            }
        }

                 sc.close();

    }
}