package lab6;

public class Client extends Person {
    private String bankName;

    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    protected void printInfo() {
        System.out.print("Client: " + super.getName() + " " + super.getSurname());
        System.out.println(" / Bank: " + bankName);
    }

}
