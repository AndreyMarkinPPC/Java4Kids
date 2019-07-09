public class TemperatureConverter {

    public static String convertTemp (float temperature,
                                     char convertTo) {
        if(convertTo == 'F') {
            return "The temperature in Fahrenheit is " + (9*temperature/5 + 32);
        } else if (convertTo == 'C') {
            return ("The temperature in Celsius is " + (temperature - 32) * 5/9);
        } else {
            return ("You can enter either F or C as convertTo");
        }
    }

    public static void main(String[] args) {
        System.out.println(convertTemp(31,'F'));
    }

}
