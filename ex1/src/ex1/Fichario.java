package ex1;

import java.util.Scanner;

public class Fichario {
	Scanner sc = new Scanner(System.in);
	Livro[] vet;

	public Fichario(Livro[] vLivro) {

		vet = vLivro;

	}

	public void criaLivro( ) {

		int cont = 0;

		while (cont <= vet.length && vet[cont] != null) {
			cont++;

		}
		;

		if (cont < vet.length) {

			Livro v = new Livro();

			System.out.println("Cadastrando livro");
			System.out.println("Digite o titulo do livro");
			v.setTitulo(sc.nextLine());
			System.out.println("Digite o nome do autor");
			v.setAutor(sc.nextLine());
			System.out.println("Digite o nome da editora");
			v.setEditora(sc.nextLine());
			System.out.println("Digite o ano da publicação");
			v.setAnoPublicacao(Integer.parseInt(sc.nextLine()));
			System.out.println("Digite o numero da edição");
			v.setEdicao(Integer.parseInt(sc.nextLine()));
			System.out.println("Digite o ISBN");
			v.setIsbn(sc.nextLine());

			vet[cont] = v;

		} else {
			System.out.println("Memória cheia");
		}

	}

	public void listarLivro() {
		for (int i = 0; i < vet.length; i++) {
			imprimir(vet[i]);
			System.out.println("-----------------------");

		}
	}

	public void imprimir(Livro l) {
		
		System.out.println("Titulo : " + l.getTitulo());
		System.out.println("Autor : " + l.getAutor());
		System.out.println("Editora : " + l.getEditora());
		System.out.println("Ano de publicação : " + l.getAnoPublicacao());
		System.out.println("Numero de edição : " + l.getEdicao());
		System.out.println("ISBN : " + l.getIsbn());
		
	}

	public void apagarLivro() {
		
		int pos;
		System.out.println("Digite a posição que deseja excluir");
		pos = Integer.parseInt(sc.nextLine());
		if(verifica(pos, vet)) { 
		vet[pos] = null;
		}
	}

	public boolean verifica(int pos, Livro vet[]) {

		int err = 0;

		if (pos < 0 || pos >= vet.length) {
			System.out.println("Posição inválida, digite outra");
			err++;

		}

		if (vet[pos] == null) {
			System.out.println("Não existe livro na posição informada");
			err++;
		}
		if (err == 0)
			return true;
		else
			return false;

	}

	public void consultar() {
		int pos;
		System.out.println("Consultando livros");
		System.out.println("Digite a posição do livro");
		pos = Integer.parseInt(sc.nextLine());

		if (verifica(pos, vet)) {
			imprimir(vet[pos]);

		}

	}
	
	public void alterar() {
		int pos;
		System.out.println("Digite a posição que deseja alterar");
		pos = Integer.parseInt(sc.nextLine());
		
		if(verifica(pos, vet)) {
			System.out.println("Cadastrando livro");
			System.out.println("Digite o titulo do livro");
			vet[pos].setTitulo(sc.nextLine());
			System.out.println("Digite o nome do autor");
			vet[pos].setAutor(sc.nextLine());
			System.out.println("Digite o nome da editora");
			vet[pos].setEditora(sc.nextLine());
			System.out.println("Digite o ano da publicação");
			vet[pos].setAnoPublicacao(Integer.parseInt(sc.nextLine()));
			System.out.println("Digite o numero da edição");
			vet[pos].setEdicao(Integer.parseInt(sc.nextLine()));
			System.out.println("Digite o ISBN");
			vet[pos].setIsbn(sc.nextLine());
			
		}
		
	}
}
