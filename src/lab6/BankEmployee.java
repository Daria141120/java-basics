package lab6;

public class BankEmployee extends Person {
    private String bankName;

    public BankEmployee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    protected void printInfo() {
        System.out.print("BankEmployee: " + super.getName() + " " + super.getSurname());
        System.out.println(" / Bank: " + bankName);
    }

}
