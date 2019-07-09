package chapter6;

import java.util.ArrayList;

public class FishTank {

    public static void main(String[] args) {
        ArrayList fishTank = new ArrayList();

        Fish fish1 = new Fish(2.5f, "red");
        Fish fish2 = new Fish(4, "blue");

        Fish theFish;

        fishTank.add(fish1);
        fishTank.add(fish2);

        int fishCount = fishTank.size();

        for (int i = 0; i < fishCount; i++) {
            theFish = (Fish) fishTank.get(i); //casting
            System.out.println("Got the " + theFish.getColor() + " fish that weights " +
                                theFish.getWeight() + " grams.");

        }

    }
}
