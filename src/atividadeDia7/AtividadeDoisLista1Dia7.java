package atividadeDia7;

import java.util.Scanner;

public class AtividadeDoisLista1Dia7 {

	public static void main(String[] args) {

		int num1;
		Scanner leia1 = new Scanner(System.in);

		System.out.println("Digite um número: ");
		num1 = leia1.nextInt();

		if (num1 % 2 == 0) {
			if (num1 < 0) {
			System.out.println("O número " + num1 + " é Par e é negativo");
			}
			else {
				System.out.println("O número " + num1 + " é Par e é Positivo");
			}
		} 
		else if (num1 % 2 != 0) {
			if (num1 > 0) {
				System.out.println("O número " + num1 +  " é Ímpar e é positivo");
				}
				else {
					System.out.println("O número " + num1 +  " é Ímpar e é Negativo");
				}
		}
			
		leia1.close();

	}

}
