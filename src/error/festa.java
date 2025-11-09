package error;

import java.util.Scanner;

public class festa{

    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Me infome sua idade e seu nome: ");
        int idade = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();

        if(idade >= 18){
            System.out.println(name + " pode entrar na festa, QSL!");
        }else{
            System.out.println(name + " você tem autorização para entrar na festa? Sim/Não");
            String autorizacao = sc.nextLine();

       if (autorizacao.equalsIgnoreCase("Sim") || autorizacao.equalsIgnoreCase("S")){
           System.out.println("Pode entrar na festa, acabei de verificar sua autorização");
       }else{
           System.out.println("Você não tem autorização, não pode entrar na festa");
       }
        }
    }
}