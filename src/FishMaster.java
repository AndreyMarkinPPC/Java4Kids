public class FishMaster {

    public static void main(String[] args) {

        String fishReaction; //define new variable fishReaction

        //instantite new Fish object called myFish
        Fish myFish = new Fish(10);

        myFish.dive(2);
        myFish.dive(3);

        fishReaction = myFish.talk("Hello!"); //save the return value of method .talk() to fishReaction
        System.out.println(fishReaction);

        myFish.sleep();
    }
}
