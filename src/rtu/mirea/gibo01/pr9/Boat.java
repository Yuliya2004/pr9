package rtu.mirea.gibo01.pr9;

public class Boat implements Movable, Priceable {
    private double vod;
    private String name;
    private int speed;
    private int time;

    public Boat(double vod, String name, int speed, int time) {
        this.vod = vod;
        this.name = name;
        this.speed = speed;
        this.time = time;
    }

    public double getVod() {
        return vod;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getTime() {
        return time;
    }

    public double move() {
        return time * speed;
    }

    public void moveUp() {
        System.out.println("Boat moves up");
    }

    public void moveDown() {
        System.out.println("Boat moves down");
    }

    public void sell() {
        System.out.println("Price is 15.000.000 rubles");
    }


    @Override
    public String toString() {
        return "Boat{" +
                "vod=" + vod +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
