package chapter5.pets.pets;

public class Fish extends Pet implements Talkable, Swimmable{

    //declare class variable that will store and update the current depth every time
    int currentDepth = 0;
    String fishName;

    //This is constructor
    Fish(String fishName) {
        this.fishName = fishName;
    }

    public void talk() {
        System.out.println("My name is " + fishName + ". Fish don't talk");
    }


    public void swim(int howFar) {
        System.out.println("Will swim " + howFar);
    }

}

