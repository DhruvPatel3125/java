
// Write a Java Program to Display string with capital letter which are inputted through command
// lin. Display those string(s) which starts with “B”

public class p1 {
    public static void main(String[] args) {
      if(args.length == 0) {
        System.out.println("Ball");
        return;
      }
       System.out.println("String staring with 'b':");
       for (String str : args){
        if(str.startsWith("B")){
            System.out.println(str);
        }
       }
        
    }
}
