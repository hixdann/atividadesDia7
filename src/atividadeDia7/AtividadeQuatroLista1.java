package atividadeDia7;

import java.util.Scanner;

public class AtividadeQuatroLista1 {

	public static void main(String[] args) {
		String palavra1;
		String palavra2;
		String palavra3;
		Scanner leia1 = new Scanner(System.in);
		Scanner leia2 = new Scanner(System.in);
		Scanner leia3 = new Scanner(System.in);

		System.out.println("Digite a primeira Sub-Classe do Reino Animal: ");
		palavra1 = leia1.nextLine();
		System.out.println("Digite a segunda Sub-Classe do Reino Animal: : ");
		palavra2 = leia2.nextLine();
		System.out.println("Digite a última Sub-Classe do Reino Animal: : ");
		palavra3 = leia3.nextLine();

		if (palavra1.equalsIgnoreCase("vertebrado"))
				{
			if(palavra2.equalsIgnoreCase("ave")){
				if(palavra3.equalsIgnoreCase("carnivoro"))
				{
					System.out.println("Águia");
				}
				
				else if (palavra3.equalsIgnoreCase("onivoro")) {
					System.out.println("Pomba");
				}
			}
			else if(palavra2.equalsIgnoreCase("mamifero")) {
				if(palavra3.equalsIgnoreCase("herbivoro"))
				{
					System.out.println("Vaca");
				}
				
				else if (palavra3.equalsIgnoreCase("onivoro")) {
					System.out.println("Homem");
			}
				
			}
		

	}
		else if (palavra1.equalsIgnoreCase("invertebrado")) {
			if(palavra2.equalsIgnoreCase("inseto")){
				if(palavra3.equalsIgnoreCase("hematofago"))
				{
					System.out.println("Pulga");
				}
				
				else if (palavra3.equalsIgnoreCase("herbivoro")) {
					System.out.println("Lagarta");
				}
			}
			else if (palavra2.equalsIgnoreCase("anelideo")) {
					if(palavra3.equalsIgnoreCase("hematofago"))
				{
					System.out.println("Sanguessuga");
				}
				}
				
					else if (palavra3.equalsIgnoreCase("onivoro")) {
					System.out.println("Minhoca");
				}
			
		}

		leia1.close();
		leia2.close();
		leia3.close();

	}

}
