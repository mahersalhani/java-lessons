public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", "small", 5.6);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 10);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Golden Retriever", 70, "pointy", "straight");
        doAnimalStuff(retriever, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.move(speed);
        animal.makeNoise();

        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
