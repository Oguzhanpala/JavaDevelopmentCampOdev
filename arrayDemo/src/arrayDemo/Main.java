package arrayDemo;

public class Main {

	public static void main(String[] args) {

		String ogrenci1 = "oðuzhan";
		String ogrenci2 = "mehmet";
		String ogrenci3 = "ayþe";
		String ogrenci4 = "hatice";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		System.out.println("----------------------");

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "oðuzhan";
		ogrenciler[1] = "mehmet";
		ogrenciler[2] = "ayþe";
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
