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
			System.out.println("m�kemmel say�d�r.");
			return;
		}

		if (sayi < 1) {
			System.out.println("Ge�ersiz say�.");
			return;
		}
		if (toplam == sayi) {
			System.out.println("M�kemmel say�d�r.");
		} else {
			System.out.println("M�kemmel say� de�ildir.");
		}
	}

}
