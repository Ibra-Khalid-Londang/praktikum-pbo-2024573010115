package modul_4;

public class KartuRencanaStudi {
    private Mahasiswa mahasiswa;
    private MataKuliah[] daftarMatakuliah;
    private int jumlahMatkul;
    private int maxMatkul;
    private final int MAX_SKS = 24; // BARU: Batas maksimal SKS

    public KartuRencanaStudi(Mahasiswa mahasiswa, int maxMatkul) {
        this.mahasiswa = mahasiswa;
        this.maxMatkul = maxMatkul;
        this.daftarMatakuliah = new MataKuliah[maxMatkul];
        this.jumlahMatkul = 0;
    }

    // MODIFIKASI: Tambah validasi SKS
    public boolean tambahMatakuliah(MataKuliah matkul) {
        if (jumlahMatkul >= maxMatkul) {
            System.out.println("\nNote: KRS sudah penuh! Maksimal " + maxMatkul + " mata kuliah.");
            return false;
        }
        // Validasi SKS sebelum ditambahkan
        if (hitungTotalSKS() + matkul.getSks() > MAX_SKS) {
            System.out.println("\nNote: Gagal menambah! Total SKS akan melebihi batas " + MAX_SKS + " SKS.");
            return false;
        }

        daftarMatakuliah[jumlahMatkul] = matkul;
        jumlahMatkul++;
        System.out.println("\nNote: Mata kuliah " + matkul.getNama() + " berhasil ditambahkan.");
        return true;
    }

    // BARU: Fitur untuk menghapus mata kuliah
    public boolean hapusMatakuliah(String kode) {
        int indexDitemukan = -1;
        // 1. Cari index dari mata kuliah yang akan dihapus
        for (int i = 0; i < jumlahMatkul; i++) {
            if (daftarMatakuliah[i].getKode().equalsIgnoreCase(kode)) {
                indexDitemukan = i;
                break;
            }
        }

        // 2. Jika tidak ditemukan, beri pesan dan keluar
        if (indexDitemukan == -1) {
            System.out.println("\nNote: Mata kuliah dengan kode " + kode + " tidak ditemukan.");
            return false;
        }

        System.out.println("\nNote: Mata kuliah " + daftarMatakuliah[indexDitemukan].getNama() + " berhasil dihapus.");

        // 3. Geser semua elemen setelahnya ke kiri
        for (int i = indexDitemukan; i < jumlahMatkul - 1; i++) {
            daftarMatakuliah[i] = daftarMatakuliah[i + 1];
        }

        // 4. Kosongkan elemen terakhir dan kurangi jumlah matkul
        daftarMatakuliah[jumlahMatkul - 1] = null;
        jumlahMatkul--;
        return true;
    }

    // BARU: Menampilkan nilai terbaik dan terburuk
    public void tampilkanNilaiEkstrem() {
        if (jumlahMatkul == 0) {
            System.out.println("\nNote: Belum ada mata kuliah yang diinput.");
            return;
        }

        MataKuliah terbaik = daftarMatakuliah[0];
        MataKuliah terburuk = daftarMatakuliah[0];

        for (int i = 1; i < jumlahMatkul; i++) {
            if (daftarMatakuliah[i].getnilai() > terbaik.getnilai()) {
                terbaik = daftarMatakuliah[i];
            }
            if (daftarMatakuliah[i].getnilai() < terburuk.getnilai()) {
                terburuk = daftarMatakuliah[i];
            }
        }

        System.out.println("\n--- NILAI TERBAIK & TERBURUK ---");
        System.out.print("Nilai Terbaik  : ");
        terbaik.tampilkanInfo();
        System.out.print("Nilai Terburuk : ");
        terburuk.tampilkanInfo();
        System.out.println("----------------------------------");
    }

    public int hitungTotalSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMatkul; i++) {
            totalSKS += daftarMatakuliah[i].getSks();
        }
        return totalSKS;
    }

    public double hitungIPK() {
        if (jumlahMatkul == 0) return 0.0;
        double totalBobot = 0.0;
        int totalSKS = 0;
        for (int i = 0; i < jumlahMatkul; i++) {
            MataKuliah mk = daftarMatakuliah[i];
            totalBobot += mk.getBobotNilai() * mk.getSks();
            totalSKS += mk.getSks();
        }
        return totalSKS > 0 ? totalBobot / totalSKS : 0.0;
    }

    public void tampilkanKRS() {
        System.out.println("\n==================================================================");
        System.out.println("              KARTU RENCANA STUDI (KRS)                           ");
        System.out.println("==================================================================");
        System.out.println("Nama Mahasiswa : " + mahasiswa.getNama());
        System.out.println("NIM            : " + mahasiswa.getNim());
        System.out.println("Maks. Matkul   : " + maxMatkul + " mata kuliah.");
        System.out.println("Batas SKS      : " + MAX_SKS + " SKS."); // BARU: Tampilkan info batas SKS
        System.out.println("------------------------------------------------------------------");

        if (jumlahMatkul == 0) {
            System.out.println("Belum ada mata kuliah yang diambil.");
        } else {
            System.out.printf("%-10s %-30s %s\n", "KODE", "NAMA MATA KULIAH", "SKS | NILAI");
            System.out.println("------------------------------------------------------------------");
            for (int i = 0; i < jumlahMatkul; i++) {
                daftarMatakuliah[i].tampilkanInfo();
            }
        }

        System.out.println("------------------------------------------------------------------");
        System.out.printf("Total SKS Semester: %d\n", hitungTotalSKS());
        System.out.printf("IPK Semester      : %.2f\n", hitungIPK());
        System.out.println("==================================================================");
    }

    public MataKuliah cariMatakuliahByKode(String kode) {
        for (int i = 0; i < jumlahMatkul; i++) {
            if (daftarMatakuliah[i].getKode().equalsIgnoreCase(kode)) {
                return daftarMatakuliah[i];
            }
        }
        return null;
    }
}