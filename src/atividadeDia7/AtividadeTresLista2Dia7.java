package atividadeDia7;

import java.util.Scanner;

public class AtividadeTresLista2Dia7 {

	public static void main(String[] args) {
		int opcao;
		float num1;
		float num2;
		float res;
		Scanner leia1 = new Scanner(System.in);
		Scanner leia2 = new Scanner(System.in);
		Scanner leia3 = new Scanner(System.in);

		System.out.println("     Código da Operação       |       Operação       |");
		System.out.println("------------------------------------------------------");
		System.out.println("        1                     |Soma                  |");
		System.out.println("        2                     |Subtração             |");
		System.out.println("        3                     |Multiplicação         |");
		System.out.println("        4                     |Divisão               |");
		System.out.println("------------------------------------------------------");

		System.out.println("Informe o primeiro múmero: ");
		num1 = leia2.nextFloat();
		System.out.println("Informe o segundo número: ");
		num2 = leia3.nextFloat();
		System.out.println("Informe o código da operação que deseja realizar: ");
		opcao = leia1.nextInt();
		

		switch (opcao) {
		case 1:
			res = num1 + num2;
			System.out.println("Operação - Soma: " + num1 + " + " + num2 + " = " + res);
			break;
		case 2:
			res = num1 - num2;
			System.out.println("Operação - Subtração: " + num1 + " - " + num2 + " = " + res);
			break;
		case 3:
			res = num1 * num2;
			System.out.println("Operação - Multiplicação: " + num1 + " * " + num2 + " = " + res);
			break;
		case 4:
			res = num1 / num2;
			System.out.println("Operação - Divisão: " + num1 + " / " + num2 + " = " + res);
			break;
		default:
			System.out.println("Opção inválida");
		}
		leia1.close();
		leia2.close();
		leia3.close();

	}

}
