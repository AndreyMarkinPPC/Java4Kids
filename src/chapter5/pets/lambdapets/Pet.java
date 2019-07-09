package chapter5.pets.lambdapets;

public class Pet {

    String name;
    Talkative rulesOfTalking;

    //constructor
    Pet(Talkative rulesOfTalking, String name) {
        this.rulesOfTalking = rulesOfTalking;
        this.name = name;
    }

    public String speakup() {
        return rulesOfTalking.talk(name);
    }

}
