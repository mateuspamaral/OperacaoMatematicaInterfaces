package br.com.digitalhouse;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Integer numA;
            Integer numB;
            Integer option;
            Scanner scanner = new Scanner(System.in);
            Soma soma = new Soma();
            Subtracao subtracao = new Subtracao();
            Divisao divisao = new Divisao();
            Multiplicacao multiplicacao = new Multiplicacao();

            System.out.println("Digite um número:");
            numA = scanner.nextInt();

            System.out.println("Digite outro número:");
            numB = scanner.nextInt();

            System.out.println("O que deseja fazer com os números " + numA + " e " + numB + "?" +
                    "\n1 - Soma" +
                    "\n2 - Subtração" +
                    "\n3 - Divisão" +
                    "\n4 - Multiplicação" +
                    "\n5 - Sair");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println(soma.calcula(numA, numB));
                    break;
                case 2:
                    System.out.println(subtracao.calcula(numA, numB));
                    break;
                case 3:
                    System.out.println(divisao.calcula(numA, numB));
                    break;
                case 4:
                    System.out.println(multiplicacao.calcula(numA, numB));
                    break;
                case 5:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
    }
}
