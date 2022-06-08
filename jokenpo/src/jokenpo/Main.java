package jokenpo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int jogador, computador;
		Scanner teclado = new Scanner(System.in);
		System.out.println("_____Jokenpo____");
		System.out.println("");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.println("4. Lagarto");
		System.out.println("5. Spock");
		System.out.println("Digite a opcao desejada: ");

		jogador = teclado.nextInt();
		switch (jogador) {

		case 1:
			System.out.println("Jogador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Jogador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Jogador escolheu TESOURA");
			break;
		case 4:
			System.out.println("Jogador escolheu LAGARTO");
			break;
		case 5:
			System.out.println("Jogador escolheu SPOCK");
			break;
		default:
			System.out.println("opcao invalida!");
			break;
		}
		computador = (int) (Math.random() * 5 + 1);
		teclado.close();
		switch (computador) {

		case 1:
			System.out.println("Computador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Computador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Computador escolheu TESOURA");
			break;
		case 4:
			System.out.println("Computador escolheu LAGARTO");
			break;
		case 5:
			System.out.println("Computador escolheu SPOCK");
			break;
		}

	}

}
