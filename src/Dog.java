public class Dog extends Animal implements Talkative, Swimmable{
    public void talk() {
        System.out.println("Bark! Bark!");
    }


    @Override
    public void swim(int howFar) {
        System.out.println("Will swim about half of this distance: " + howFar / 2 + " meters");
    }

    @Override
    public String talk(String petName) {
        return null;
    }

    /*
    @Override
    public void dive(int howDeep) {
        System.out.println("Dogs don't dive!");
    }
    */
}
