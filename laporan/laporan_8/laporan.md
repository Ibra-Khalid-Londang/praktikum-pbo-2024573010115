**Mata Kuliah:** Praktikum Pemrograman Berorientasi Objek   
**Nama:** [Ibra Khalid Londang]  
**NIM:** [2024573010115]  
**Kelas:** [TI 1A]

---


## Praktikum: Abstraction

### Pendahuluan
Abstraksi adalah konsep dalam object-oriented programming (OOP) yang bertujuan untuk menyederhanakan kompleksitas sistem dengan menyembunyikan detail-detail teknis yang tidak perlu.

Inti dari abstraksi adalah tentang fokus pada 'apa' yang dilakukan suatu objek atau komponen, bukan 'bagaimana' hal itu dilakukan. Dalam praktiknya, abstraksi membantu programmer mendefinisikan interface, menunjukkan operasi yang dapat dilakukan oleh suatu objek, tanpa harus menyertakan detail tentang logika internal atau implementasi di balik operasi tersebut.

Misalnya, ketika menggunakan remote TV, kita hanya perlu tahu cara mengoperasikannya tanpa harus memahami mekanisme internalnya. Dalam OOP, objek menyediakan abstraksi yang menyembunyikan detail implementasi internal. Seperti remote TV, user hanya perlu tahu metode apa dari objek yang tersedia untuk dipanggil dan parameter input apa yang diperlukan untuk memicu operasi tertentu.

Dalam desain software, abstraksi berguna agar sistem dapat dibagi menjadi komponen-komponen yang lebih kecil dan lebih mudah dikelola, di mana masing-masing menyembunyikan kompleksitasnya sendiri. Hal ini tidak hanya memudahkan proses pengembangan, tetapi juga memfasilitasi maintenance dan testing software.

Selain itu, abstraksi juga bisa dipakai untuk mengubah implementasi internal suatu komponen tanpa memengaruhi komponen lain yang berinteraksi dengan komponen tersebut, asalkan interface yang digunakan tetap konsisten.

#### Fungsi Abstraksi
1. Menyederhanakan kompleksitas: abstraksi membantu dalam menyederhanakan sistem yang kompleks. Dengan menyembunyikan detail internal dan menampilkan hanya fungsionalitas yang diperlukan, abstraksi membantu programmer untuk tidak terbebani oleh kompleksitas yang tidak relevan.
2. Meningkatkan modularitas: abstraksi mendukung pembuatan modul yang dapat digunakan kembali. Dengan mendefinisikan interface yang jelas, modul dapat dikembangkan secara independen dan digunakan dalam berbagai konteks tanpa perlu mengetahui detail internalnya.
3. Memudahkan maintenance: kode yang mengimplementasikan abstraksi lebih mudah dipelihara dan diperbarui. Perubahan pada implementasi internal suatu modul tidak memengaruhi modul lain yang menggunakan interface abstrak tersebut.
4. Meningkatkan keamanan: dengan menyembunyikan detail internal, abstraksi akan meningkatkan keamanan software. Hal ini mencegah akses tidak sah ke data internal atau manipulasi fungsi internal.
5. Memfasilitasi kolaborasi: dalam proyek besar dengan banyak developer, abstraksi memungkinkan tim untuk bekerja secara paralel pada komponen yang berbeda. Setiap tim fokus pada tugasnya sendiri tanpa perlu memahami keseluruhan sistem.
6. Mendukung polimorfisme dan penggunaan ulang kode: abstraksi mendukung penggunaan polimorfisme, di mana objek dari class berbeda dapat diakses melalui interface yang sama. Ini meningkatkan fleksibilitas dan penggunaan ulang kode.
7. Mendukung pemisahan antara interface dan implementasi: abstraksi bisa memisahkan apa yang dilakukan suatu objek (interface) dan bagaimana hal itu dilakukan (implementasi). Ini memudahkan pemahaman dan pengembangan software.


#### Jenis-jenis Abstraksi:
##### Abstraksi data (data abstraction)
Data abstraction terjadi ketika data objek tidak terlihat oleh dunia luar. Akses ke data objek (jika diperlukan) disediakan melalui beberapa metode. Abstraksi data memastikan detail internal objek tetap tersembunyi, sementara fungsionalitas yang diperlukan dapat diakses.

