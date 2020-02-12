import java.lang.*;
import java.util.*;
class ConcatExample{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String str1=s.next(),str2=s.next();
		int l1=str1.length(), l2=str2.length(), diff=0;

		if(l1>l2){
			diff=l1-l2;
			System.out.println(str1.substring(diff).concat(str2));
		}
		else{
			diff=l2-l1;
			System.out.println(str1.concat(str2.substring(diff)));
		}
	}
}