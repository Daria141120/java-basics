package lab6;

public class Child extends Parent {

    public Child(int number) {
        super(number);
    }

    public int outNumbParent() {
        return super.number;
    }

}
