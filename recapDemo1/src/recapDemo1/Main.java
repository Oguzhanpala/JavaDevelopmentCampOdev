package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 26;
		int sayi2 = 25;
		int sayi3 = 5;
		int enBuyuk = sayi1;

		if (sayi1 < sayi2) {
			enBuyuk = sayi2;
		}
		if (sayi1 < sayi3) {
			enBuyuk = sayi3;
		}

		System.out.println("En büyük : " + enBuyuk);
	}

}
