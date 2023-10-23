public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.setMake("porsche");
        car.setModel("M3");
        car.setColor("red");
        car.setDoors(2);
        car.setConvertible(true);

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();


        Account account = new Account("12345", 0.00, "Bob Brown", "test@gmail.com", "(087) 123-4567");
        System.out.println(account.getCustomerPhone());


        Account timeAccount = new Account("Tim", "tim@gmail.com", "12345");

        System.out.println(timeAccount.getNumber() + " name " + timeAccount.getCustomerName());


//        for (int i = 1; i <= 5; i++) {
//            Student s = new Student("S92300" + i,
//                    switch (i) {
//                        case 1 -> "Mary";
//                        case 2 -> "Carol";
//                        case 3 -> "Tim";
//                        case 4 -> "Harry";
//                        case 5 -> "Lisa";
//                        default -> "Anonymous";
//                    },
//                    "05/11/1985",
//                    "Java Masterclass");
//            System.out.println(s);
//        }
//

        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }


        Student pojoStudent = new Student("S923001", "Mary", "05/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923001", "Mary", "05/11/1985", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName() + "is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + "is taking " + recordStudent.classList());
    }
}
