import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nama :");
        String nama = input.nextLine();

        System.out.print("Masukan jenis kelamin (L/P) :");
        String jenisKelaminInput = input.nextLine();
        String jenisKelamin;
        if (jenisKelaminInput.equalsIgnoreCase("P")) {
            jenisKelamin = "Perempuan";
        } else if (jenisKelaminInput.equalsIgnoreCase("L")){
            jenisKelamin = "Laki-laki";
        } else {
            jenisKelamin = "Jenis Kelamin tidak valid";
        }

        System.out.print("Masukan tanggal lahir (YYYY-MM-DD) :");
        String tanggalLahirInput = input.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirInput);

        LocalDate sekarang = LocalDate.now();
        Period selisih = Period.between(tanggalLahir, sekarang);
        int tahun = selisih.getYears();
        int bulan = selisih.getMonths();

        System.out.println("\nData Diri :");
        System.out.println("Nama :" + nama);
        System.out.println("Jenis Kelamin :" + jenisKelamin);
        System.out.println("Umur :" + tahun + "tahun" + bulan + "bulan");

        input.close();
    }
}