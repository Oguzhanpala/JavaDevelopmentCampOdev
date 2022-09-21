package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		
		int sayi=1;
		int toplam=0;
		
		for(int i=1; i<sayi; i++) {
			if(sayi%i==0) {
				toplam=toplam+i;
			}
		}
		if(sayi==1) {
			System.out.println("mükemmel sayıdır.");
			return;
		}
		
		if(sayi<1) {
			System.out.println("Geçersiz sayı.");
			return;
		}
		if(toplam==sayi) {
			System.out.println("Mükemmel sayıdır.");
		}
		else {
			System.out.println("mükemmel sayı değildir.");
		}
	}

}
