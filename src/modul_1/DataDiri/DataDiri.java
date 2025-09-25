package modul_1.DataDiri;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DataDiri {
    public static void main (String[] args) {
        String nama = "Ibra Khalid Londang";
        String nim = "2024573010115";
        String jurusan = "TIK";
        String prodi = "Teknik Informatika";
        int umur = 19;
        LocalDate TglLahir = LocalDate.of(2006, 05, 06);
        int TB = 175;
        int BB = 55;
        String hobi = "Mancing";

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("nama: " + nama);
        System.out.println("nim: " + nim);
        System.out.println("jurusan: " + jurusan);
        System.out.println("prodi: " + prodi);
        System.out.println("umur: " + umur);
        System.out.println(("Tanggal Lahir: " + TglLahir.format(format)));
        System.out.println("TB: " + TB);
        System.out.println("BB: " + BB);
        System.out.println("hobi: " + hobi);



    }
}
