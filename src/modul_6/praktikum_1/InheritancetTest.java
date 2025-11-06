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
