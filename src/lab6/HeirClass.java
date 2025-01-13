package lab6;

public class HeirClass extends MajorClass {
    private String name;

    public HeirClass() {
    }

    public void setInfo() {

        System.out.println("введите имя пользователя");
        if (scanner.hasNextLine()) {
            name = scanner.nextLine();
            System.out.println("has");
        } else {
            System.out.println("неверный формат");
        }

    }

}
