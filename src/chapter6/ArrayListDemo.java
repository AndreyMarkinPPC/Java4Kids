package chapter6;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        //create and populate an ArrayList
        ArrayList friends = new ArrayList();
        friends.add("Mary");
        friends.add("Joseph");
        friends.add("Jesus");

        //how many friend are there?
        int friendsCount = friends.size();

        //print the content of the ArrayList
        for (int i = 0; i < friendsCount; i++) {
            System.out.println("Friend #" + (i + 1) + " is " + friends.get(i));
        }
    }
}
