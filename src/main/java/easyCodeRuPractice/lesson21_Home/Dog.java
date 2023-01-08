package easyCodeRuPractice.lesson21_Home;

public class Dog extends Animal{
    protected Dog(String name) {
        super(name);
    }

    @Override
    public String movement() {
        return "Умеет бегать";
    }

    @Override
    protected String getName() {
        return "Собака";
    }

    @Override
    public String toString() {
        return "Собака " + getName();
    }
}
