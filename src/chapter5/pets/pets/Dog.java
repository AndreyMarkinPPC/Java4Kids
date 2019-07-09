package chapter5.pets.pets;

public class Dog extends Pet implements Talkable, Swimmable {

    String dogName;

    //constructor
    Dog(String dogName) {
        this.dogName = dogName;
    }

    public void talk() {
        System.out.println("My name is " + dogName + ". Bark! Bark!");
    }


    public void swim(int howFar) {
        System.out.println("Will swim " + howFar);
    }

}

