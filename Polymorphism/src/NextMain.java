import first.abc.com.Item;

public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watch();

        Adventure adventure = (Adventure) Movie.getMovie("A", "Jaws");
        adventure.watch();

        Object comedy = Movie.getMovie("C", "Jaws");
        ((Comedy)comedy).watchComedy();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watch();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unknownObject  = Movie.getMovie("A", "Jaws");

        if (unknownObject instanceof Adventure) {
            ((Adventure)unknownObject).watch();
        } else if (unknownObject instanceof Comedy syf) {
            syf.watchComedy();
        } else {
            System.out.println("Unknown object");
        }


        Item  item = new Item("Burger");
        System.out.println(item);
    }
}
