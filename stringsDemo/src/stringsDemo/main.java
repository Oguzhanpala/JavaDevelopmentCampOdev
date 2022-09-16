package stringsDemo;

public class main {

	public static void main(String[] args) {
		
		String mesaj="Bugün hava çok güzel";
		
		
		System.out.println(mesaj);
		System.out.println("eleman sayısı : "+mesaj.length());
		System.out.println("5.elaman : "+mesaj.charAt(4));
		System.out.println(mesaj.concat(" yaşasın"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("l"));
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("a"));
		System.out.println(mesaj.lastIndexOf("a"));
		System.out.println("-------------------------");
		
		String yeniMesaj=mesaj.replace(" ", "-");
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5)); // 2 den başla 5 e kadar demek.
		System.out.println("--------");
		
		for(String kelime:mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		String mesaj2="        bugün hava güzel       ";
		System.out.println(mesaj2.trim());
	}

}
