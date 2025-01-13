package lab6;

import java.util.Scanner;

public class MajorClass {
    private int age;
    protected Scanner scanner = new Scanner(System.in);

    public MajorClass() {
    }

    public void setInfo() {

        System.out.println("введите возраст пользователя");
        if (scanner.hasNextInt()) {
            age = scanner.nextInt();
        } else {
            System.out.println("неверный формат");
        }

    }
}
