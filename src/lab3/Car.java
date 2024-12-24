package lab3;

public class Car {
    private String brand;
    private Color color;
    private double weight;

    public Car() {
    }

    public Car(Color color) {
        this.color = color;
    }

    public Car(Color color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car(String brand, Color color, double weight) {
        this.brand = brand;
        this.color = color;
        this.weight = weight;
    }

    public void getAllParameters(){
        System.out.print("brand = "+this.brand);
        System.out.print("  color = "+this.color.getDescription());
        System.out.println("  weight = "+this.weight);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
