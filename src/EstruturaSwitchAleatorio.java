import java.util.Random;
import java.util.Scanner;

public class EstruturaSwitchAleatorio {

	public static void main(String[] args) {
		/*
		 * Crie um programa que permita ao usuário escolher o elogio que gostaria de
		 * receber, de acordo com a seguinte regra: 1 - Elogio profissional, 2 - Elogio
		 * físico, 3 - Elogio pessoal Caso digite qualquer outro número, deve ser
		 * exibida a mensagem "opção inválida"
		 */
		Random elogiador = new Random();
		int opcao;
		System.out.println("ELOGIADOR!");

		opcao = elogiador.nextInt(3)+1;
		
		// Aqui precisamos de uma estrutura para validar a opção inserida.
		switch (opcao) {
		case 1:
			System.out.println("Que codigo lindo voce faz em JAVA");
			break;
		case 2:
			System.out.println("Lindos olhos voce tem pra encontrar bug");
			break;
		case 3:
			System.out.println("Teu poder é mais de 8000");
			break;
		default:
			System.out.println("opção inválida");
			break;
		}

	}

}
