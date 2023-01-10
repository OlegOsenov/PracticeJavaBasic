package easyCodeRuPractice.lesson21_Home;

public class Dog extends Animal{
    protected static int age;
    protected Dog(String name) {
        super(name);
    }
    protected Dog(String name, int age) {
        super(name);

    }

    @Override
    public String movement() {
        return this.name + " умеет бегать";
    }

    @Override
    protected String getName() {
        return "Собака";
    }

    @Override
    public String toString() {
        return getName() + ", по прозвищу " + this.name;
    }
}
