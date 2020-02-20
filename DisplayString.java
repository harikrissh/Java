import java.util.*;
public class DisplayString {
	public static String getAllString(String[] ele){
		String allString="";
		for(int i=0;i<ele.length;i++){
			allString+=ele[i]+" ";
		}
		return allString;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		List<String> list=new ArrayList<String>();
		System.out.println("Enter number of strings");
		int num=s.nextInt();
		System.out.println("Enter "+num+" strings");
		for(int i=0;i<num;i++){
			String addString=s.next();
			list.add(addString);
		}
		String[] arr = new String[list.size()];
		arr = list.toArray(arr);
		System.out.println();
		String myStrings=getAllString(arr);
		System.out.println(myStrings);
	}
}
