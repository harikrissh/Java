import java.util.*;

class CountWords{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		StringTokenizer words=new StringTokenizer(str);		
		System.out.println(words.countTokens());
	}
}