import java.util.*;

public class SumPalindrome {
	public static int getPalindromeSum(List<Integer> list){
		int sum=0;
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()){
			int num=itr.next();
			String n=String.valueOf(num);
			StringBuffer n1=new StringBuffer(n);
			n1.reverse();
			String nRev=String.valueOf(n1);
			if(n.equals(nRev)){				
				sum=sum+Integer.parseInt(n);
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		List<Integer> list=new ArrayList<Integer>();
		System.out.println("Enter from and to range..");
		int f=s.nextInt(), t=s.nextInt();
		for(int i=f; i<=t; i++){
			list.add(i);
		}
		int sum=getPalindromeSum(list);
		System.out.println("\nSum of palindrome numbers between "+f+" and "+t+" -> "+sum);
	}
}
