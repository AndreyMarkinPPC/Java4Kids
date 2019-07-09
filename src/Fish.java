public class Fish extends Pet implements Swimmable {

    //declare class variable that will store and update the current depth every time
    //we call dive method
    int currentDepth = 0;

    public void swim(int howFar) {
        System.out.println("OK, I will swim " + howFar + " meters");
    }
    //This is constructor
    Fish(int currentDepth) {
        this.currentDepth = currentDepth;
    }

    //define dive method with an int parameter howDeep
    public int dive2(int howDeep) {
        currentDepth+=howDeep;
        System.out.println("Diving for " + howDeep + " meters");
        System.out.println("I'm not at " + currentDepth + " meters below sea level");

        return currentDepth;
    }

    public void dive(int howDeep) {
        System.out.println("OK, will dive " + howDeep + " meters");
    }

    //override talk method from Pet class
    public String talk(String something) {
        return "Don't you know that fish don't talk?";
    }
}
