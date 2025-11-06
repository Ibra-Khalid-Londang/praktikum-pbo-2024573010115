**Mata Kuliah:** Praktikum Pemrograman Berorientasi Objek   
**Nama:** [Ibra Khalid Londang]  
**NIM:** [2024573010115]  
**Kelas:** [TI 1A]

---


## Modul 6: Inheritance

### Pendahuluan
Inheritance (Pewarisan) adalah salah satu prinsip fundamental dalam Object-Oriented Programming (OOP) yang memungkinkan sebuah class (subclass/child class) mewarisi sifat dan perilaku dari class lain (superclass/parent class). Dengan inheritance, kita dapat menghindari duplikasi kode dan meningkatkan reusability.

#### Tujuan Encapsulation
1. Code Reusability - Menggunakan kembali kode yang sudah ada tanpa menulis ulang.
2. Method Overriding - Memungkinkan subclass mengimplementasikan ulang method dari parent class.
3. Polymorphism - Memungkinkan objek subclass diperlakukan sebagai objek superclass.
4. Extensibility - Memperluas fungsionalitas class yang sudah ada.
5. Hierarchical Classification - Membuat hubungan hierarki antar class.- Membuat kode lebih modular dan terorganisiri dari OOP adalah mendesain software dengan membagi masalah menjadi serangkaian objek yang saling berinteraksi. Ini bertentangan dengan pemrograman prosedural, yang fokus pada fungsi/prosedur dalam memproses data. OOP memungkinkan kita untuk membuat kode yang lebih modular, reusable, dan mudah di-maintain.

#### Cara Implementasi
1. Gunakan kata kunci extends untuk mewarisi dari sebuah class.
2. Subclass dapat mengakses anggota (fields dan methods) yang bersifat protected dan public dari superclass.
3. Subclass dapat mengoverride method dari superclass.
4. Gunakan kata kunci super untuk mengakses anggota superclass.


#### Jenis-jenis Inheritance:
##### Single Inheritance
Single inheritance terjadi ketika sebuah class turunan hanya mewarisi dari satu class induk. Ini adalah bentuk pewarisan yang paling sederhana, di mana class turunan mendapatkan semua metode dan properti dari satu class induk saja.

##### Multiple Inheritance
Multiple inheritance memungkinkan sebuah class turunan untuk mewarisi dari lebih dari satu class induk. Artinya, class turunan dapat menggabungkan fungsionalitas dari beberapa class induk. Multiple inheritance lebih kompleks dan harus ditangani dengan hati-hati untuk menghindari masalah seperti diamond problem, di mana class turunan mewarisi dari dua class induk yang memiliki class dasar sama.

##### Hierarchical Inheritance
Hierarchical inheritance terjadi saat beberapa class turunan mewarisi dari satu class induk yang sama. Jenis ini sering digunakan untuk mengelompokkan fungsionalitas yang serupa ke dalam satu class induk, sementara memungkinkan variasi dalam class turunan.

##### Multilevel Inheritance
Dalam multilevel inheritance, sebuah class turunan mewarisi dari class turunan lain, sementara class yang sendiri mewarisi dari class induk. Jenis ini menciptakan "rantai" pewarisan. Misalnya, class C mewarisi dari class B, dan class B mewarisi dari class A.

##### Hybrid Inheritance
Hybrid inheritance adalah kombinasi dari dua atau lebih jenis inheritance yang sebelumnya sudah disebutkan di atas. Kondisi ini sering terjadi dalam sistem yang lebih kompleks, di mana berbagai bentuk inheritance dipakai bersama-sama untuk mencapai fleksibilitas dan efisiensi yang diinginkan.





## Praktikum 1: Memahami Single Inheritance

### Langkah-Langkah
1. Buat sebuah package baru di dalam package modul_6 dengan nama praktikum_1
2. Buat class Person sebagai superclass:

````declarative
package modul_6.praktikum_1;

public class Person {
protected String name;
protected int age;

public Person(String name, int age) {
this.name=name;
this.age=age;
}

public void displayInfo() {
System.out.println("Name: " + name);
System.out.println("Age: " + age);

}

public void greet() {
System.out.println("Hello. I am a person.");
}
}

````

3. Buat class Student sebagai subclass yang mewarisi Person:
````declarative
package modul_6.praktikum_1;

public class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId=studentId;
    }

    public void study() {
        System.out.println(name+ " is studying.");

    }

    @Override
    public void displayInfo() {

            System.out.println("hello, I am a student named " + name);

    }
}

````

4. Buat class InheritanceTest untuk testing:
````declarative
package modul_6.praktikum_1;

public class InheritancetTest {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20, "S12345");

        student.displayInfo();

        student.study();

        student.greet();

        Person person= new Student("Bob", 22, "S67890");
        person.greet();
    }
}

