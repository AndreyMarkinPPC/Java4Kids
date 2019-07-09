package chapter6.contacts;

import java.util.ArrayList;

public class MyContacts {

    public static void main(String[] args) {

        ArrayList<ContactDetail>friends = new ArrayList<>();

        ContactDetail friend1 = new ContactDetail();
        friend1.setFullName("John Doe");
        friend1.setFacebookID("123");
        friend1.setEmail("john.doe@gmail.com");
        friend1.setPhone("12345");

        ContactDetail friend2 = new ContactDetail();
        friend2.setFullName("John Dephon");
        friend2.setFacebookID("124");
        friend2.setEmail("john.dephon@gmail.com");
        friend2.setPhone("54321");


        friends.add(friend1);
        friends.add(friend2);

        for(ContactDetail friend: friends) {
            System.out.println(friend.toString());
        }


    }

}
