package lab7;

public class Airplane {
    Wings wings;

    public Airplane() {
        wings = new Wings();
    }

    public void setWingsWeight(double weight) {
        wings.setWeight(weight);
    }

    public double getWingsWeight() {
        return wings.getWeight();
    }


    private class Wings {
        double weight;

        public Wings() {
            this.weight = 0.0;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }
    }


}