##### Abstraksi proses (process abstraction)
Process abstraction terjadi ketika implementasi internal dari berbagai fungsi yang terlibat dalam operasi user disembunyikan. Artinya, detail tentang bagaimana fungsi tertentu diimplementasikan tidak terlihat oleh user, hanya hasil akhirnya yang penting.


##### Contoh Abstraksi
Contoh dari abstraksi adalah penggunaan aplikasi pengolah kata, seperti Microsoft Word. Microsoft Word adalah aplikasi pengolah kata untuk membuat, mengedit, dan memformat dokumen teks. Aplikasi ini menyediakan berbagai fitur seperti pengecekan ejaan dan tata bahasa, format teks, penambahan gambar, dan pembuatan tabel.

Beberapa fitur yang ditawarkan Microsoft Word yaitu:

- Pembuatan dan pengeditan Dokumen
- Pengecekan ejaan dan tata bahasa
- Insert object
- Template dan desain dokumen
- Microsoft Word mengabstraksikan kompleksitas pemrosesan fitur-fitur di atas. User tidak perlu memahami detail teknis tentang pemformatan teks atau pengelolaan dokumen. Sebaliknya, mereka hanya perlu menggunakan user interface intuitif untuk mencapai hasil yang diinginkan. Proses seperti rendering teks, penanganan margin dan spasi, serta konversi format file, semua diabstraksikan oleh aplikasi.



## Praktikum 1: Memahami Abstract Class dan Abstract Method

### Langkah-Langkah
1. Buat sebuah package baru di dalam package modul_8 dengan nama praktikum_1
2. Buat abstract class Shape:


````declarative
package modul_8.praktikum_1;

public abstract class Shape {
protected String color;
protected boolean filled;

// Constructor
public Shape(String color, boolean filled) {
this.color = color;
this.filled = filled;
}

// Abstract methods - harus diimplementasikan subclass
public abstract double calculateArea();
public abstract double calculatePerimeter();

// Concrete methods - sudah memiliki implementasi
public String getColor() {
return color;
}

public void setColor(String color) {
this.color = color;
}

public boolean isFilled() {
return filled;
}

public void setFilled(boolean filled) {
this.filled = filled;
}

// Concrete method yang bisa dioverride
public void displayInfo() {
System.out.println("Shape Color: " + color);
System.out.println("Filled: " + filled);
}
}

````

3. Buat class Circle yang mewarisi Shape:

````declarative
package modul_8.praktikum_1;

public class Circle extends Shape {
private double radius;

public Circle(String color, boolean filled, double radius) {
super(color, filled);
this.radius = radius;
}

// Implementasi abstract methods
@Override
public double calculateArea() {
return Math.PI * radius * radius;
}

@Override
public double calculatePerimeter() {
return 2 * Math.PI * radius;
}

// Override concrete method
@Override
public void displayInfo() {
System.out.println("CIRCLE");
super.displayInfo();
System.out.println("Radius: " + radius);
System.out.println("Area: " + calculateArea());
System.out.println("Perimeter: " + calculatePerimeter());
System.out.println("==============");
}

// Method khusus Circle
public double getDiameter() {
return 2 * radius;
}
}


````

4. Buat class Rectangle yang mewarisi Shape:
````declarative
package modul_8.praktikum_1;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    // Implementasi abstract methods
    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    // Override concrete method
    @Override
    public void displayInfo() {
        System.out.println("RECTANGLE");
        super.displayInfo();
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("---------------");
    }

    // Method khusus Rectangle
    public boolean isSquare() {
        return width == height;
    }
}

````


5. Buat class AbstractClassTest untuk testing:

````declarative
package modul_8.praktikum_1;

