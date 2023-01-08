package easyCodeRuPractice.lesson21_Home;

public abstract class Animal {
    private final String name;

    protected Animal(String name) {
        this.name = name;
    }

    public abstract String movement();

    protected String getName(){
        return getClass().getName();
    }
}
