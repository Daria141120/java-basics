package lab3;

import java.time.LocalDate;

public class House {
    String name;
    int year;
    int quantityFloors;

    public House() {
    }

    public House(String name, int year, int quantityFloors) {
        this.name = name;
        this.year = year;
        this.quantityFloors = quantityFloors;
    }

    public void setAllSpec(String name, int year, int quantityFloors){
        this.name = name;
        this.year = year;
        this.quantityFloors = quantityFloors;
    }

    public void printAllSpec(){
        System.out.print("name = "+this.name);
        System.out.print("  year = "+this.year);
        System.out.println("  quantity of floors = "+this.quantityFloors);
    }

    public int ageHouse(){
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear() - this.year;
    }

    public String getName() {
        return name;
    }
}