public class AbstractClassTest {
    public static void main(String[] args) {
        // Tidak bisa membuat instance abstract class langsung
        // Shape shape = new Shape("Red", true); // ERROR!

        // Membuat objects dari concrete subclasses
        Circle circle = new Circle("Red", true, 5.0);
        Rectangle rectangle = new Rectangle("Blue", false, 4.0, 6.0);

        System.out.println("DEMONSTRASI ABSTRACT CLASS");
        // Menggunakan abstract class reference
        Shape shape1 = circle;
        Shape shape2 = rectangle;

        // Polymorphic calls
        shape1.displayInfo();
        System.out.println();

        shape2.displayInfo();
        System.out.println();

        // Mengakses method khusus subclass melalui casting
        System.out.println("Circle Diameter: " + circle.getDiameter());
        System.out.println("Is Rectangle Square? " + rectangle.isSquare());

        // Array of Shapes - demonstrating polymorphism
        System.out.println("\nARRAY OF SHAPES");
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Green", true, 3.0);
        shapes[1] = new Rectangle("Yellow", true, 5.0, 5.0);
        shapes[2] = new Circle("Purple", false, 7.0);

        double totalArea = 0;
        for (Shape shape : shapes) {
            shape.displayInfo();
            totalArea += shape.calculateArea(); // Abstract method call
        }
        System.out.println();

        System.out.println("Total Area of All Shapes: " + totalArea);
    }
}
````

6. Jalankan program dan amati hasilnya.
7. 


## Praktikum 2: Memahami Interface

### Langkah-Langkah
1. Buat sebuah package baru di dalam package modul_8 dengan nama praktikum_2
2. Buat interface Vehicle:

````declarative
package modul_8.praktikum_2;

public interface Vehicle {
// Constant fields (public static final by default)
int MAX_SPEED = 200;

// Abstract methods (public abstract by default)
void start();
void stop();
void accelerate(double speed);
void brake();

// Default method (Java 8+)
default void honk() {
System.out.println("Beep beep!");
}

// Static method (Java 8+)
static void displayMaxSpeed() {
System.out.println("Maximum speed for all vehicles: " + MAX_SPEED + " km/h");
}
}

````


3. Buat interface Electric:

````declarative
package modul_8.praktikum_2;

public interface Electric {
void charge();
int getBatteryLevel();
void setBatteryLevel(int level);

default void displayBatteryInfo() {
System.out.println("Battery Level: " + getBatteryLevel() + "%");
}
}

````

4. Buat class Car yang mengimplementasi Vehicle:

````declarative
package modul_8.praktikum_2;

public class Car implements Vehicle {
private String brand;
private double currentSpeed;
private boolean isRunning;

public Car(String brand) {
this.brand = brand;
this.currentSpeed = 0;
this.isRunning = false;
}

@Override
public void start() {
if (!isRunning) {
isRunning = true;
System.out.println(brand + " car started");
} else {
System.out.println(brand + " car is already running");
}
}

@Override
public void stop() {
if (isRunning) {
isRunning = false;
currentSpeed = 0;
System.out.println(brand + " car stopped");
} else {
System.out.println(brand + " car is already stopped");
}
}

@Override
public void accelerate(double speed) {
if (isRunning) {
currentSpeed += speed;
if (currentSpeed > MAX_SPEED) {
currentSpeed = MAX_SPEED;
}
System.out.println(brand + " car accelerating to " + currentSpeed + " km/h");
} else {
System.out.println("Please start the car first");
}
}

@Override
public void brake() {
if (currentSpeed > 0) {
currentSpeed = 0;
System.out.println(brand + " car braking to " + currentSpeed + " km/h");
} else {
System.out.println(brand + " car is already stopped");
}
}

// Getter methods
public String getBrand() {
return brand;
}

public double getCurrentSpeed() {
return currentSpeed;
}

public boolean isRunning() {
return isRunning;
}
}

````

6. Buat class ElectricCar yang mengimplementasi kedua interface:

````declarative
package modul_8.praktikum_2;

