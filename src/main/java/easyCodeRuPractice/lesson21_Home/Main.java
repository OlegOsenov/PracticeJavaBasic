package easyCodeRuPractice.lesson21_Home;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog("Зевс");
        animals[1] = new Duck("Скрудж");
        animals[2] = new Fish("Дори");
        animals[3] = new Dog("Серый", 23);


        for (Animal anim: animals) {
            print(anim.toString());
            print(anim.movement());
        }

    }
    private static void print(String txt){
        System.out.println(txt);
    }
}
