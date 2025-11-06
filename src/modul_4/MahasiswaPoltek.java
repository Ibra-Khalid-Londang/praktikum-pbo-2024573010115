package modul_4;

import java.util.Scanner;

class MahasiswaPoltek {
    String nama;
    String nim;
    String jurusan;
    String prodi;

    public MahasiswaPoltek(String nama, String nim, String jurusan, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.prodi = prodi;
    }

    public void tampilkanData() {
        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Prodi   : " + prodi);
    }
}

 class MahasiswaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.print("Masukkan Jurusan: ");
        String jurusan = input.nextLine();

        System.out.print("Masukkan Prodi: ");
        String prodi = input.nextLine();

        MahasiswaPoltek mhs = new MahasiswaPoltek(nama, nim, jurusan, prodi);
        mhs.tampilkanData();

        input.close();
    }
}
