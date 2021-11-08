package fatorial;

import java.util.Scanner;

public class FatorialApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o fatorial: ");
		int n = sc.nextInt();

		int fatorial = 1;
		int contador = n;

		while (contador >= 1) {

			fatorial *= contador;
			contador--;
		}

		System.out.println("Fatorial de " + n + "! = " + fatorial);

		sc.close();

	}

}
