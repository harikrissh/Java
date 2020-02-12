import java.util.*;
import java.lang.*;
class StringFormedByLastChar{
	public static String formStringByLastChar(ArrayList<String> obj){
		String myStr="";
		Iterator i=obj.iterator();
		while(i.hasNext()){
			String next=i.next().substring(i.next().length()-1);
			myStr=myStr+next;
		}
		return myStr;
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		ArrayList<String> list1=new ArrayList<String>();
		System.out.println("Enter number of elements..");
		int n=s.nextInt();
		System.out.println("Enter "+n+" elements..");
		String[] elements=new String[n];
		for(int i=0;i<n;i++){
			elements[i]=s.next();
		}
		Collections.addAll(list1, elements);
		String str=formStringByLastChar(list1);
		System.out.println("\n"+str);
	}
}