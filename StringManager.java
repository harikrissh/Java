import java.lang.StringBuffer;
import java.util.Scanner;
public class StringManager{
public static String insertString(String str , String str2, char ch){
	String result="";
	StringBuffer sb=new StringBuffer(str);
	if(str.contains(String.valueOf(ch))){
		int position=str.indexOf(String.valueOf(ch));
		sb.insert(position, str2);
	}	
	result=String.valueOf(sb);
	return result;
}
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("enter a string..");
	String str=s.nextLine();
	System.out.println("enter another string..");
	String str2=s.nextLine();
	System.out.println("enter a character..");
	char c=s.next().charAt(0);
	String resStr=insertString(str, str2, c);
	System.out.println("After inserting..\n"+resStr);
		
}
}