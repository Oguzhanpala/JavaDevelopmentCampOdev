package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {

		String[][] sehirler = new String[3][3];

		sehirler[0][0] = "istanbul";
		sehirler[0][1] = "bursa";
		sehirler[0][2] = "�anakkale";
		sehirler[1][0] = "ayd�n";
		sehirler[1][1] = "izmir";
		sehirler[1][2] = "mu�la";
		sehirler[2][0] = "adana";
		sehirler[2][1] = "antalya";
		sehirler[2][2] = "mersin";

		for (int i = 0; i <= 2; i++) {

			System.out.println("-------------------");
			for (int j = 0; j <= 2; j++) {
				System.out.println(sehirler[i][j]);

			}
		}

	}

}
