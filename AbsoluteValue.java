import java.util.*;
import java.lang.*;
class AbsoluteValue{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String str=s.next();
		try{
			int num=Integer.parseInt(str);
			if(num<0)
			System.out.println(Math.abs(num));
		}catch(NumberFormatException e){
			System.out.println("-1");
		}
	}
}