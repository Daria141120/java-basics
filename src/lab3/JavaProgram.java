package lab3;

public class JavaProgram {
    public static void main(String [] args) {
        Study objStudy = new Study("Изучение Java - это просто");
        System.out.println(objStudy.printCourse());

        System.out.println("=================");

        Car car1 = new Car();
        Car car2 = new Car(Color.BLUE);

        car1.setBrand("volkswagen");
        car1.setColor(Color.ORANGE);
        car1.setWeight(1400);
        car2.setBrand("peugeot");
        car2.setWeight(1500);

        car1.getAllParameters();
        car2.getAllParameters();

        System.out.println("=================");

        House house1 = new House();
        House house2 = new House();

        house1.setAllSpec("Чистое небо", 2017,16);
        house2.setAllSpec("Солнечный город",2019,12);

        house1.printAllSpec();
        System.out.println("Возраст дома "+house1.getName()+" - "+ house1.ageHouse());
        house2.printAllSpec();
        System.out.println("Возраст дома "+house2.getName()+" - "+ house2.ageHouse());

        System.out.println("=================");

        Tree emptyTree = new Tree();
        Tree objTree1 = new Tree("Baobab",1500,true);
        Tree objTree2 = new Tree("Sandalwood",30);

        System.out.println(objTree1);
        System.out.println(objTree2);
        System.out.println(emptyTree);
    }
}
