**Mata Kuliah:** Praktikum Pemrograman Berorientasi Objek   
**Nama:** [Ibra Khalid Londang]  
**NIM:** [2024573010115]  
**Kelas:** [TI 1A]

---


## Praktikum: Pengenalan Object Oriented Programming

### Pendahuluan
Modul ini dirancang untuk memberikan pemahaman dasar tentang pemrograman berorientasi objek menggunakan Java melalui praktikum langsung. Setiap praktikum dilengkapi dengan teori dasar dan langkah-langkah implementasi yang detail.

### Dasar Teori
Objek-Oriented Programming (OOP) adalah paradigma pemrograman yang menggunakan “objek” - struktur data yang berisi data, dalam bentuk field, sering kali dikenal sebagai atribut; dan kode, dalam bentuk prosedur, sering kali dikenal sebagai metode.

Inti dari OOP adalah mendesain software dengan membagi masalah menjadi serangkaian objek yang saling berinteraksi. Ini bertentangan dengan pemrograman prosedural, yang fokus pada fungsi/prosedur dalam memproses data. OOP memungkinkan kita untuk membuat kode yang lebih modular, reusable, dan mudah di-maintain.

#### Konsep Dasar OOP:
- Class: Template atau blueprint untuk membuat object
- Object: Instance dari sebuah class
- Attribute/Field: Variabel yang dimiliki oleh class
- Method: Function yang dimiliki oleh class
- Constructor: Method khusus untuk inisialisasi object

#### Prinsip OOP:
- Encapsulation: Menyembunyikan detail implementasi
- Inheritance: Pewarisan sifat dari class parent
- Polymorphism: Kemampuan object untuk memiliki banyak bentuk
- Abstraction: Menyederhanakan kompleksitas dengan menyembunyikan detail

### Class dan Objek
kelas adalah konsep abstrak yang mendefinisikan set atribut dan metode yang akan dimiliki oleh object. Kelas menyediakan struktur atau template yang menentukan bagaimana sebuah object harus dibuat. Kelas akan menentukan jenis atribut dan metode apa yang akan dimiliki oleh object, tetapi tidak menentukan nilai dari atribut itu sendiri untuk object tertentu.

Object adalah inti dari pemrograman berorientasi objek. Setiap object memiliki dua karakteristik utama, yaitu:
Object, dalam konteks pemrograman OOP, adalah sebuah entitas yang memiliki karakteristik dan perilaku. Kelas, di sisi lain, merupakan blueprint atau cetakan untuk membuat object. Kalau kamu bandingkan dengan dunia nyata, kamu bisa menganggap kelas sebagai rencana desain bangunan, sedangkan object adalah bangunan yang sesungguhnya telah dibangun berdasarkan desain tersebut.

## Praktikum : Dasar Class dan Object

### Langkah-Langkah
1. Buat class baru bernama Mahasiswa
2. Buat class Mahasiswa dan isikan kode berikut:
````declarative
package modul_4;

public class mataKuliah {
    private String kode;
    private String nama;
    private int sks;
    private Double nilai;

    public mataKuliah(String kode, String nama, int sks){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.nilai = 0.0;
    }

    public String getKode(){
        return nama;
    }

    public String getNama(){
        return nama;
    }

    public int getSks(){
        return sks;
    }

    public double getnilai(){
        return  nilai;
    }

    public void setNilai(double nilai){
        if(nilai >= 0.0 && nilai <= 100.0){
            this.nilai = nilai;
        } else{
            System.out.println("nilai harus diantara 0-100");
        }
    }

    public String getNilaiHuruf(){
        if(nilai>=85) return "A";
        else if (nilai>=80) return "A-";
        else if (nilai>=75) return "B+";
        else if (nilai>=70) return "B";
        else if (nilai>=65) return "B-";
        else if (nilai>=60) return "C+";
        else if (nilai>=55) return "C";
        else if (nilai>=50) return "D-";
        else return "E";
    }

    public double getBobotNilai(){
        String huruf = getNilaiHuruf();
        switch (huruf){
            case "A": return 4.0;
            case "A-": return 3.7;
            case "B+": return 3.3;
            case "B": return 3.0;
            case "B-": return 2.7;
            case "C+": return 2.3;
            case "C": return 2.0;
            case "D": return 1.0;
            default: return 0.0;
        }
    }

    public void tampilkanInfo(){
        System.out.printf("%-10s %-30s %d SKS | Nilai %.2f (%s)\n",kode, nama, sks, nilai, getNilaiHuruf());
    }
}

````

3. Buat class Matakuliah dan isikan kode berikut:
````declarative
package modul_4;

