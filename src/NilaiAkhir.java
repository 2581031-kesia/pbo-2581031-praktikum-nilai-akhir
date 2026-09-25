 import java.util.Scanner;
 public class NilaiAkhir {

     // Empat bobot disimpan sebagai konstanta, bukan diketik langsung didalam rumusnya
     static final double BOBOT_PRAKTIKUM = 0.30;
     static final double BOBOT_TUGAS = 0.20;
     static final double BOBOT_MID = 0.20;
     static final double BOBOT_FINAL = 0.30;

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         // Nilai dibaca sebagai double dengan nextDouble(), supaya input seperti 79.5 tetap diterima

         System.out.print("Nilai praktikum : ");
         double praktikum = scanner.nextDouble();
         System.out.print("Nilai tugas     : ");
         double tugas = scanner.nextDouble();
         System.out.print("Nilai MID       : ");
         double mid = scanner.nextDouble();
         System.out.print("Nilai final     : ");
         double finalNilai = scanner.nextDouble();

         // Percobaan versi bilangan bulat (data contoh 85, 78, 70, 80, semua bertipe int):
         // int akhirI = 85*30/100 + 78*20/100 + 70*20/100 + 80*30/100;
         // Hasilnya 78, BUKAN 79.1 seperti versi double.
         // Karena: setiap "nilai * bobotPersen / 100" dihitung dengan pembagian int(integer division), sehingga bagian desimal pada tiap komponen
         // (mis. 85*30/100seharusnya 25.5) langsung dipotong (truncate) jadi 25 SEBELUM sempat dijumlahkan.
         // Ini jebakan yang sama dengan kasus 1024 vs 1024.0 minggu lalu: memakai int(bukan double) akan membuat Java memangkas pecahan diam-diam



     }
 }