import java.util.*;
public class BalancedParentheses {
	public static void main(String[] args){
		Stack<Character> o=new Stack<Character>();
		Scanner s=new Scanner(System.in);
		String str=s.next();
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='{'||arr[i]=='('||arr[i]=='['){
				o.push(arr[i]);
			}
			if(arr[i]=='}'||arr[i]==')'||arr[i]==']'){
				o.pop();
			}
		}
		
		if(o.size()==0)
			System.out.println("balanced");
		if(o.size()!=0)
			System.out.println("unbalanced");
		s.close();
	}
}