public class mataKuliah {
    private String kode;
    private String nama;
    private int sks;
    private Double nilai;

    public mataKuliah(String kode, String nama, int sks){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.nilai = 0.0;
    }

    public String getKode(){
        return nama;
    }

    public String getNama(){
        return nama;
    }

    public int getSks(){
        return sks;
    }

    public double getnilai(){
        return  nilai;
    }

    public void setNilai(double nilai){
        if(nilai >= 0.0 && nilai <= 100.0){
            this.nilai = nilai;
        } else{
            System.out.println("nilai harus diantara 0-100");
        }
    }

    public String getNilaiHuruf(){
        if(nilai>=85) return "A";
        else if (nilai>=80) return "A-";
        else if (nilai>=75) return "B+";
        else if (nilai>=70) return "B";
        else if (nilai>=65) return "B-";
        else if (nilai>=60) return "C+";
        else if (nilai>=55) return "C";
        else if (nilai>=50) return "D-";
        else return "E";
    }

    public double getBobotNilai(){
        String huruf = getNilaiHuruf();
        switch (huruf){
            case "A": return 4.0;
            case "A-": return 3.7;
            case "B+": return 3.3;
            case "B": return 3.0;
            case "B-": return 2.7;
            case "C+": return 2.3;
            case "C": return 2.0;
            case "D": return 1.0;
            default: return 0.0;
        }
    }

    public void tampilkanInfo(){
        System.out.printf("%-10s %-30s %d SKS | Nilai %.2f (%s)\n",kode, nama, sks, nilai, getNilaiHuruf());
    }
}

````

4. Buat class RencanaKartuStudi dan isikan kode berikut:
````declarative
package modul_4;

public class kartuRencanaStudi {
    private mahasiswa mahasiswa;
    private mataKuliah[] daftarMatakuliah;
    private int jumlahMatkul;
    private int maxMatkul;

    public kartuRencanaStudi(mahasiswa mahasiswa, int maxMatkul) {
        this.mahasiswa = mahasiswa;
        this.maxMatkul = maxMatkul;
        this.daftarMatakuliah = new mataKuliah[maxMatkul];
        this.jumlahMatkul = 0;
    }

    public boolean tambahMatakuliah(mataKuliah matkul) {
        if (jumlahMatkul < maxMatkul) {
            daftarMatakuliah[jumlahMatkul] = matkul;
            jumlahMatkul++;
            System.out.println("\nNote: Mata kuliah " + matkul.getNama() + " berhasil ditambahkan.");
            return true;
        } else {
            System.out.println("\nNote: KRS sudah penuh! Maksimal " + maxMatkul + " mata kuliah.");
            return false;
        }
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
            mataKuliah mk = daftarMatakuliah[i];
            totalBobot += mk.getBobotNilai() * mk.getSks();
            totalSKS += mk.getSks();
        }
        return totalSKS > 0 ? totalBobot / totalSKS : 0.0;
    }

    public void tampilkanKRS() {
        System.out.println("==================================================================");
        System.out.println("              KARTU RENCANA STUDI (KRS)                           ");
        System.out.println("==================================================================");
        System.out.println("Nama Mahasiswa : " + mahasiswa.getNama());
        System.out.println("NPM            : " + mahasiswa.getNim());
        System.out.println("Maks. Matkul   : " + maxMatkul + " mata kuliah.");
        System.out.println("------------------------------------------------------------------");
        System.out.println("| KODE | NAMA MATA KULIAH               | SKS  | NILAI |");
        System.out.println("------------------------------------------------------------------");

        if (jumlahMatkul == 0) {
            System.out.println("| Belum ada mata kuliah yang diambil.                            |");
            System.out.println("------------------------------------------------------------------");
        } else {
            for (int i = 0; i < jumlahMatkul; i++) {
                daftarMatakuliah[i].tampilkanInfo();
            }
            System.out.println("------------------------------------------------------------------");
        }
        System.out.printf("Total SKS Semester: %d\n", hitungTotalSKS());
        System.out.printf("IPK Semester: %.2f\n", hitungIPK());
        System.out.println("==================================================================\n");
    }

    public mataKuliah cariMatakuliahByKode(String kode) {
        for (int i = 0; i < jumlahMatkul; i++) {
            if (daftarMatakuliah[i].getKode().equalsIgnoreCase(kode)) {
                return daftarMatakuliah[i];
            }
        }
        return null;
    }
}

````

5. Terakhir Buat class Main untuk menguji:
````declarative
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
            System.out.println("[2]. Input Nilai Mata Kuliah");
            System.out.println("[3]. Tampilkan KRS");
            System.out.println("[4]. Keluar");
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

                case 2:
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

                case 3:
                    krs.tampilkanKRS();
                    break;

                case 4:
                    System.out.println("Terima kasih!");
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }
}
````

