import java.util.Scanner;
public class Spp {
	public static void main(String[] args) {
	 Scanner input = new Scanner (System.in);
	 String nama,kelas,jurusan;
	 int nominasi,nisn;
	 
	 System.out.println("             +================================+");
	 System.out.println("             |Program pembayaran spp sederhana|");
	 System.out.println("             +================================+\n");
	 
	 System.out.print("Masukan Nama = ");
	 nama = input.nextLine();
	 System.out.print("Kelas = ");
	 kelas = input.nextLine();
	 System.out.print("Jurusan = ");
	 jurusan = input.nextLine();
	  System.out.print("Nisn = ");
	 nisn = input.nextInt();
	 System.out.print("Masukan Nominasi = Rp.");
	 nominasi = input.nextInt();
	 
	 System.out.print("\n \n");
	 
	 System.out.println("Nama = "+nama);
	 System.out.println("Kelas = "+kelas);
	 System.out.println("Jurusan = "+jurusan);
	 System.out.println("Nisn = "+nisn);
	 System.out.println("Nominasi yang anda masukan = Rp."+nominasi);
	 
	 System.out.print("\n \n");
	 int max = 330000;
	 if(nominasi == max){
	 	System.out.println("Selamat!!!, pembayaran anda dinyatakan LUNAS'''");
	 }
	 else if(nominasi < max){
	 	System.out.println("Nominasi yang anda masukan tidak terpenuhi,Pembayaran anda belum dinyatakan LUNAS!!!");
	 	
	 	max -= nominasi;
	 	
	 	System.out.println("Sisa yang harus anda bayar = Rp."+max);
	 }
	 else if(nominasi > max){
	 	System.out.println("Selamat pembayaran anda lunas,uang anda lebih");
	 	nominasi -= max;
	 	System.out.println("Kembalian anda = Rp."+nominasi);
	 }else{
	 	System.out.println("ERROR!!!");
	 }
	 System.out.println();
	 System.out.print("★★∆∆Terima kasih(by:eric)∆∆★★");
	}
}