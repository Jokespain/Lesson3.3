public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.Description("Wof!","Tuzik",3);
        animal2.Description("Meaw!","Tolik",2);

        System.out.println(animal1);
        System.out.println(animal2);

        try {
            Cat cat = (Cat) animal1;
            cat.Description("Wof!","Tuzik",3);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }
    }

}