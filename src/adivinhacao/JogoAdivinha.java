package adivinhacao;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random rm = new Random();
		
		int aleatorio = rm.nextInt(10) + 1;
		
		System.out.print("Digite um numero aleatorio de 0 a 10: ");
		int random = sc.nextInt();
		
		while(random != aleatorio) {
			System.out.print("Você errou! Digite novamente: ");
			random = sc.nextInt();
		}
		
		System.out.println("Ei voce acertou, o número correto é: "+ aleatorio);
	}
}
