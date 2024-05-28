public class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;

    Mahasiswa(String nama, String NIM, String jurusan) {
        this.nama = nama;
        this.NIM = NIM;
        this.jurusan = jurusan;
    }

    static void tampilUniversitas() {
        System.out.println("Universitas Muhammadiyah Malang");
    }

    void tampilDataMahasiswa() {
        System.out.println("Nama    :  " + nama);
        System.out.println("NIM     :  " + NIM);
        System.out.println("Jurusan :  " + jurusan);
        System.out.print("\n");
    }
}