package chapter5.pets.pets;

public interface Swimmable {

    static final int MAX_DEPTH = 10;

    public void swim(int howFar);

    public default void dive(int howDeep){
        if (howDeep > MAX_DEPTH) {
            System.out.println("Can't dive");
        } else {
            System.out.println("Will dive " + howDeep + " meters.");
        }
    };
}

