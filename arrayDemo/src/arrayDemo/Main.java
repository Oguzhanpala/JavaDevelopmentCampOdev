package arrayDemo;

public class Main {

	public static void main(String[] args) {

		String ogrenci1 = "oğuzhan";
		String ogrenci2 = "mehmet";
		String ogrenci3 = "ayşe";
		String ogrenci4 = "hatice";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		System.out.println("----------------------");

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "oğuzhan";
		ogrenciler[1] = "mehmet";
		ogrenciler[2] = "ayşe";
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
