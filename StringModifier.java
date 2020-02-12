import java.lang.StringBuffer;
import java.util.Scanner;
public class StringModifier{
public static String insertCharacter(String str , char c, int position){
	String result="";
	StringBuffer sb=new StringBuffer(str);
	sb.insert(position-1, c);
	result=String.valueOf(sb);
	return result;
}
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("enter a string..");
	String str=s.nextLine();
	System.out.println("enter a character and position to insert..");
	char c=s.next().charAt(0);
	int pos=s.nextInt();
	String resStr=insertCharacter(str, c, pos);
	System.out.println("After inserting..\n"+resStr);
		
}
}