````
5. Jalankan program dan amati hasilnya
6. Perhatikan bagaimana subclass mewarisi dan memperluas fungsionalitas superclass



## Praktikum 2: Method Overriding dan Kata Kunci super

### Langkah-Langkah
1. Buat sebuah package baru di dalam package modul_6 dengan nama praktikum_2
2. Buat class Vehicle sebagai superclass:

````declarative
package modul_6.praktikum_2;

public class Vehicle {
protected String brand;
protected int speed;

public Vehicle(String brand, int speed) {
this.brand = brand;
this.speed = speed;

}

public void start() {
System.out.println("Vehicle is starting...");

}

public void displayInfo() {
System.out.println("Brand: " + brand);
System.out.println("Speed: " + speed + " km/h");
}
}

````

3. Buat class Car sebagai subclass yang mewarisi Vehicle:

````declarative
package modul_6.praktikum_2;

public class Car extends  Vehicle {
private int numberOfDoors;

public Car(String brand, int speed, int numberOfDoors) {
super (brand, speed);
this.numberOfDoors = numberOfDoors;

}

@Override
public void start() {
super.start();
System.out.println("Car engine is running smoothly");

}

@Override
public void displayInfo() {
super.displayInfo();
System.out.println("Number of doors: " + numberOfDoors);

}

public void honk() {
System.out.println("Been beep!");
}
}
````
4. Buat class OverrideTest untuk testing:
````declarative
package modul_6.praktikum_2;

public class OverrideTest {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 180, 4);

        car.start();
        car.displayInfo();
        car.honk();


        Vehicle vehicle= new Car("Honda", 200, 2);
        vehicle.start();
        vehicle.displayInfo();
    }
}

````
5. Jalankan program dan amati:
- Cara method overriding bekerja
- Penggunaan kata kunci super untuk mengakses superclass
- Konsep polymorphism dalam inheritance



## Praktikum 3: Multilevel dan Hierarchical Inheritance

### Langkah-langkah
1. Buat sebuah package baru di dalam package modul_6 dengan nama praktikum_3
2. Buat class Animal sebagai superclass:

````declarative
package modul_6.praktikum_3;

public class Animal {
protected String name;

public Animal(String name){
this.name = name;
}

public void eat() {
System.out.println(name + " is eating.");
}

public void sleep() {
System.out.println(name + " is sleeping.");
}
}

````
3. Buat class Mamalia yang mewarisi Animal (multilevel inheritance):
````declarative
package modul_6.praktikum_3;

public class Mamalia extends Animal {
protected String furColor;

public Mamalia(String name, String furColor) {
super(name);
this.furColor = furColor;
}

public void giveBirth() {
System.out.println(name + " is giving birth to live young.");
}
}

````
4. Buat class Dog yang mewarisi Mammal (multilevel inheritance):

````declarative
package modul_6.praktikum_3;

public class Dog extends Mamalia {
    private String breed;

    public Dog(String name, String furColor, String breed) {
        super(name, furColor);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " is barking: gugg guug!");
    }

    @Override
    public void eat () {
        System.out.println(name + " the dog is eating dog food.");
    }
}

````
5. Buat class Cat yang mewarisi Mammal (hierarchical inheritance):

````declarative
package modul_6.praktikum_3;

public class Cat extends Mamalia {
    private boolean isIndoor;

    public Cat(String name, String furColor, boolean isIndoor) {
        super(name, furColor);
        this.isIndoor = isIndoor;
    }

    public void meow() {
        System.out.println(name + " is meowing: meow meow!");
    }

    @Override
    public void eat() {
        System.out.println(name+ "The cat is eating cat food.");
    }
}

````

6. Buat class InheritanceTypeTest untuk testing:

````declarative
package modul_6.praktikum_3;

public class InheritanceTypeTest {
    public static void main(String[] args) {

        Dog dog = new Dog("Buddy", "Brown", "Cihuahua");
        dog.eat();
        dog.sleep();
        dog.giveBirth();
        dog.bark();

        System.out.println();

        Cat cat = new Cat("Anggora", "Persia", true);
        cat.eat();
        cat.sleep();
        cat.giveBirth();
        cat.meow();

        System.out.println();

        Animal[] animals = {new Dog ("Max", "Black", "Labrador"), new Cat("Luna", "Gray", false)};

        for (Animal animal: animals) {
            animal.eat();
        }
    }
}

````
7. Jalankan program dan amati:
- Cara multilevel inheritance membentuk rantai pewarisan.
- Cara hierarchical inheritance memungkinkan multiple class mewarisi dari satu superclass.
- Polymorphism bekerja dengan inheritance hierarchy.

