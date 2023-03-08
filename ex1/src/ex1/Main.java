package ex1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Livro livro[] = new Livro[2];
		Fichario fichario = new Fichario(livro);
		Scanner sc = new Scanner(System.in);

		int op = 0;

		do {
			System.out.println("1 - Cadastro de Livro");
			System.out.println("2 - Alterar livro");
			System.out.println("3 - Exlucir livro");
			System.out.println("4 - Consultar livro");
			System.out.println("5 - Relatório dos livros");
			System.out.println("6 - Sair");

			op = sc.nextInt();
			switch (op) {

			case 1:
				fichario.criaLivro();
				break;
			case 2:
				fichario.alterar();
				break;
			case 3:
				fichario.apagarLivro();
				break;
			case 4:
				fichario.consultar();
				break;
			case 5:
				fichario.listarLivro();
				break;
			default:
				System.out.println("Opção inválida");

			}

		} while (op != 6);
		sc.close();
	}

}
