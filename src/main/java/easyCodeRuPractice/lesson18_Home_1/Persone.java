package easyCodeRuPractice.lesson18_Home_1;

public class Persone {
    private final String name;
    private final String surname;
    private final int age;

    @Override
    public String toString() {
        return "Имя персонажа " + name +
                ", фамилия " + surname +
                ", возраст " + age;
    }

    public Persone(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
