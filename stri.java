import java.util.Scanner;

public class stri{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String input = sc.nextLine();

        System.out.println("choose an option:");
        System.out.println("1. Uppercase");
        System.out.println("2. Lowercase");
        System.out.println("3. Sentence case");
        System.out.println("4. Toggle case");

        int choice = sc.nextInt();
        sc.nextLine();
        switch(choice){
            case1:
            System.out.println(input.toUpperCase());
            break;
            case2:
            System.out.println(input.toLowerCase());
            break;
            case3:
            String[] words = input.split(" ");
            for(String word : words){
                System.out.print(word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase()+" ");
            }
            System.out.println();
            break;
            case4:
            char[] chars = input.toCharArray();
            for(char ch : chars){
                if(Character.isUpperCase(ch)){
                    System.out.print(Character.toLowerCase(ch));
                }else{
                    System.out.print(Character.toUpperCase(ch));
                }
            }
            System.out.println();
            break;
            
        }
    }
}