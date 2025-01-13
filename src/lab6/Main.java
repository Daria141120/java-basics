package lab6;

public class Main {
    public static void main(String[] args) {
        // test task 1
        Person client = new Client("John", "Doe", "Betabank");
        Person bankWorker = new BankEmployee("Neil", "Oliver", "VBB");

        client.printInfo();
        bankWorker.printInfo();
        System.out.println("----------------");

        // test task 3

        Car car = new Car(3000, "BMW", 'r', 300);
        car.outPut();

        Truck trunk = new Truck(10000, "Kamaz", 'b', 90, 10, 18000);
        System.out.println(trunk);

        trunk.newWheels(8);
        System.out.println(trunk);

        System.out.println("----------------");

        // test task 4
        Child obChild = new Child(6);
        System.out.println(obChild.outNumbParent());

        // test task 5
        MajorClass user = new HeirClass();
        user.setInfo();


    }
}
