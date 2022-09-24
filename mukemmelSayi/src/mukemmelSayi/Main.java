package mukemmelSayi;

public class Main {

	public static void main(String[] args) {

		int sayi = 1;
		int toplam = 0;

		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				toplam = toplam + i;
			}
		}
		if (sayi == 1) {
			System.out.println("mükemmel sayýdýr.");
			return;
		}

		if (sayi < 1) {
			System.out.println("Geçersiz sayý.");
			return;
		}
		if (toplam == sayi) {
			System.out.println("Mükemmel sayýdýr.");
		} else {
			System.out.println("Mükemmel sayý deðildir.");
		}
	}

}
