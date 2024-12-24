package lab3;

public class Tree {
    String name;
    int age;
    boolean isAlive;

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public Tree(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Tree(String name, int age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isAlive=" + isAlive +
                '}';
    }
}
