package modul_3;

import java.util.Scanner;

public class TextProcessing {

    public static void prosesDataMahasiswa(String data) {
        System.out.println("\n=== PENGOLAHAN DATA MAHASISWA ===");
        String[] dataMahasiswa = data.split(",");

        System.out.println("Data yang dimasukkan:");
        for (int i = 0; i < dataMahasiswa.length; i++) {
            dataMahasiswa[i] = dataMahasiswa[i].trim();
            System.out.println((i + 1) + ". " + dataMahasiswa[i]);
        }

        if (dataMahasiswa.length > 0 && !dataMahasiswa[0].isEmpty()) {
            System.out.println("\n=== ANALISIS DATA ===");
            System.out.println("Jumlah mahasiswa: " + dataMahasiswa.length);

            String namaTerpanjang = dataMahasiswa[0];
            String namaTerpendek = dataMahasiswa[0];

            for (String nama : dataMahasiswa) {
                if (nama.length() > namaTerpanjang.length()) {
                    namaTerpanjang = nama;
                }
                if (nama.length() < namaTerpendek.length()) {
                    namaTerpendek = nama;
                }
            }
            System.out.println("Nama terpanjang: " + namaTerpanjang + " (" + namaTerpanjang.length() + " karakter)");
            System.out.println("Nama terpendek: " + namaTerpendek + " (" + namaTerpendek.length() + " karakter)");

            System.out.println("\n=== FORMAT DATA ===");
            for (String nama : dataMahasiswa) {
                String namaFormatted = formatTitleCase(nama);
                String inisial = buatInisial(namaFormatted);
                System.out.println("Nama lengkap: " + namaFormatted);
                System.out.println("Inisial: " + inisial);
                System.out.println("Username: " + buatUsername(namaFormatted));
                System.out.println("---");
            }
        }
    }

    public static String formatTitleCase(String teks) {
        String[] kata = teks.toLowerCase().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String k : kata) {
            if (k.length() > 0) {
                result.append(Character.toUpperCase(k.charAt(0)))
                        .append(k.substring(1))
                        .append(" ");
            }
        }
        return result.toString().trim();
    }

    public static String buatInisial(String nama) {
        String[] kata = nama.split("\\s+");
        StringBuilder inisial = new StringBuilder();
        for (String k : kata) {
            if (k.length() > 0) {
                inisial.append(Character.toUpperCase(k.charAt(0)));
            }
        }
        return inisial.toString();
    }

    public static String buatUsername(String nama) {
        String[] kata = nama.split("\\s+");
        return kata[0].toLowerCase();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Contoh: Alice Johnson, Bob Smith, CHARLIE BROWN");
        System.out.print("Masukkan daftar nama (dipisahkan koma): ");
        String dataInput = input.nextLine();
        prosesDataMahasiswa(dataInput);
        input.close();
    }
}