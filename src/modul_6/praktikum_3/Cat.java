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
