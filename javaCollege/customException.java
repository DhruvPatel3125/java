import java.util.Scanner;

public class customException{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

	System.out.print("Enter first string: ");
	String s1 = sc.nextLine();

	System.out.print("Enter second string:");
	String s2 = sc.nextLine();

    StringBuilder merged = new StringBuilder();

	int length1 = s1.length();
	int length2 = s2.length();
	int maxLength = Math.max(length1, length2);

for(int i=0;i<maxLength;i++){
	if(i<length1){
		merged.append(s1.charAt(i));
}
	if(i<length2){
		merged.append(s2.charAt(i));
}

}
System.out.println("Merged string:"+merged.toString());
sc.close();
}
}
