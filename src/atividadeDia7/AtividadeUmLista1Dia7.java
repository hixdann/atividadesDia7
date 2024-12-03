package atividadeDia7;

import java.util.Scanner;

public class AtividadeUmLista1Dia7 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int num3;
		int soma;
		
		Scanner leia1 = new Scanner(System.in);
		Scanner leia2 = new Scanner(System.in);
		Scanner leia3 = new Scanner(System.in);
		
		System.out.println("Digite o número A: ");
		num1 = leia1.nextInt();
		System.out.println("Digite o número B: ");
		num2 = leia2.nextInt();
		System.out.println("Digite o número C: ");
		num3 = leia3.nextInt();
		
		soma = num1 + num2;
		
		if(soma > num3) {
			System.out.println("A Soma de A + B é Maior do que C");
		}
		else if (soma < num3) {
			System.out.println("A Soma de A + B é Menor do que C");
		}
		else {
			System.out.println("A Soma de A + B é Igual a C");
		}
		leia1.close();
		leia2.close();
		leia3.close();

	}

}
