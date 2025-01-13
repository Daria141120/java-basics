package lab7;

public class Main {

    public static void main(String[] args) {
        Airplane superjet = new Airplane();
        Airplane airbus = new Airplane();

        superjet.setWingsWeight(5000.0);
        airbus.setWingsWeight(8000.0);

        System.out.println(superjet.getWingsWeight());
        System.out.println(airbus.getWingsWeight());


    }

}
