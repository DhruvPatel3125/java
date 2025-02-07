import java.util.Scanner;
public class ov{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the String");
        String input = sc.nextLine();
        System.out.println("Choose an option(1 for vowels,2 for non-vowels)");
        int option = sc.nextInt();
        System.out.println("Displaying the result in uppercase? (true/false)");
        boolean isUpper = sc.nextBoolean();
        if(option==1){
            for(int i=0;i<input.length();i++){
                char ch = input.charAt(i);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    if(isUpper){
                        System.out.print(Character.toUpperCase(ch));
                    }
                    else{
                        System.out.print(ch);
                    }
                }
            }
        }
        else if(option==2){
            for(int i=0;i<input.length();i++){
                char ch = input.charAt(i);
                if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'){
                    if(isUpper){
                        System.out.print(Character.toUpperCase(ch));
                    }
                    else{
                        System.out.print(ch);
                    }
                }
            }
        }
        else{
            System.out.println("Invalid option");
        }
    }
}