## Praktikum 4: Sistem Manajemen Perpustakaan Sederhana

### Langkah-langkah
1. Buat sebuah package baru di dalam package modul_6 dengan nama praktikum_4
2. Buat class LibraryItem sebagai superclass:

````declarative
package modul_6.praktikum_4;

public abstract class LibraryItem {
    protected String itemId;
    protected String title;
    protected int year;
    protected boolean isAvailable;

    public LibraryItem(String itemId, String title, int year) {
        this.itemId = itemId;
        this.title = title;
        this.year = year;
        this.isAvailable = true;
    }

    // Getter methods
    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public int getYear() { return year; }
    public boolean isAvailable() { return isAvailable; }

    // Setter methods
    public void setAvailable(boolean available) { isAvailable = available; }

    // Abstract method yang harus diimplementasikan subclass
    public abstract void displayInfo();

    // Concrete method yang bisa digunakan semua subclass
    public void borrowItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " berhasil dipinjam");
        } else {
            System.out.println(title + " sedang tidak tersedia");
        }
    }

    public void returnItem() {
        isAvailable = true;
        System.out.println(title + " berhasil dikembalikan");
    }
}
````
3. Buat class Book yang mewarisi LibraryItem:

````declarative
package modul_6.praktikum_4;

public class Book extends LibraryItem {
    private String author;
    private String isbn;
    private int numberOfPages;

    public Book(String itemId, String title, int year, String author, String isbn, int numberOfPages) {
        super(itemId, title, year);
        this.author = author;
        this.isbn = isbn;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void displayInfo() {
        System.out.println("BUKU");
        System.out.println("--------------------------");
        System.out.println("ID: " + itemId);
        System.out.println("Judul: " + title);
        System.out.println("Penulis: " + author);
        System.out.println("Tahun: " + year);
        System.out.println("ISBN: " + isbn);
        System.out.println("Jumlah Halaman: " + numberOfPages);
        System.out.println("Status: " + (isAvailable ? "Tersedia" : "Dipinjam"));
        System.out.println("--------------------------");
    }
    public String getAuthor() {
        return this.author;
    }

    // Method khusus Book
    public void readSample() {
        System.out.println("Membaca sample dari buku: " + title);
    }
}

````

4. Buat class Magazine yang mewarisi LibraryItem:
````declarative
package modul_6.praktikum_4;

public class Magazine extends LibraryItem {
    private String publisher;
    private int issueNumber;
    private String category;

    public Magazine(String itemId, String title, int year, String publisher, int issueNumber, String category) {
        super(itemId, title, year);
        this.publisher = publisher;
        this.issueNumber = issueNumber;
        this.category = category;
    }

    @Override
    public void displayInfo() {
        System.out.println("-------- MAJALAH --------");
        System.out.println("ID: " + itemId);
        System.out.println("Judul: " + title);
        System.out.println("Penerbit: " + publisher);
        System.out.println("Tahun: " + year);
        System.out.println("Edisi: " + issueNumber);
        System.out.println("Kategori: " + category);
        System.out.println("Status: " + (isAvailable ? "Tersedia" : "Dipinjam"));
        System.out.println("--------------------------");
    }

    // Method khusus Magazine
    public void browseArticles() {
        System.out.println("Menelusuri artikel dalam majalah: " + title);
    }
}

````

5. Buat class DVD yang mewarisi LibraryItem:

````declarative
package modul_6.praktikum_4;

public class DVD extends LibraryItem {
    private String director;
    private int duration; // dalam menit
    private String genre;

    public DVD(String itemId, String title, int year, String director, int duration, String genre) {
        super(itemId, title, year);
        this.director = director;
        this.duration = duration;
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("---- DVD ----");
        System.out.println("ID: " + itemId);
        System.out.println("Judul: " + title);
        System.out.println("Sutradara: " + director);
        System.out.println("Tahun: " + year);
        System.out.println("Durasi: " + duration + " menit");
        System.out.println("Genre: " + genre);
        System.out.println("Status: " + (isAvailable ? "Tersedia" : "Dipinjam"));
        System.out.println("--------------------------");
    }

    // Method khusus DVD
    public void playTrailer() {
        System.out.println("Memutar trailer DVD: " + title);
    }
}


````
6. Buat class LibraryManagementSystem sebagai main class:

````declarative
package modul_6.praktikum_4;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {
    private static ArrayList<LibraryItem> libraryItems = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeSampleData();

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    displayAllItems();
                    break;
                case 2:
                    borrowItem();
                    break;
                case 3:
                    returnItem();
                    break;
                case 4:
                    addNewItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan sistem perpustakaan!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n--- SISTEM MANAJEMEN PERPUSTAKAAN ---");
        System.out.println("1. Tampilkan Semua Item");
        System.out.println("2. Pinjam Item");
        System.out.println("3. Kembalikan Item");
        System.out.println("4. Tambah Item Baru");
        System.out.println("5. Cari Item");
        System.out.println("6. Keluar");
    }

