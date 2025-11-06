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
