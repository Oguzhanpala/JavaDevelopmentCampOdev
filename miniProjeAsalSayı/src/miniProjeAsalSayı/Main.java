package miniProjeAsalSayı;

public class Main {

	public static void main(String[] args) {
		
		int sayi=5;
		boolean asalMi=true;
		
		if(sayi==1) {
			System.out.println("Sayi asal değildir.");
			return;
		}
		
		if(sayi<1) {
			System.out.println("Geçersiz sayı.");
			return;
		}
		
		for(int i=2; i<sayi; i++) {
			if(sayi%i ==0) {
				asalMi=false;
			}
		}
		if(asalMi==true) {
			System.out.println("Sayı asaldır.");
			
		}
		else {
			System.out.println("Sayı asal değildir.");
		}

	}

}
