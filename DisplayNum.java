import java.util.*;
import java.lang.*;
class DisplayNum{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number (eg:123-456-7890)");
		String str=s.next();
		String[] values = str.split("-");
		try{
			int part1 = Integer.parseInt(values[0]);
        	int part2 = Integer.parseInt(values[1]);
        	int part3 = Integer.parseInt(values[2]);
        	String str2=Integer.toString(part1)+Integer.toString(part2)+Integer.toString(part3);
        	String str3=String.join("-",str2.substring(0,2),str2.substring(2,4),str2.substring(4,7),str2.substring(7,str2.length()));
        	System.out.println("\n"+str3);
		}catch(NumberFormatException ne){
			System.out.println("Enter numbers only!");
		}
        
   
	}
}