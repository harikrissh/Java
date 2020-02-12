import java.util.*;
import java.lang.*;
class EvenIndexVowel{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] s1=s.toCharArray();
		for(int i=0;i<s1.length;i++){
			if((i%2!=0) && ((s1[i]=='a')||(s1[i]=='e')||(s1[i]=='i')||(s1[i]=='o')||(s1[i]=='u'))){
				s1[i]='\0';
			}
		}
		String newStr=String.valueOf(s1).replace("\0", "");
		System.out.println(newStr);
	}
}
