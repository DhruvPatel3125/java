import java.util.Scanner;
public class strind1 {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String input = Scanner.nextLine();

        int letters = 0,spaces = 0, number = 0, others = 0;
        for(char ch:input.toCharArray()){
            if(Character.isLetter(ch)){
                letters++;
            }else if(Character.isDigit(ch)){
                number++;
            }
            else if(Character.isWhitespace(ch)){
                spaces++;
            }
            else{
                others++;
            }
        }
        System.err.println("\nCharacter count:");
        System.out.println("Letters:"+letters);
        System.out.println("Spaces:"+spaces);
        System.out.println("numbers: "+number);
        System.err.println("others characters: "+others);

    }
}
