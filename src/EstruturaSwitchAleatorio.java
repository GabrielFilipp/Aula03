import java.util.Random;
import java.util.Scanner;

public class EstruturaSwitchAleatorio {

	public static void main(String[] args) {
		/*
		 * Crie um programa que permita ao usu�rio escolher o elogio que gostaria de
		 * receber, de acordo com a seguinte regra: 1 - Elogio profissional, 2 - Elogio
		 * f�sico, 3 - Elogio pessoal Caso digite qualquer outro n�mero, deve ser
		 * exibida a mensagem "op��o inv�lida"
		 */
		Random elogiador = new Random();
		int opcao;
		System.out.println("ELOGIADOR!");

		opcao = elogiador.nextInt(3)+1;
		
		// Aqui precisamos de uma estrutura para validar a op��o inserida.
		switch (opcao) {
		case 1:
			System.out.println("Que codigo lindo voce faz em JAVA");
			break;
		case 2:
			System.out.println("Lindos olhos voce tem pra encontrar bug");
			break;
		case 3:
			System.out.println("Teu poder � mais de 8000");
			break;
		default:
			System.out.println("op��o inv�lida");
			break;
		}

	}

}
