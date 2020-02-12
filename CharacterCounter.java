import java.util.*;
class CharacterCounter{
public static int countCharacter(String str, char ch){
	int count=0;
	String a=str.toLowerCase();
	for(char c='a';c<='z';c++){
		count=0;
		for(int i=0;i<str.length();i++){
			if(a.charAt(i)==ch)
				count++;
		}
	}
	return count;
}
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("enter a string");
	String str=s.nextLine();
	System.out.println("enter a character to find occurences");
	char ch=s.next().charAt(0);
	int count=countCharacter(str, ch);
	System.out.println("No. of occurences for "+ch+" :"+count);
}
}