    private static void initializeSampleData() {
        // Tambahkan sample data
        libraryItems.add(new Book("B001", "Pemrograman Java", 2023, "Budi Santoso", "978-1234567890", 350));
        libraryItems.add(new Book("B002", "Struktur Data", 2022, "Sari Dewi", "978-0987654321", 280));
        libraryItems.add(new Magazine("M001", "National Geographic", 2024, "MG Media", 245, "Sains"));
        libraryItems.add(new DVD("D001", "The Java Documentary", 2023, "John Programmer", 120, "Edukasi"));
    }

    private static void displayAllItems() {
        System.out.println("\n--- DAFTAR SEMUA ITEM PERPUSTAKAAN ---");
        for (LibraryItem item : libraryItems) {
            item.displayInfo();
            System.out.println();
        }
    }

    private static void borrowItem() {
        System.out.print("Masukkan ID item yang ingin dipinjam: ");
        String itemId = scanner.nextLine();

        for (LibraryItem item : libraryItems) {
            if (item.getItemId().equalsIgnoreCase(itemId)) {
                item.borrowItem();
                return;
            }
        }
        System.out.println("Item dengan ID " + itemId + " tidak ditemukan!");
    }

    private static void returnItem() {
        System.out.print("Masukkan ID item yang ingin dikembalikan: ");
        String itemId = scanner.nextLine();

        for (LibraryItem item : libraryItems) {
            if (item.getItemId().equalsIgnoreCase(itemId)) {
                item.returnItem();
                return;
            }
        }
        System.out.println("Item dengan ID " + itemId + " tidak ditemukan!");
    }

    private static void addNewItem() {
        System.out.println("\n--- TAMBAH ITEM BARU ---");
        System.out.println("1. Buku");
        System.out.println("2. Majalah");
        System.out.println("3. DVD");
        System.out.print("Pilih jenis item: ");
        int type = scanner.nextInt();
        scanner.nextLine();

        System.out.print("ID Item: ");
        String itemId = scanner.nextLine();
        System.out.print("Judul: ");
        String title = scanner.nextLine();
        System.out.print("Tahun: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        switch (type) {
            case 1:
                System.out.print("Penulis: ");
                String author = scanner.nextLine();
                System.out.print("ISBN: ");
                String isbn = scanner.nextLine();
                System.out.print("Jumlah Halaman: ");
                int pages = scanner.nextInt();
                libraryItems.add(new Book(itemId, title, year, author, isbn, pages));
                break;
            case 2:
                System.out.print("Penerbit: ");
                String publisher = scanner.nextLine();
                System.out.print("Edisi: ");
                int issue = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Kategori: ");
                String category = scanner.nextLine();
                libraryItems.add(new Magazine(itemId, title, year, publisher, issue, category));
                break;
            case 3:
                System.out.print("Sutradara: ");
                String director = scanner.nextLine();
                System.out.print("Durasi (menit): ");
                int duration = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Genre: ");
                String genre = scanner.nextLine();
                libraryItems.add(new DVD(itemId, title, year, director, duration, genre));
                break;
            default:
                System.out.println("Jenis item tidak valid!");
                return;
        }
        System.out.println("Item berhasil ditambahkan!");
    }

    private static void searchItem() {
        System.out.print("Masukkan kata kunci pencarian (judul/penulis): ");
        String keyword = scanner.nextLine().toLowerCase();

        System.out.println("\n--- HASIL PENCARIAN ---");
        boolean found = false;

        for (LibraryItem item : libraryItems) {
            // 1. Cek apakah judulnya cocok
            boolean titleMatch = item.getTitle().toLowerCase().contains(keyword);

            // 2. Cek apakah penulisnya cocok (HANYA JIKA item adalah Book)
            boolean authorMatch = false;
            if (item instanceof Book) { // Cek apakah item ini adalah sebuah Book
                Book book = (Book) item; // Casting: Ubah item menjadi Book agar bisa ambil author
                authorMatch = book.getAuthor().toLowerCase().contains(keyword);
            }

            // 3. Tampilkan jika salah satu cocok (judul ATAU penulis)
            if (titleMatch || authorMatch) {
                item.displayInfo();
                System.out.println();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Tidak ada item yang sesuai dengan pencarian.");
        }
    }
}

````

7. Jalankan program dan uji semua fitur:
- Menampilkan semua item
- Meminjam dan mengembalikan item
- Menambah item baru
- Mencari item berdasarkan kata kunci



#### selesai.