package miniProjeAsalSay�;

public class Main {

	public static void main(String[] args) {

		int sayi = 5;
		boolean asalMi = true;

		if (sayi == 1) {
			System.out.println("Sayi asal de�ildir.");
			return;
		}

		if (sayi < 1) {
			System.out.println("Ge�ersiz say�.");
			return;
		}

		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				asalMi = false;
			}
		}
		if (asalMi == true) {
			System.out.println("Say� asald�r.");

		} else {
			System.out.println("Say� asal de�ildir.");
		}

	}

}
