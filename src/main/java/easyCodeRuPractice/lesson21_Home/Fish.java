package easyCodeRuPractice.lesson21_Home;

public class Fish extends Animal{
    protected Fish(String name) {
        super(name);
    }

    @Override
    public String movement() {
        return "Умеет плавать";
    }

    @Override
    protected String getName() {
        return "Рыба";
    }
}
