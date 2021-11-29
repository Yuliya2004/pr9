package rtu.mirea.gibo01.pr9;

public class Vehicle implements Movable {
    private int speed;
    private String marka;
    private int time;

    public Vehicle(int speed, String marka, int time) {
        this.speed = speed;
        this.marka = marka;
        this.time = time;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMarka() {
        return marka;
    }

    public int getTime() {
        return time;
    }

    public double move() {
        return time * speed;
    }

    public void moveUp() {
        System.out.println("Moves up");
    }

    public void moveDown() {
        System.out.println("Moves down");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", marka='" + marka + '\'' +
                '}';
    }
}