package lab6;

public class Truck extends Car {
    public int wheelsCount;
    public int maxWeight;

    public Truck(int w, String m, char c, float s, int wheelsCount, int maxWeight) {
        super(w, m, c, s);
        this.wheelsCount = wheelsCount;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int count) {
        this.wheelsCount = count;
        System.out.println("New count of wheels = " + this.wheelsCount);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "speed=" + speed +
                ", color=" + color +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                ", maxWeight=" + maxWeight +
                ", wheelsCount=" + wheelsCount +
                '}';
    }
}