6. Jalankan program, kemudian lakukan ujicoba dengan berbagai input.
7. Amati bagaimana object menyimpan data, juga bagaimana method bekerja.


## Tugas:
Modifikasi kode diatas sesuai dengan instruksi berikut:

- Tambahkan fitur untuk menghapus mata kuliah dari KRS
- Buat validasi agar total SKS tidak melebihi batas tertentu (misalnya 24 SKS)
- Tambahkan method untuk menampilkan mata kuliah dengan nilai terbaik dan terburuk



### 1. Perubahan untuk file mataKuliah.java
- Di dalam method getKode(), ganti isinya menjadi seperti ini:
````declarative
public String getKode() {
return kode; // Ganti 'return nama;' menjadi 'return kode;'
}
````

### 2. Tambahan untuk file kartuRencanaStudi.java
- Tambahkan variabel ini di bagian atas bersama variabel lain:
````declarative
private final int MAX_SKS = 24; // Batas maksimal SKS
````

- Sisipkan validasi SKS ini di awal method tambahMatakuliah():
````declarative
// Letakkan ini di dalam method tambahMatakuliah()
if (hitungTotalSKS() + matkul.getSks() > MAX_SKS) {
    System.out.println("\nNote: Gagal menambah! Total SKS akan melebihi batas " + MAX_SKS + " SKS.");
    return false;
}
````

- Tambahkan dua method baru ini di mana saja di dalam kelas kartuRencanaStudi:
````declarative
// Method untuk menghapus mata kuliah
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

