public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watch() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film.");
    }

    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScinceFiction(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watch() {
        super.watch();
        System.out.printf(".. %s %n".repeat(3),
                "Pleasant Scene",
                "Scary Scene",
                "Something Bad Happens");
    }

    public void watchAdventure() {
        System.out.println("Watching an Adventure!");
    }
}


class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watch() {
        super.watch();
        System.out.printf(".. %s %n".repeat(3),
                "Silly Scene",
                "Funny Scene",
                "Happy Ending");
    }

    public void watchComedy() {
        System.out.println("Watching a Comedy!");
    }
}

class ScinceFiction extends Movie {
    public ScinceFiction(String title) {
        super(title);
    }

    @Override
    public void watch() {
        super.watch();
        System.out.printf(".. %s %n".repeat(3),
                "Bad Science",
                "Fun Science",
                "Happy Ending");
    }

    public void watchScinceFiction() {
        System.out.println("Watching a ScinceFiction!");
    }
}



