package chapter6;

import java.util.Hashtable;

public class HashTableDemo {

    public static void main(String[] args) {

        ContactDetail friend1 = new ContactDetail();
        friend1.fullName = "Jackie Allen";
        friend1.facebookID = "123";
        friend1.email = "jackie@gmail.com";
        friend1.phone = "555";

        ContactDetail friend2 = new ContactDetail();
        friend2.fullName = "Jackie Smith";
        friend2.facebookID = "124";
        friend2.email = "jackies@gmail.com";
        friend2.phone = "556";

        Hashtable friends = new Hashtable();
        friends.put("Jackie1", friend1);
        friends.put("Jackie2", friend2);

        //Cast from Object to ContactDetail
        String jackie2Phone = ((ContactDetail) friends.get("Jackie2")).phone;

        System.out.println("Jackie2's phone number is " + jackie2Phone);
    }

}

