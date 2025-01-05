
public class DisplayStringWithDelay {
    public static void main(String[] args) throws InterruptedException{
        if(args.length == 0){
            System.out.println("Please provide a string as a command-line argument.");
            return;
        }
        String input = String.join(" ",args);
        String upperCaseString = input.toUpperCase();
        for(char c : upperCaseString.toCharArray()){
            System.out.print(c + " ");
            Thread.sleep(1000);
        }
        System.out.println();
    }
}