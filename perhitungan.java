import java.util.Scenner;
public class perhitungan {
public static void main(String[] args){
	int panjang;
	int lebar;
	double luas; yazid1412/gittest
		
		Scenner a = Scenner(System.in);
		System.out.println("menghitung luas persegi panjang");
		System.out.println("masukan panjang");
		panjang = a.nextint();
		System.out.println("masukan lebar");
		lebar = a.nextint();

		luas = (panjang*lebar);
		System.out.println("luas persegi panjang = "+luas);
		}
}
