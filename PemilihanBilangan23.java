import java.util.Scanner;

/**
 * PemilihanBilangan23
 */
public class PemilihanBilangan23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        // Menggunakan operator ternary
        String hasil = (angka % 2 == 0) ? "termasuk bilangan genap" : "termasuk bilangan ganjil";
        System.out.println("Angka " + angka + " " + hasil); 
    }
}