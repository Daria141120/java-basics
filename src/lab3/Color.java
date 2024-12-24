package lab3;

public enum Color {
    BLUE("Blue"),
    GREEN("Green"),
    WHITE("White"),
    BLACK("black"),
    YELLOW("yellow"),
    ORANGE("orange");

    private final String description;

    Color(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }


}


