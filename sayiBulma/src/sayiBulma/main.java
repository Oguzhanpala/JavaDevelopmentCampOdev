package sayiBulma;

public class main {

	public static void main(String[] args) {

		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak=1;
		
		boolean varMı=false;
		
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				varMı=true;
				break;
			}
		}
		if(varMı==true) {
			System.out.println("sayi vardır");
		}
		else {
			System.out.println("sayı mevcut değil");
		}
	}
}