package arrayDemo;

public class Main {

	public static void main(String[] args) {

		String ogrenci1 = "o�uzhan";
		String ogrenci2 = "mehmet";
		String ogrenci3 = "ay�e";
		String ogrenci4 = "hatice";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		System.out.println("----------------------");

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "o�uzhan";
		ogrenciler[1] = "mehmet";
		ogrenciler[2] = "ay�e";
		ogrenciler[3] = "salih";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}

		System.out.println("----------------------");

		for (String ogrenci : ogrenciler) {

			System.out.println(ogrenci);
		}

	}

}
