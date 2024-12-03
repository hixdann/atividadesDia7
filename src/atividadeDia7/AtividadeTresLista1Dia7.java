package atividadeDia7;

import java.util.Scanner;

public class AtividadeTresLista1Dia7 {

	public static void main(String[] args) {
		int idade;
		String nome;
		boolean primeira_vez;
		Scanner leia1 = new Scanner(System.in);
		Scanner leia2 = new Scanner(System.in);
		Scanner leia3 = new Scanner(System.in);

		System.out.println("Digite o nome do doador: ");
		nome = leia1.nextLine();
		System.out.println("Digite a sua idade: ");
		idade = leia2.nextInt();

		if ((idade >=18) && (idade < 59)) {
			
			System.out.println(nome + " está apto para doar sangue!");
		}
		else if ((idade>59) && (idade < 70)) {
			
			System.out.println("É a primeira vez que você doa sangue? Responda com [true] para sim ou [false] para não: ");
			primeira_vez = leia3.nextBoolean();
				
				if(primeira_vez == true) {
					System.out.println(nome + " não está apto para doar sangue!");
					
				}
				else if (primeira_vez == false) {
					System.out.println(nome + " está apto para doar sangue!");
				}
				
			} 
			 
		else{
			System.out.println(nome + " não está apto para doar sangue!");
		}
		
		leia1.close();
		leia2.close();
		leia3.close();
	}

		

}
