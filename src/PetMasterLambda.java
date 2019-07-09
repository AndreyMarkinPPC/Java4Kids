public class PetMasterLambda {

    public static void main(String[] args) {

        //dogs
        Pet myDog = new Pet();

        Talkative dogTalkRules = (name) -> {
          return "I'm a dog. My name is " + name;
        };

        System.out.println(myDog.speakup(dogTalkRules, "Sammy"));

        //parrots
        Pet myParrot = new Pet();

        Talkative parrotTalkRule = (name) -> {
            return "I'm a parrot. Don't call me " + name;
        };

        System.out.println(myParrot.speakup(parrotTalkRule, "Charlie"));
    }
}
