import java.util.*;
public class strings {

    

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the string");
    // String str = sc.nextLine();
    // sc.close();

    // System.out.println("Vowels in the string are: ");
    // for(int i = 0 ; i < str.length() ; i++){
    //     char ch = str.charAt(i);
    //     if(ch == 'a'|| ch == 'e'||ch=='i'||ch=='o'||ch=='u'){
    //         System.out.print(ch+"");
    //     }
    // }


    //count the number of vowels in the string
    // System.out.println("Enter the string");
    // String str = sc.nextLine();
    // sc.close();
    // int count = 0;
    // for(int i = 0 ; i < str.length() ; i++){
    //     char ch = str.charAt(i);
    //     if(ch == 'a'|| ch == 'e'||ch=='i'||ch=='o'||ch=='u'){
    //         count++;
    //     }
    // }
    // System.out.println("Number of vowels in the string are: "+count);


    // print only unique vovels in string

    // System.out.print("Enter the string: ");
    // String str = sc.nextLine();
    // sc.close();

    // System.out.print("Unique vowels in the string are: ");
    // for(int i = 0 ; i < str.length() ; i++){
    //     char ch = str.charAt(i);
    //     if(ch == 'a'|| ch == 'e'||ch=='i'||ch=='o'||
    //     ch=='u'){
    //         System.out.print(ch+" ");
    //         str = str.replace(ch, ' ');
    //     }
    //     }
    //     System.out.println("");
    //     }
    //     }

    //     //reverse the string
    //     System.out.print("Enter the string: ");
    //     String str = sc.nextLine();
    //     sc.close();
    //     String rev = "";
    //     for(int i = str.length()-1 ; i >= 0 ; i--){
    //         rev = rev + str.charAt(i);
    //     }
    //     System.out.println("Reversed string is: "+rev);
    //     }
    // }


    //check if the string is palindrome or not
    // System.out.print("Enter the string: ");
    // String str = sc.nextLine();
    // sc.close();
    // String rev = "";
    // for(int i = str.length()-1 ; i >= 0 ; i--){
    //     rev = rev + str.charAt(i);
    // }
    // if(str.equals(rev)){
    //     System.out.println("String is palindrome");
    // }
    // else{
    //     System.out.println("String is not palindrome");
    // }
    // }
    // }

    // replace vovels with * in string
    System.out.print("Enter the string: ");
    String str = sc.nextLine();
    sc.close();
    String newStr = str.replaceAll("[aeiouAEIOU]", "*");
    System.out.println("String after replacing vowels with *: "+newStr);
    }
    }
    

