import java.util.Scanner;
public class Luassegitiga {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double alas,tinggi,hasil;
		
		System.out.println("+==================================+");
		System.out.println("| Program menghitung luas segitiga |");
		System.out.println("+==================================+");
		
		System.out.print("Masukan nilai alas : ");
		alas = input.nextInt();
		
		System.out.print("Masukan nilai tinggi : ");
		tinggi = input.nextInt();
		
		System.out.println("+=============+");
		System.out.print("| ★★HASIL★★ |");
		System.out.println();
		System.out.println("+=============+");
		
		hasil = 0.5 * alas * tinggi;
		
		System.out.println("Jumlah luas segitiga adalah : "+hasil);
		
	}
}