import java.util.Scanner;
public class tabungan{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a,b,c,opsi;
		System.out.println("		+==========================+");
		System.out.println("		|Program menabung sederhana|");
		System.out.println("		+==========================+\n");
			System.out.print("Masukan total uang dalam tabungan anda = Rp.");
			a = input.nextInt();
			
			System.out.println("1.tarik");
			System.out.println("2.tambah");
			System.out.print("Pilih salah satu = ");
			opsi = input.nextInt();
			if(opsi == 1){
				System.out.print("Mau di tarik berapa = Rp.");
				b = input.nextInt();
				a -= b;
				System.out.print("sisa uang anda = Rp."+a);
			}
		 	else if(opsi == 2){
		 		System.out.print("Mau di tambah berapa = Rp.");
		 		c = input.nextInt();
		 		a += c;
		 		System.out.println("Total uang tabungan anda saat ini = Rp."+a);
		 	}else{
		 		System.out.print("Opsi tidak tersedia");
		 	}
	}
}