package src;
import java.util.Scanner;
public class Calculadora {

	private static Scanner in = new Scanner(System.in);
	
	public static void executa() {
		System.out.println("bem vindo ao programa da calculadora");
		int opcao = 0;
		while(opcao != 6) {
			mostramenu();
			opcao = in.nextInt();
			switch(opcao) {
			case 1:
				float a = inserevalor();
				float b = inserevalor();
				System.out.println("a + b = " + soma(a, b));
				break;
			case 2:
				float a1 = inserevalor();
				float b1 = inserevalor();
				System.out.println("a - b = " + subtrai(a1, b1));
				break;
			case 3:
				float a2 = inserevalor();
				float b2 = inserevalor();
				System.out.println("a * b = " + multiplica(a2, b2));
				break;
			case 4:
				float a3 = inserevalor();
				float b3 = inserevalor();
				System.out.println("a / b = " + divide(a3, b3));
				break;
			case 5:
				float a4 = inserevalor();
				float b4 = inserevalor();
				System.out.println("a ^ b = " + potencia(a4, b4));
				break;
			default:
				break;
			}
		}System.out.println("desligando a calculadora");
	}

	private static float inserevalor() {
		System.out.println("Insira um valor:");
		float a = in.nextFloat();
		return a;
	}

	private static void mostramenu() {
		System.out.println("Escolha:");
		System.out.println("1=soma");
		System.out.println("2=subtracao");
		System.out.println("3=multiplicacao");
		System.out.println("4=divisao");
		System.out.println("5=pontenciacao");
		System.out.println("6=sair");
	}
	
	public static float soma(float a, float b) {
		return a + b;
	}
	
	public static float subtrai(float a, float b) {
		return a - b;
	}
	
	public static float multiplica(float a, float b) {
		return a * b;
	}
	
	public static float divide(float a, float b) {
		if(b == 0) {
			if(a == 0) {
				return 0;
			}
		}return a / b;
	}
	
	public static float potencia(float a, float b) {
		if(a == 0) {
			return 0;
		}
		if(b == 0) {
			return 1;
		}if(b > 0) {
			float result = 1;
			for(int i = 0; i < b; i++) {
				result = result * a;
			}return result;
		}float result = 1;
		for(int i = 0; i > b; i--) {
			result = result / a;
		}return result;
	}
	
}
