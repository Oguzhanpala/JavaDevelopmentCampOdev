package switchDemo;

public class Main {

	public static void main(String[] args) {
		char not = 'D';

		switch (not) {
		case 'A':
			System.out.println("�ok iyi ge�tiniz.");
			break;
		case 'B':
			System.out.println("iyi ge�tiniz.");
			break;
		case 'C':
			System.out.println("normal ge�tiniz.");
			break;
		case 'D':
			System.out.println("k�t� kald�n�z.");
			break;
		default:
			System.out.println("hatal� not girdiniz.");
		}

	}

}
