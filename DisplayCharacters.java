public class DisplayCharacters {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a string as a command line argument.");
            return;
        }

        String input = args[0];

        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toUpperCase(input.charAt(i));
            System.out.print(ch + " ");
            try {
                Thread.sleep(1000); // Sleep for 1000 milliseconds (1 second)
            } catch (Exception e) {
                System.out.println("Thread interrupted.");
            }
        }
        System.out.println();
    }
}
