package rtu.mirea.gibo01.pr9;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(260, "Ferrari", 20);
        vehicle.move();

        Boat boat = new Boat(100,"Cruiser", 15, 30);
        System.out.println("Пройденное расстояние " + boat.getName() + " за время, равное " + boat.move());
        boat.sell();
    }
}