public class ElectricCar implements Vehicle, Electric {
private String brand;
private double currentSpeed;
private boolean isRunning;
private int batteryLevel;

public ElectricCar(String brand) {
this.brand = brand;
this.currentSpeed = 0;
this.isRunning = false;
this.batteryLevel = 100; // Fully charged
}

// Implement Vehicle interface methods
@Override
public void start() {
if (!isRunning && batteryLevel > 0) {
isRunning = true;
System.out.println(brand + " electric car started silently");
} else if (batteryLevel <= 0) {
System.out.println(brand + " Cannot start. Battery is empty. Please charge first.");
} else {
System.out.println(brand + " electric car is already running");
}
}

@Override
public void stop() {
isRunning = false;
System.out.println(brand + " electric car stopped");
}

@Override
public void accelerate(double speed) {
if (isRunning) {
batteryLevel -= (int)(speed / 10); // Battery consumption
currentSpeed += speed;
if (batteryLevel < 0) batteryLevel = 0;
if (currentSpeed > MAX_SPEED) currentSpeed = MAX_SPEED;

if (batteryLevel > 0) {
System.out.println(brand + " electric car accelerating to " + currentSpeed + " km/h");
} else {
System.out.println("Cannot accelerate. Battery is empty.");
currentSpeed = 0; // Stop the car if battery runs out
isRunning = false;
}
} else {
System.out.println("Please start the car first");
}
}

@Override
public void brake() {
if (currentSpeed > 0) {
currentSpeed = 0;
if (batteryLevel < 100) {
batteryLevel += 2; // Regenerative braking
if (batteryLevel > 100) batteryLevel = 100;
System.out.println("(Regenerative braking charged battery by 2%)");
}
System.out.println(brand + " car braking to " + currentSpeed + " km/h");
} else {
System.out.println(brand + " electric car is already stopped");
}
}

// Override default method from Vehicle
@Override
public void honk() {
System.out.println("Electric Beep! 🎶");
}

// Implement Electric interface methods
@Override
public void charge() {
batteryLevel = 100;
System.out.println(brand + " electric car fully charged");
}

@Override
public int getBatteryLevel() {
return batteryLevel;
}

@Override
public void setBatteryLevel(int level) {
if (level >= 0 && level <= 100) {
this.batteryLevel = level;
} else {
System.out.println("Battery level must be between 0 and 100%");
}
}

// Getter methods
public String getBrand() {
return brand;
}

public double getCurrentSpeed() {
return currentSpeed;
}

public boolean isRunning() {
return isRunning;
}
}

````

7. Buat class InterfaceTest untuk testing:
````declarative
package modul_8.praktikum_2;

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println("DEMONSTRASI INTERFACE");

        // Test regular car
        Car car = new Car("Toyota");
        testVehicle(car);

        System.out.println("\n" + "=".repeat(50) + "\n");

        // Test electric car
        ElectricCar electricCar = new ElectricCar("Tesla");
        testVehicle(electricCar);
        testElectric(electricCar);

        System.out.println("\n" + "=".repeat(50) + "\n");

        // Demonstrasi multiple interface implementation
        System.out.println("MULTIPLE INTERFACE DEMO");
        electricCar.honk(); // Overridden default method
        electricCar.displayBatteryInfo(); // Default method from Electric interface

        // Static method call
        Vehicle.displayMaxSpeed();

        // Interface constants
        System.out.println("MAX_SPEED constant: " + Vehicle.MAX_SPEED + " km/h");
    }

    public static void testVehicle(Vehicle vehicle) {
        System.out.println("Testing Vehicle: " + vehicle.getClass().getSimpleName());
        vehicle.start();
        vehicle.accelerate(50);
        vehicle.accelerate(80);
        vehicle.honk(); // Default method
        vehicle.brake();
        vehicle.stop();
    }

    public static void testElectric(Electric electric) {
        System.out.println("Testing Electric Features:");
        electric.displayBatteryInfo();
        electric.charge();
        electric.displayBatteryInfo();
    }
}

````
- Jalankan program dan amati:
- Implementasi multiple interface
- Penggunaan default dan static methods
- Perbedaan antara abstract class dan interface


## Praktikum 3: Abstraksi dengan Access Modifiers

### Langkah-Langkah
1. Buat sebuah package baru di dalam package modul_8 dengan nama praktikum_3
2. Buat class BankAccount yang mengimplementasi abstraksi:
````declarative
package modul_8.praktikum_3;

public class BankAccount {
    // Private fields - hidden from outside world
    private double balance;
    private String accountNumber;
    private String accountHolder;
    private String password;

