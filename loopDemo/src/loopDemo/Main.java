package loopDemo;

public class Main {

	public static void main(String[] args) {
		// for d�ng�s�
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("d�ng� bitti");

		// tek say�lar
		for (int i = 1; i < 10; i = i + 2) {
			System.out.println(i);
		}

		// �ift say�lar
		for (int i = 0; i < 10; i = i + 2) {
			System.out.println(i);
		}

		// while d�ng�s�
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("while d�ng�s� bitti");

		// do-while d�ng�s�
		int j = 10;
		do {
			System.out.println(j);
			j = j + 2;
		} while (j < 5);

		System.out.println("do-while d�ng�s� bitti");

	}

}
