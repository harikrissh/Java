import java.util.*;
class SumofProductOddPositionNum{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter n value");
		int n=s.nextInt();
		System.out.println("Enter "+n+" integers");
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
			if(i%2==0){
				sum=sum+(a[i]*(i+1));
			}
		}
		System.out.println(sum);
	}
}