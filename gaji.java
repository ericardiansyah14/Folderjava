import java.util.Scanner;
package gaji;
public class gaji {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama;
        int gaji;
        
        System.out.print("NAMA : ");
        nama = input.nextLine();
        System.out.print("GAJI : ");
        gaji = input.nextInt();
        
        System.out.println();
        System.out.println("==HASIL==");
        
        System.out.println("NAMA = "+nama);
        System.out.println("GAJI = "+gaji);
   
    }
    
}
