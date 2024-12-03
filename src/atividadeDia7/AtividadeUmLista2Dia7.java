package atividadeDia7;

import java.util.Scanner;

public class AtividadeUmLista2Dia7 {

	public static void main(String[] args) {
		int opcao;
		int qtd;
		Scanner leia1 = new Scanner(System.in);
		Scanner leia2 = new Scanner(System.in);
		
		
		System.out.println("Código do Produto |     Produto         |  Preço Unitário   | ");
		System.out.println("-------------------------------------------------------------");
		System.out.println("        1         |Cachorro Quente      |R$ 10.00           |");
		System.out.println("        2         |X-Salada             |R$ 15.00           |");
		System.out.println("        3         |X-Bacon              |R$ 18.00           |");
		System.out.println("        4         |Bauru                |R$ 12.00           |");
		System.out.println("        5         |Refrigerante         |R$ 8.00            |");
		System.out.println("        6         |Suco de Laranja      |R$ 13.00           |");
		System.out.println("-------------------------------------------------------------");
		System.out.println("Através dos códigos, escolha um item da lanchonete: ");
		opcao = leia1.nextInt();
		System.out.println("Escolha a quantidade que deseja: ");
		qtd = leia2.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("O produto é Cachorro Quente e o valor total é: R$ " + qtd*10.00);
			break;
		case 2:
			System.out.println("O produto é X-Salada e o valor total é: R$ " + qtd*15.00);
			break;
		case 3:
			System.out.println("O produto é X-Bacon e o valor total é: R$ " + qtd*18.00);
			break;
		case 4:
			System.out.println("O produto é Bauru e o valor total é: R$ " + qtd*12.00);
			break;
		case 5:
			System.out.println("O produto é Refrigerante e o valor total é: R$ " + qtd*8.00);
			break;
		case 6:
			System.out.println("O produto é Suco de Laranja e o valor total é: R$ " + qtd*13.00);
			break;
		default:
			System.out.println("Opção inválida");
		}
		leia1.close();
		leia2.close();

	}

}
