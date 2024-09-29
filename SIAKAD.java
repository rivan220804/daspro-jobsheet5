import java.util.Scanner;
/**
 * SIAKAD
 */
public class SIAKAD {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("Masukkan nama");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        String kualifikasi = "", nilaiHuruf ="";
        double nilaiSetara;
        
        
        if (nilaiAkhir >= 80 && nilaiAkhir <= 100 ) {
            nilaiHuruf = "A";
            nilaiSetara = 4.0;
            kualifikasi = "sangatbaik" ;
        } else if (nilaiAkhir >= 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            nilaiSetara = 3.5;
            kualifikasi = "lebih dari baik";    
        }else if ( nilaiAkhir >= 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            nilaiSetara = 3.0;
            kualifikasi = "Baik";    
        }else if ( nilaiAkhir >= 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            nilaiSetara = 2.5;
            kualifikasi = "Lebih dari cukup";    
        }else if (nilaiAkhir  >= 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            nilaiSetara = 2.0;
            kualifikasi = "Cukup";    
        }else if (nilaiAkhir  >= 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D" ;
            nilaiSetara = 1.0;
            kualifikasi = "Kurang";  
        }else if (nilaiAkhir < 39) {
            nilaiHuruf = "E";
            nilaiSetara = 0.0;
            kualifikasi = "Gagal" ;   
        }else {
        System.out.println("Nilai tidak valid");
    
        }
        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);













    }
}
