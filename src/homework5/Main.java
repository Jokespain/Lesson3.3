package homework5;
import java.util.Objects;
class House {
    private final int rooms;
    private final int bathrooms;
    private final boolean hasGarage;
    private final boolean hasGarden;
    public House(int rooms, int bathrooms, boolean hasGarage, boolean hasGarden) {
        this.rooms = rooms;
        this.bathrooms = bathrooms;
        this.hasGarage = hasGarage;
        this.hasGarden = hasGarden;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return rooms == house.rooms && bathrooms == house.bathrooms
                && hasGarage == house.hasGarage && hasGarden == house.hasGarden;
    }
    @Override
    public int hashCode() {
        return Objects.hash(rooms, bathrooms, hasGarage, hasGarden);
    }
}

class HouseBuilder {
    private int rooms;
    private int bathrooms;
    private boolean hasGarage;
    private boolean hasGarden;
    public HouseBuilder setRooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    public HouseBuilder setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
        return this;
    }

    public HouseBuilder setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }

    public HouseBuilder setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }
    public House build() {
        return new House(rooms, bathrooms, hasGarage, hasGarden);
    }
}
public class Main {
    public static void main(String[] args) {
        HouseBuilder builder = new HouseBuilder();

        House house1 = builder.setRooms(3)
                .setBathrooms(2)
                .setHasGarage(true)
                .setHasGarden(true)
                .build();
        House house2 = builder.setRooms(3)
                .setBathrooms(2)
                .setHasGarage(true)
                .setHasGarden(false)
                .build();

        System.out.println("HashCode for House1: " + house1.hashCode());
        System.out.println("HashCode for House2: " + house2.hashCode());
        System.out.println("Are house1 and house2 have some hashcode? : " + house1.equals(house2));
    }
}

