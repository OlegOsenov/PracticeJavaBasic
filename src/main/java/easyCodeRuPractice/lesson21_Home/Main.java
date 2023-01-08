package easyCodeRuPractice.lesson21_Home;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Зевс");
        animals[1] = new Duck("Скрудж");
        animals[2] = new Fish("Дори");

        for (Animal anim: animals) {
            print(anim.toString());
        }

    }
    private static void print(String txt){
        System.out.println(txt);
    }
}
