public class Dog extends Animal {
    private String earShape;
    private String tailShape;



    public Dog() {
        super("Mutt", "Big", 50);
    }

    public Dog(String type, double weight) {
        this(type, weight, "floppy", "curly");
    }

    public Dog(String type,  double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);

        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public void move(String speed) {
        super.move(speed);

        if(speed.equals(("slow"))) {
            walk();
        } else {
            run();
            bark();
        }

        System.out.println(" ");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }


    public void bark() {
        System.out.println("Woof! ");
    }

    public void walk() {
        System.out.println("Dog Walking");
    }

    public void run() {
        System.out.println("Dog Running");
    }


}
