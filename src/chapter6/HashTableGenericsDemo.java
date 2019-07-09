package chapter6;

import java.util.Hashtable;

public class HashTableGenericsDemo {

    public static void main(String[] args) {
        ContactDetail friend1 = new ContactDetail();
        friend1.fullName = "Jackie Allen";
        friend1.facebookID = "123";
        friend1.email = "jackie@gmail.com";
        friend1.phone = "555";

        Hashtable<String, ContactDetail> friends = new Hashtable<>();
        friends.put("Jackie", friend1);

        //compiler will complain abot this line
       // friends.put("Alan", "Alan Dough, alan@gmail.com, 123, 231");

        //no casting from object to ContactDetail needed
        String jackiesPhone = friends.get("Jackie").phone;

        System.out.println("This is Jackie's phone: " + jackiesPhone);
    }

}