    // Public Constructor
    public BankAccount(String accountNumber, String accountHolder, double initialBalance, String password) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.password = password;
    }

    // Public methods - interface to the outside world
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
            logTransaction("DEPOSIT", amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public boolean withdraw(double amount, String inputPassword) {
        if (authenticate(inputPassword)) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Successfully withdrawn: $" + amount);
                logTransaction("WITHDRAW", amount);
                return true;
            } else {
                System.out.println("Invalid withdrawal amount or insufficient funds");
                return false;
            }
        } else {
            System.out.println("Authentication failed!");
            return false;
        }
    }

    public boolean transfer(BankAccount recipient, double amount, String inputPassword) {
        if (authenticate(inputPassword)) {
            if (withdraw(amount, inputPassword)) {
                recipient.deposit(amount);
                System.out.println("Transfer successful to " + recipient.getAccountHolder());
                logTransaction("TRANSFER to " + recipient.getAccountHolder(), amount);
                return true;
            }
            return false;
        }
        System.out.println("Authentication failed!");
        return false;
    }

    // Private method - hidden implementation detail
    private boolean authenticate(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    // Private method - hidden implementation detail
    private void logTransaction(String type, double amount) {
        System.out.println("[LOG] " + type + ": Amount: $" + amount + " - New Balance: $" + balance);
    }

    // Protected method - accessible within package and subclasses
    protected void applyInterest(double rate) {
        double interest = balance * (rate / 100);
        balance += interest;
        System.out.println("Interest applied: $" + interest);
    }

    // Public method to display account info (without sensitive data)
    public void displayAccountInfo() {
        System.out.println("--- ACCOUNT INFO ---");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("--------------------");
    }
}

````

3. Buat class SavingsAccount yang mewarisi BankAccount:
````declarative
package modul_8.praktikum_3;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder,
                          double initialBalance, String password, double interestRate) {
        super(accountNumber, accountHolder, initialBalance, password);
        this.interestRate = interestRate;
    }

    // Public method to apply interest
    public void applyMonthlyInterest() {
        // Calling protected method from parent
        applyInterest(interestRate / 12);
        System.out.println("Monthly interest applied at rate: " + interestRate + "% annually");
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Account Type: Savings");
        System.out.println("Annual Interest Rate: " + interestRate + "%");
        System.out.println("--------------------");
    }
}
````
4. Buat class AbstractionTest untuk testing:
````declarative
package modul_8.praktikum_3;

public class AbstractionTest {
    public static void main(String[] args) {
        System.out.println("DEMONSTRASI ABSTRAKSI DENGAN ACCESS MODIFIERS");

        // Create accounts
        BankAccount account1 = new BankAccount("ACC001", "Alice Johnson", 1000.0, "pass123");
        SavingsAccount account2 = new SavingsAccount("SAV001", "Bob Smith", 5000.0, "save456", 3.5);

        // Test public interface
        System.out.println("\n--- Testing Basic Bank Account ---");
        account1.displayAccountInfo();
        account1.deposit(500.0);
        account1.withdraw(200.0, "pass123");
        account1.displayAccountInfo();

        System.out.println("\n--- Testing Savings Account ---");
        account2.displayAccountInfo();
        account2.applyMonthlyInterest();
        account2.displayAccountInfo();

        System.out.println("\n--- Testing Transfer ---");
        account2.transfer(account1, 1000.0, "save456");
        account1.displayAccountInfo();
        account2.displayAccountInfo();

        System.out.println("\n--- Testing Abstraction Benefits ---");

        // Cannot access private members directly
        // System.out.println(account1.balance); // ERROR - private field
        // System.out.println(account1.password); // ERROR - private field

        // Cannot call private methods
        // account1.authenticate("pass123"); // ERROR - private method
        // account1.logTransaction("TEST", 100); // ERROR - private method

        // Protected method is accessible through public interface in subclass
        // account1.applyInterest(5.0); // ERROR - protected method not accessible outside hierarchy

        System.out.println("\nDEMONSTRASI KEAMANAN ABSTRAKSI");

        // Attempt unauthorized withdrawal...
        System.out.println("\n--- Attempt unauthorized withdrawal... ---");
        boolean success = account1.withdraw(1000.0, "wrongpassword");
        System.out.println("Withdrawal successful: " + success);

        // Attempt invalid deposit...
        System.out.println("\n--- Attempting invalid deposit... ---");
        account1.deposit(-100.0); // Invalid amount

        System.out.println("\nFinal Account Status:");
        account1.displayAccountInfo();
        account2.displayAccountInfo();
    }
}

````

5. Jalankan program dan amati:
- Bagaimana private fields dan methods disembunyikan
- Bagaimana public methods menyediakan interface yang aman
- Manfaat abstraksi dalam keamanan dan encapsulation
- Penggunaan protected methods dalam inheritance


### selesai.