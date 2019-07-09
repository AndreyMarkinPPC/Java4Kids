public class Arrays {
    public static void main(String[] args) {
        String[] players = new String[4];

        players[0] = "David";
        players[1] = "Daniel";
        players[2] = "Anna";
        players[3] = "Gregory";

        int totalPlayers = players.length;

        int counter;

        for (counter = 0; counter < totalPlayers; counter++) {
            String thePlayer = players[counter];
            System.out.println("Congratulations, " + thePlayer + "!");

        }

        System.out.println("\nNew loop\n");

        for(String pl: players) {
            System.out.println("Congratulations, " + pl + "!");
        }

        System.out.println("\nLooping with while\n");

        counter = 0;
        while(counter < totalPlayers) {
            String theP = players[counter];
            System.out.println("Congratulations," + theP + "!");
            counter++;
        }

        counter = 0;

        System.out.println("\nLooping with while And Break statement\n");

        while(counter < totalPlayers) {
            if(counter == 3) {
                break; // Jump out of the loop
            }
            String theP = players[counter];
            System.out.println("Congratulations," + theP + "!");
            counter++;

        }

        counter = 0;

        System.out.println("\nDo while loop\n");

        do {
            System.out.println("Congratulations, " + players[counter] + "!");
            counter++;
        } while (counter < totalPlayers);


        System.out.println("\nLoop and we don't like David\n");

        counter = 0;

        while(counter < totalPlayers) {
            String thePl = players[counter];

            counter++;

            if(thePl.equals("David")) {
                continue;
            }
            System.out.println("Congratulations, " + thePl + "!");

        }


     }
}
