package chapter5.pets.lambdapets;

public class PetMasterLambda {

    public static void main(String[] args) {

        Talkative dogTalkingRules = (name) -> {
            return "I'm a dog, my name is " + name;
        };

        Talkative parrotTalkingRules = (name) -> {
            return "I'm a parrot, my name is " + name;
        };

        Pet myParrot = new Pet(parrotTalkingRules, "Kesha");
        Pet myDog = new Pet(dogTalkingRules, "Samuil");

        System.out.println(myDog.speakup());
        System.out.println(myParrot.speakup());

    }

}