// Method untuk menampilkan nilai terbaik dan terburuk
public void tampilkanNilaiEkstrem() {
    if (jumlahMatkul == 0) {
        System.out.println("\nNote: Belum ada mata kuliah yang diinput.");
        return;
    }

    mataKuliah terbaik = daftarMatakuliah[0];
    mataKuliah terburuk = daftarMatakuliah[0];

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
````

### 3. Perubahan untuk file main.java
- Ganti blok menu yang lama dengan yang ini:
````declarative
System.out.println("\n=================================");
System.out.println("            MENU KRS             ");
System.out.println("=================================");
System.out.println("[1]. Tambah Mata Kuliah");
System.out.println("[2]. Hapus Mata Kuliah");
System.out.println("[3]. Input Nilai Mata Kuliah");
System.out.println("[4]. Lihat Nilai Terbaik/Terburuk");
System.out.println("[5]. Tampilkan KRS");
System.out.println("[6]. Keluar");
System.out.println("---------------------------------");
System.out.print("Pilih menu: ");
````

- Di dalam switch (pilihan), sisipkan dua case baru dan sesuaikan nomor case yang lama:
````declarative
// ... setelah case 1 ...

case 2: // Tambahan baru
    System.out.println("\n--- HAPUS MATA KULIAH ---");
    System.out.print("Masukkan Kode Mata Kuliah yang akan dihapus: ");
    String kodeHapus = input.nextLine();
    krs.hapusMatakuliah(kodeHapus);
    break;

case 3: // Sebelumnya case 2
    // ... (isi case 3 sama seperti case 2 yang lama) ...
    break;

case 4: // Tambahan baru
    krs.tampilkanNilaiEkstrem();
    break;

case 5: // Sebelumnya case 3
    // ... (isi case 5 sama seperti case 3 yang lama) ...
    break;

case 6: // Sebelumnya case 4
    // ... (isi case 6 sama seperti case 4 yang lama) ...
    break;

// ... default ...
````

### 4. Output:
````declarative
"C:\Program Files\Amazon Corretto\jdk11.0.28_6\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.2.1\lib\idea_rt.jar=62440" -Dfile.encoding=UTF-8 -classpath C:\java-pbo\praktikum-pbo-2024573010115\out\production\praktikum-pbo-2024573010115 modul_4.Main
------------------------------------------------------------------
                 SISTEM KARTU RENCANA STUDI (KRS)                 
------------------------------------------------------------------

Input Data Mahasiswa:
Nama Mahasiswa: Ibra Khalid Londang
NIM: 2024573010115
Jurusan: Teknik Informatika

=================================
            MENU KRS             
=================================
[1]. Tambah Mata Kuliah
[2]. Hapus Mata Kuliah
[3]. Input Nilai Mata Kuliah
[4]. Lihat Nilai Terbaik/Terburuk
[5]. Tampilkan KRS
[6]. Keluar
---------------------------------
Pilih menu: 1

--- TAMBAH MATA KULIAH ---
Kode Mata Kuliah: 01PBO
Nama Mata Kuliah: Pemrograman Berorientasi Object
Jumlah SKS: 2

Note: Mata kuliah Pemrograman Berorientasi Object berhasil ditambahkan.

=================================
            MENU KRS             
=================================
[1]. Tambah Mata Kuliah
[2]. Hapus Mata Kuliah
[3]. Input Nilai Mata Kuliah
[4]. Lihat Nilai Terbaik/Terburuk
[5]. Tampilkan KRS
[6]. Keluar
---------------------------------
Pilih menu: 1

--- TAMBAH MATA KULIAH ---
Kode Mata Kuliah: 02PBO
Nama Mata Kuliah: Pemrograman Berorientasi Object Theory
Jumlah SKS: 2

Note: Mata kuliah Pemrograman Berorientasi Object Theory berhasil ditambahkan.

=================================
MENU KRS
=================================
[1]. Tambah Mata Kuliah
[2]. Hapus Mata Kuliah
[3]. Input Nilai Mata Kuliah
[4]. Lihat Nilai Terbaik/Terburuk
[5]. Tampilkan KRS
[6]. Keluar
---------------------------------
Pilih menu: 1

--- TAMBAH MATA KULIAH ---
Kode Mata Kuliah: 03RPL
Nama Mata Kuliah: Rekayasa Perangkat Lunak
Jumlah SKS: 2

Note: Mata kuliah Rekayasa Perangkat Lunak berhasil ditambahkan.

=================================
            MENU KRS             
=================================
[1]. Tambah Mata Kuliah
[2]. Hapus Mata Kuliah
[3]. Input Nilai Mata Kuliah
[4]. Lihat Nilai Terbaik/Terburuk
[5]. Tampilkan KRS
[6]. Keluar
---------------------------------
Pilih menu: 2

--- HAPUS MATA KULIAH ---
Masukkan Kode Mata Kuliah yang akan dihapus: 02PBO

Note: Mata kuliah Pemrograman Berorientasi Object Theory berhasil dihapus.

=================================
MENU KRS
=================================
[1]. Tambah Mata Kuliah
[2]. Hapus Mata Kuliah
[3]. Input Nilai Mata Kuliah
[4]. Lihat Nilai Terbaik/Terburuk
[5]. Tampilkan KRS
[6]. Keluar
---------------------------------
Pilih menu: 3

--- INPUT NILAI ---
Kode Mata Kuliah: 01PBO
Input Nilai (0-100): 97
Nilai berhasil diinputkan!

=================================
MENU KRS
=================================
[1]. Tambah Mata Kuliah
[2]. Hapus Mata Kuliah
[3]. Input Nilai Mata Kuliah
[4]. Lihat Nilai Terbaik/Terburuk
[5]. Tampilkan KRS
[6]. Keluar
---------------------------------
Pilih menu: 3

--- INPUT NILAI ---
Kode Mata Kuliah: 03RPL
Input Nilai (0-100): 89
Nilai berhasil diinputkan!

=================================
MENU KRS
=================================
[1]. Tambah Mata Kuliah
[2]. Hapus Mata Kuliah
[3]. Input Nilai Mata Kuliah
[4]. Lihat Nilai Terbaik/Terburuk
[5]. Tampilkan KRS
[6]. Keluar
---------------------------------
Pilih menu: 4

--- NILAI TERBAIK & TERBURUK ---
Nilai Terbaik  : 01PBO      Pemrograman Berorientasi Object 2 SKS | Nilai 97.00 (A)
Nilai Terburuk : 03RPL      Rekayasa Perangkat Lunak       2 SKS | Nilai 89.00 (A)
----------------------------------

=================================
MENU KRS
=================================
[1]. Tambah Mata Kuliah
[2]. Hapus Mata Kuliah
[3]. Input Nilai Mata Kuliah
[4]. Lihat Nilai Terbaik/Terburuk
[5]. Tampilkan KRS
[6]. Keluar
---------------------------------
Pilih menu: 5

==================================================================
KARTU RENCANA STUDI (KRS)
==================================================================
Nama Mahasiswa : Ibra Khalid Londang
NIM            : 2024573010115
Maks. Matkul   : 10 mata kuliah.
Batas SKS      : 24 SKS.
------------------------------------------------------------------
KODE       NAMA MATA KULIAH               SKS | NILAI
------------------------------------------------------------------
01PBO      Pemrograman Berorientasi Object 2 SKS | Nilai 97.00 (A)
03RPL      Rekayasa Perangkat Lunak       2 SKS | Nilai 89.00 (A)
------------------------------------------------------------------
Total SKS Semester: 4
IPK Semester      : 4.00
==================================================================
````

#### selesai.