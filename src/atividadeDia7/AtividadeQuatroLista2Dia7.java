package atividadeDia7;

import java.util.Scanner;

public class AtividadeQuatroLista2Dia7 {

	public static void main(String[] args) {
		int opcao;
		float saque;
		float saldo = 1000.00f;
		float deposito;
		Scanner leia1 = new Scanner(System.in);
		Scanner leia2 = new Scanner(System.in);
		Scanner leia3 = new Scanner(System.in);

		System.out.println("     Código da Operação       |       Operação       |");
		System.out.println("------------------------------------------------------");
		System.out.println("        1                     |Saldo                 |");
		System.out.println("        2                     |Saque                 |");
		System.out.println("        3                     |Depósito              |");
		System.out.println("------------------------------------------------------");
		
		System.out.println("Informe o código da operação que deseja realizar: ");
		opcao = leia1.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Operação - Saldo\nO seu saldo é de R$ : " + saldo);
			break;
		case 2:
			System.out.println("Digite o valor para ser sacado: ");
			saque = leia2.nextFloat();
			if(saque > saldo) {
				System.out.println("Operação - Saque\nSaldo insuficiente");
			}
			else {
				System.out.println("Operação - Saque\nNovo Saldo: R$ " + (saldo - saque));
			}
			break;
		case 3:
			System.out.println("Digite o valor para ser depositado: ");
			deposito = leia3.nextFloat();
			System.out.println("Operação - Depósito\nO seu novo saldo é de R$  " + (saldo + deposito));
			break;
		default:
			System.out.println("Opção inválida");
		}
		leia1.close();
		leia2.close();
		leia3.close();

	}

}
