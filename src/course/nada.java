package course;

import java.util.Scanner;

public class nada {

    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.println("Me informe sua idade: " );
        int idade = sc.nextInt();
        sc.nextLine();

        if( idade >= 18){
            System.out.println("Pode entrar na festa! " );

        }            else{
            System.out.print("Você tem autorização para entrar na festa? Sim/Não");
            String autorizacao = sc.nextLine();

            if( autorizacao.equalsIgnoreCase( "Sim") || autorizacao.equalsIgnoreCase("S")){
                System.out.println("Pode entrar na festa, verifiquei sua autorização e estar liberado! ");

            }           else{
                System.out.println("Não pode entrar na festa pois você não tem autorização");
            }
        }
        sc.close();
    }
}