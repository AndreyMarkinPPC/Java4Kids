import java.time.LocalDate;
import java.time.Month;

public interface Swimmable {

    static final int MAX_DEPTH = 10;

    public void swim(int howFar);

    public default void dive(int howDeep){
        if(isSummer() && howDeep < MAX_DEPTH) {
            System.out.println("Will dive. The water is warm");
        } else {
            System.out.println("Can't dive. And the water is cold");
        }
    };

    static boolean isSummer() {
        Month month = LocalDate.now().getMonth();

        if(month == Month.JUNE || month == Month.JULY || month == Month.AUGUST) {
            return true;
        } else {
            return false;
        }
    }
}
