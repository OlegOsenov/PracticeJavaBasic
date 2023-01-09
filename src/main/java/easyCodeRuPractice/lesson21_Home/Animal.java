package easyCodeRuPractice.lesson21_Home;

public abstract class Animal {
    protected final String name;
    private static int count = 0;

    protected Animal(String name) {
        this.name = name;
        System.out.println("Новое животное создано, по кличке " + this.name);
        count++;
    }

    public abstract String movement();

    protected String getName(){
        return getClass().getName();
    }

    @Override
    public String toString() {
        return getName() + " ,по кличка " + this.name;
    }

    public int getCount() {
        return count;
    }
}
