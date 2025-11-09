package application;

import java.util.Scanner;
import java.util.Random;

public class SecretNumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int tentativas = 0;
        int limiteTentativas = 10;
        int pontos = 100;

        System.out.println("===========================================");
        System.out.println("Bem-vindo ao Jogo de Adivinhaçao - Modo Kleslley!");
        System.out.println("Tente adivinhar um numero secreto entre 1 e 100!");
        System.out.println("Voce tem " + limiteTentativas + " tentativas. Boa sorte!");
        System.out.println("===========================================");

        while (true) {
            System.out.print("\nSeu palpite: ");
            int palpite = sc.nextInt();
            tentativas++;

            if (palpite == numeroSecreto) {
                System.out.println("\nAcertou! Parabens!");
                System.out.println("Voce precisou de " + tentativas + " tentativas.");
                System.out.println("Sua pontuacao final: " + pontos);
                break;
            } else if (palpite < numeroSecreto) {
                System.out.println("Dica: o numero secreto e MAIOR.");
            } else {
                System.out.println("Dica: o numero secreto e MENOR.");
            }

            pontos -= 10;

            if (tentativas == limiteTentativas) {
                System.out.println("\nFim de jogo! Suas tentativas acabaram.");
                System.out.println("O numero secreto era: " + numeroSecreto);
                System.out.println("Pontuacao final: " + pontos);
                break;
            }
        }

        System.out.println("\nValeu por jogar meu jogo! (IB) Kleslley Hezeckyas");
        System.out.print("Quer tentar de novo? (1 = sim / 2 = não): ");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.println("\nReinicie o jogo e tente superar sua pontuacao!");
        } else {
            System.out.println("\nFim. Ate a proxima!");
        }

        sc.close();
    }
}
