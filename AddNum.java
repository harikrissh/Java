import java.lang.*;
import java.util.*;
class AddNum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of strings");
		int n=sc.nextInt();
		int sum=0;
		String[] a=new String[n];
		System.out.println("Enter "+n+" strings");
		System.out.println(a.length);
		for(int i=0;i<a.length;i++){	
			a[i]=sc.next();
		}
		for(int i=0;i<a.length;i++){
			String s=String.valueOf(a[i]);
			for(int j=0;j<s.length();j++){
				if(Character.isDigit(s.charAt(j))){
					int num=Integer.parseInt(String.valueOf(s.charAt(j)));
					sum=sum+num;
				}
			}
		}
		System.out.println("\nSum: "+sum);
		
	}
}