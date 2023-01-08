package easyCodeRuPractice.lesson21_Home;

public class Duck extends Animal{
    protected Duck(String name) {
        super(name);
    }

    @Override
    public String movement() {
        return "Умеет летать";
    }

    @Override
    protected String getName() {
        return "Утка";
    }
}
