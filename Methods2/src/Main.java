
public class Main {

	public static void main(String[] args) {
		String mesaj="Hava nas�l?";
		String yeniMesaj=mesaj.substring(0,2);
		System.out.println(yeniMesaj);
		System.out.println(topla(2,3));
		int sayi=topla(5,8);
		System.out.println(sayi);
		int toplam=topla2(3,5,8,11);
		System.out.println(toplam);

	}

	public static void ekle() {
		
		System.out.println("Eklendi");

	}

	public static void sil() {
		System.out.println("Silindi");

	}

	public static void guncelle() {
		System.out.println("Guncellendi");

	}
	
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	
	public static int topla2(int... sayilar) { //int array variable arguments
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;		}
		return toplam;
	}
}
