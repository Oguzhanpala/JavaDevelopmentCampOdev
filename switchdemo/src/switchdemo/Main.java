package switchdemo;

public class Main {

	public static void main(String[] args) {
		char not ='D';
		
		switch(not) {
			case 'A':
				System.out.println("Çok iyi geçtiniz.");
				break;
			case 'B':
				System.out.println("iyi geçtiniz.");
				break;
			case 'C':
				System.out.println("normal geçtiniz.");
				break;
			case 'D':
				System.out.println("kötü kaldınız.");
				break;
			default:
				System.out.println("hatalı not girdiniz.");
		}

	}

}
