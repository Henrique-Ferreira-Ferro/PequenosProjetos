package calculadora;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== Calculadora ====");
		
		System.out.print("Digite o primeiro número: ");
		int number1 = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		int number2 = sc.nextInt();
		
		System.out.println("Digite a operação que será feita a partir dos numeros de 1 até 4 sendo");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.print("Digite agora: ");
		int operacao = sc.nextInt();
		System.out.println("");
		switch(operacao) {
			case 1:
				System.out.println(number1 + number2);
				break;
			case 2:
				System.out.println(number1 - number2);
				break;
			case 3:
				System.out.println(number1 * number2);
				break;
			case 4:
				System.out.println(number1 / number2);
				break;
			default:
				System.out.println("Você digitou um numero que não era esperado!");
		}
		
		sc.close();
	}
}
