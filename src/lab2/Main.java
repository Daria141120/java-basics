package lab2;

public class Main {
    public static void main(String [] args) {
        Book emptyBook = new Book();
        Book whiteFang = new Book("White Fang", "Jack London", Genre.NOVEL, 298, 1906);

        System.out.println(emptyBook);
        System.out.println(whiteFang);
        System.out.println("\n");

        Calculator calc = new Calculator();

        int intNumb1 = 79;
        int intNumb2 = 54;

        double doubleNumb1 = 15.26;
        double doubleNumb2 = 8.54;

        long longNumb1 = 2_147_483_650L;
        long longNumb2 = 5L;

        System.out.println(intNumb1+" + "+intNumb2+" = "+calc.sum(intNumb1,intNumb2));
        System.out.println(intNumb1+" - "+intNumb2+" = "+calc.subtraction(intNumb1,intNumb2));
        System.out.println(intNumb1+" * "+intNumb2+" = "+calc.multiply(intNumb1,intNumb2));
        System.out.println(intNumb1+" / "+intNumb2+" = "+calc.division(intNumb1,intNumb2));
        System.out.println();


        System.out.println(doubleNumb1+" + "+doubleNumb2+" = "+calc.sum(doubleNumb1,doubleNumb2));
        System.out.println(doubleNumb1+" - "+doubleNumb2+" = "+calc.subtraction(doubleNumb1,doubleNumb2));
        System.out.println(doubleNumb1+" * "+doubleNumb2+" = "+calc.multiply(doubleNumb1,doubleNumb2));
        System.out.println(doubleNumb1+" / "+doubleNumb2+" = "+calc.division(doubleNumb1,doubleNumb2));
        System.out.println();

        System.out.println(longNumb1+" + "+longNumb2+" = "+calc.sum(longNumb1,longNumb2));
        System.out.println(longNumb1+" - "+longNumb2+" = "+calc.subtraction(longNumb1,longNumb2));
        System.out.println(longNumb1+" * "+longNumb2+" = "+calc.multiply(longNumb1,longNumb2));
        System.out.println(longNumb1+" / "+longNumb2+" = "+calc.division(longNumb1,longNumb2));


    }
}
