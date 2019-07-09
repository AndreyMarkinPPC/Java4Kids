public class Pet {

    //attributes
    int age;
    float weight;
    float height;
    String color;

    //methods
    public void sleep() {
        System.out.println("Good night, see you tomorrow");
    }

    public void eat() {
        System.out.println("I'm so hungry, please feed me!");
    }

    public String speakup(Talkative talkRules, String name) {
        return talkRules.talk(name);
    }
    public String talk(String aWord) {
        String petResponse = "OK! OK! " + aWord;
        return petResponse;
    }
}
