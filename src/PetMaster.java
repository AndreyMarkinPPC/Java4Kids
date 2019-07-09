public class PetMaster {

    public static void main(String[] args) {
        String petReaction; //will store the value returned by the method say
        Pet myPet = new Pet(); //create an instance of the class Pet with new keyword; call it myPet
        myPet.eat(); //print eating message
        petReaction = myPet.talk("Tweet!! Tweet"); //create a variable to store return value of the method .talk()
        System.out.println(petReaction); //print petReaction
        myPet.sleep(); //put it to sleep
    }
}
