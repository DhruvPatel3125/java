public class characterdelay {
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("Please enter a string as a command line argument");
            return;
        }
        String input = args[0].toUpperCase();

        for (int i = 0; i < input.length(); i++){
            System.out.println(input.charAt(i));
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(("Somthing went wrong"));
            }
        }
    }
}
