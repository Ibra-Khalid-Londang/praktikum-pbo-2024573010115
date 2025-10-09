package modul_4;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------");
        System.out.println("                 SISTEM KARTU RENCANA STUDI (KRS)                 ");
        System.out.println("------------------------------------------------------------------");
        System.out.println("\nInput Data Mahasiswa:");
        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("NIM: ");
        String nim = input.nextLine();

        System.out.print("Jurusan: ");
        String jurusan = input.nextLine();

        mahasiswa mhs = new mahasiswa(nama, nim, jurusan, 0.0);
        kartuRencanaStudi krs = new kartuRencanaStudi(mhs, 10);
        boolean running = true;

        while (running) {
            System.out.println("\n=================================");
            System.out.println("            MENU KRS             ");
            System.out.println("=================================");
            System.out.println("[1]. Tambah Mata Kuliah");
            System.out.println("[2]. Hapus Mata Kuliah");         // MODIFIKASI: Menu baru
            System.out.println("[3]. Input Nilai Mata Kuliah");     // Geser nomor
            System.out.println("[4]. Lihat Nilai Terbaik/Terburuk"); // MODIFIKASI: Menu baru
            System.out.println("[5]. Tampilkan KRS");             // Geser nomor
            System.out.println("[6]. Keluar");                     // Geser nomor
            System.out.println("---------------------------------");
            System.out.print("Pilih menu: ");

            int pilihan;
            try {
                pilihan = input.nextInt();
            } catch (java.util.InputMismatchException e) {
                pilihan = -1;
            }
            input.nextLine();

            switch (pilihan) {
                case 1:
                    // ... (Kode case 1 tidak berubah)
                    System.out.println("\n--- TAMBAH MATA KULIAH ---");
                    System.out.print("Kode Mata Kuliah: ");
                    String kode = input.nextLine();
                    System.out.print("Nama Mata Kuliah: ");
                    String namaMK = input.nextLine();
                    System.out.print("Jumlah SKS: ");
                    int sks;
                    try {
                        sks = input.nextInt();
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Input SKS tidak valid. Mata kuliah dibatalkan.");
                        input.nextLine();
                        break;
                    }
                    input.nextLine();
                    mataKuliah mk = new mataKuliah(kode, namaMK, sks);
                    krs.tambahMatakuliah(mk);
                    break;

                case 2: // BARU: Logika untuk hapus mata kuliah
                    System.out.println("\n--- HAPUS MATA KULIAH ---");
                    System.out.print("Masukkan Kode Mata Kuliah yang akan dihapus: ");
                    String kodeHapus = input.nextLine();
                    krs.hapusMatakuliah(kodeHapus);
                    break;

                case 3: // Sebelumnya case 2
                    System.out.println("\n--- INPUT NILAI ---");
                    System.out.print("Kode Mata Kuliah: ");
                    String kodeCari = input.nextLine();
                    mataKuliah mkCari = krs.cariMatakuliahByKode(kodeCari);
                    if (mkCari != null) {
                        System.out.print("Input Nilai (0-100): ");
                        double nilaiInput;
                        try {
                            nilaiInput = input.nextDouble();
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("Input nilai tidak valid.");
                            input.nextLine();
                            break;
                        }
                        input.nextLine();
                        mkCari.setNilai(nilaiInput);
                        System.out.println("Nilai berhasil diinputkan!");
                    } else {
                        System.out.println("Mata kuliah tidak ditemukan!");
                    }
                    break;

                case 4: // BARU: Panggil method untuk lihat nilai ekstrem
                    krs.tampilkanNilaiEkstrem();
                    break;

                case 5: // Sebelumnya case 3
                    krs.tampilkanKRS();
                    break;

                case 6: // Sebelumnya case 4
                    System.out.println("\nTerima kasih telah menggunakan sistem!");
                    running = false;
                    break;

                default:
                    System.out.println("\nPilihan tidak valid!");
                    break;
            }
        }
        input.close();
    }
}