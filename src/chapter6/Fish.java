package chapter6;

public class Fish {

    private float weight;
    private String color;


    //getters and setters
    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    //constructor
    Fish(float weight, String color) {
        this.setWeight(weight);
        this.setColor(color);
    }




}
