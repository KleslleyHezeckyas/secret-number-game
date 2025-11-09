package course;

import java.sql.SQLOutput;
import java.util.Scanner;

public class teste{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o seu nome?: ");
        String nome = sc.nextLine();

        int idade = 0;
        boolean idadeValida = false;

        while (!idadeValida){
            System.out.println("Informe sua idade: ");
            if(sc.hasNextInt()){
                idade = sc.nextInt();
                idadeValida = true;

            }else {
                System.out.println("Por favor, digite um numero valido ");
                sc.nextLine();
            }
        }
            sc.nextLine();

        if(idade >=18 ){
            System.out.println(nome + "Você pode entrar na festa!");
        }else {
            String autorizacao = "";
            boolean respostaValida = false;


         while(!respostaValida){
             System.out.print(" Você tem autorização dos pais? (Sim/Não): ");
             autorizacao = sc.nextLine().trim();

             if(autorizacao.equalsIgnoreCase("Sim") || autorizacao.equalsIgnoreCase("S")) {
                 System.out.println(nome + " Você pode entrar com autorização!");
                 respostaValida = true;

             }else if (autorizacao.equalsIgnoreCase("Mão") || autorizacao.equalsIgnoreCase("N")){
                 System.out.println(nome + "Você não pode entrar sem autorização");
                 respostaValida = true;

             }else{
                 System.out.println("Resposta valida, digite Sim ou Não");
         }
            }
        }
        sc.close();
    }

}

