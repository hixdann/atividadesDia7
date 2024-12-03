package atividadeDia7;

import java.util.Scanner;

public class AtividadeDoisLista2Dia7 {

	public static void main(String[] args) {
		int opcao;
		float sal;
		float sal_reajuste;
		String nome;
		Scanner leia1 = new Scanner(System.in);
		Scanner leia2 = new Scanner(System.in);
		Scanner leia3 = new Scanner(System.in);

		System.out.println("Código do Cargo   |       Cargo         | Porcentual de Reajuste  | ");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("        1         |Gerente              |    10 %                 |");
		System.out.println("        2         |Vendedor             |     7 %                 |");
		System.out.println("        3         |Supervisor           |     9 %                 |");
		System.out.println("        4         |Motorista            |     6 %                 |");
		System.out.println("        5         |Estoquista           |     5 %                 |");
		System.out.println("        6         |Técnico de TI        |     8 %                 |");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Digite o nome do Colaborador: ");
		nome = leia3.nextLine();
		System.out.println("Através dos códigos, escolha o Cargo: ");
		opcao = leia1.nextInt();
		System.out.println("Informe o valor do seu salário: ");
		sal = leia2.nextFloat();
		

		switch (opcao) {
		case 1:
			sal_reajuste = sal + (sal * 0.1f);
			System.out.println("Nome do Colaborador: " + nome + "\nCargo: Gerente \nSalário com o reajuste: "  + sal_reajuste);
			break;
		case 2:
			sal_reajuste = sal + (sal * 0.07f);
			System.out.println("Nome do Colaborador: " + nome + "\nCargo: Vendedor \nSalário com o reajuste: "  + sal_reajuste);
			break;
		case 3:
			sal_reajuste = sal + (sal * 0.09f);
			System.out.println("Nome do Colaborador: " + nome + "\nCargo: Supervisor \nSalário com o reajuste: "  + sal_reajuste);
			break;
		case 4:
			sal_reajuste = sal + (sal * 0.06f);
			System.out.println("Nome do Colaborador: " + nome + "\nCargo: Motorista \nSalário com o reajuste: "  + sal_reajuste);
			break;
		case 5:
			sal_reajuste = sal + (sal * 0.05f);
			System.out.println("Nome do Colaborador: " + nome + "\nCargo: Estoquista \nSalário com o reajuste: "  + sal_reajuste);
			break;
		case 6:
			sal_reajuste = sal + (sal * 0.08f);
			System.out.println("Nome do Colaborador: " + nome + "\nCargo: Técnico de TI \nSalário com o reajuste: "  + sal_reajuste);
			break;
		default:
			System.out.println("Opção inválida");
		}
		leia1.close();
		leia2.close();
		leia3.close();

	}

}
