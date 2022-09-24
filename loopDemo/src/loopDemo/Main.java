package loopDemo;

public class Main {

	public static void main(String[] args) {
		// for döngüsü
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("döngü bitti");

		// tek sayýlar
		for (int i = 1; i < 10; i = i + 2) {
			System.out.println(i);
		}

		// çift sayýlar
		for (int i = 0; i < 10; i = i + 2) {
			System.out.println(i);
		}

		// while döngüsü
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("while döngüsü bitti");

		// do-while döngüsü
		int j = 10;
		do {
			System.out.println(j);
			j = j + 2;
		} while (j < 5);

		System.out.println("do-while döngüsü bitti");

	}

}
